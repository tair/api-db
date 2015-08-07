/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.phoenixbioinformatics.api.bs.api;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigInteger;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.junit.Test;
import org.phoenixbioinformatics.api.db.api.ApiFactory;
import org.phoenixbioinformatics.api.db.api.IPartner;
import org.phoenixbioinformatics.api.db.api.IParty;
import org.phoenixbioinformatics.api.db.api.ISubscription;

import com.poesys.bs.delegate.DelegateException;
import com.poesys.cartridges.db.utilities.StringUtilities;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.db.pk.NaturalPrimaryKey;
import com.poesys.db.pk.SequencePrimaryKey;


/**
 * <p>
 * A test class for the PartyDelegate class. This class is the concrete subclass
 * of the generated abstract class. Make any changes to DTO behavior by
 * overriding methods here rather than changing the abstract superclass;
 * AndroMDA will overwrite that class when you run it but will never overwrite
 * this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PartyDelegateTest extends
    org.phoenixbioinformatics.api.bs.api.AbstractPartyDelegateTest {

  private static final String DEFAULT_PARTNER = "tair";

  @Override
  protected List<BsLogin> createApiLogin(IParty parent, int count)
      throws DelegateException, InvalidParametersException {
    java.util.List<BsLogin> objects = new ArrayList<BsLogin>();

    for (int i = 0; i < count; i++) {
      String username = StringUtilities.generateString(100);
      String password = StringUtilities.generateString(100);
      String email = StringUtilities.generateString(100);
      String institution = StringUtilities.generateString(100);
      String userIdentifier = StringUtilities.generateString(100);
      BsLogin login =
        delegate.createLogin(new BsParty(parent),
                             parent.getPartyId(),
                             username,
                             password,
                             email,
                             institution,
                             userIdentifier,
                             DEFAULT_PARTNER); // use default partner
      objects.add(login);
    }

    return objects;
  }

  @Override
  protected java.util.List<BsIpRange> createApiIpRange(org.phoenixbioinformatics.api.db.api.IParty parent,
                                                       int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    java.util.List<BsIpRange> objects = new ArrayList<BsIpRange>();

    for (int i = 0; i < count; i++) {
      String start = createIpAddress();
      String end = createIpAddress();
      BsIpRange range =
        delegate.createIpRange(new BsParty(parent),
                               parent.getPartyId(),
                               start,
                               end);
      objects.add(range);
    }

    return objects;
  }

  /**
   * Create a random IPv4 address (nnn.nnn.nnn.nnn).
   *
   * @return a string representation of the IP address
   */
  private String createIpAddress() {
    Random r = new Random();
    // Create a random IPv4 IP address.
    String ip =
      new Integer(r.nextInt(255)).toString() + '.'
          + new Integer(r.nextInt(255)).toString() + '.'
          + new Integer(r.nextInt(255)).toString() + '.'
          + new Integer(r.nextInt(255)).toString();
    return ip;
  }

  @Override
  protected java.util.List<BsSubscriptionTransaction> createApiSubscriptionTransaction(org.phoenixbioinformatics.api.db.api.IParty parent,
                                                                                       int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    // TODO the "parent" should probably be an ISubscription, not an IParty.
    // Bug?
    java.util.List<BsSubscriptionTransaction> objects =
      new ArrayList<BsSubscriptionTransaction>();

    // Get the subscription object from the party.
    Collection<ISubscription> subscriptions = null;
    try {
      subscriptions = parent.getSubscription();
    } catch (SQLException e) {
      throw new DelegateException("SQL exception while getting subscription from parent party",
                                  e);
    }
    if (subscriptions == null || subscriptions.size() == 0) {
      throw new DelegateException("Must have subscription list in party to create transactions");
    }
    ISubscription parentSubscription = null;
    for (ISubscription subscription : subscriptions) {
      parentSubscription = subscription;
      break; // take the first one in the collection
    }
    if (parentSubscription == null) {
      throw new DelegateException("Must have subscription in party to create transactions");
    }
    for (int i = 0; i < count; i++) {
      Timestamp transactionDate = new Timestamp(System.currentTimeMillis());
      Timestamp startDate = new Timestamp(System.currentTimeMillis());
      Timestamp endDate =
        new Timestamp(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 365);
      String transactionType = i == 0 ? "Initial" : "Renewal";
      UUID activationCodeId;
      try {
        activationCodeId =
          createDatabaseActivationCode(new BsPartner(parentSubscription.getPartner()));
      } catch (SQLException e) {
        throw new DelegateException("SQL Exception when creating activation code");
      }
      // Use default partner, TAIR #1
      BsSubscriptionTransaction trans =
        delegate.createSubscriptionTransaction(new BsSubscription(parentSubscription),
                                               "yfd",
                                               parent.getPartyId(),
                                               BigInteger.valueOf(i),
                                               transactionDate,
                                               startDate,
                                               endDate,
                                               transactionType,
                                               activationCodeId);
      objects.add(trans);
    }

    return objects;
  }

  @Override
  protected java.util.List<org.phoenixbioinformatics.api.bs.api.BsSubscription> createApiSubscription(java.util.List<org.phoenixbioinformatics.api.db.api.IPartner> partnersList,
                                                                                                      java.util.List<org.phoenixbioinformatics.api.db.api.IParty> subscribersList,
                                                                                                      int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    java.util.List<BsSubscription> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsSubscription>();

    // Check the input requirements. The input lists must each have at
    // least count objects as they must map objects one-to-one.
    if (partnersList.size() < count) {
      org.junit.Assert.fail("createApiSubscription partnersList list has "
                            + partnersList.size()
                            + " elements but needs at least " + count);
    }
    if (subscribersList.size() < count) {
      org.junit.Assert.fail("createApiSubscription subscribersList list has "
                            + subscribersList.size()
                            + " elements but needs at least " + count);
    }

    // implement child creation by mapping the objects in the input lists
    // one-to-one

    PartyDelegate delegate = ApiDelegateFactory.getPartyDelegate();

    for (int i = 0; i < count; i++) {
      BsPartner partnersObject = new BsPartner(partnersList.get(i));
      BsParty subscribersObject = new BsParty(subscribersList.get(i));

      Timestamp startDate = new Timestamp(System.currentTimeMillis());
      Timestamp endDate =
        new Timestamp(System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 365));
      BigInteger subscriptionId =
        ApiDelegateFactory.getPartnerDelegate().getSubscriptionId();
      BsSubscription subscription =
        delegate.createSubscription(partnersObject,
                                    subscribersObject,
                                    partnersObject.getPartnerId(),
                                    subscribersObject.getPartyId(),
                                    startDate,
                                    endDate,
                                    subscriptionId);
      // Add an initial transaction.
      Timestamp transactionDate = new Timestamp(System.currentTimeMillis());
      String transactionType = "Initial";
      UUID activationCodeId = createDatabaseActivationCode(partnersObject);
      BsSubscriptionTransaction transaction =
        delegate.createSubscriptionTransaction(subscription,
                                               partnersObject.getPartnerId(),
                                               subscribersObject.getPartyId(),
                                               BigInteger.ONE,
                                               transactionDate,
                                               startDate,
                                               endDate,
                                               transactionType,
                                               activationCodeId);
      subscription.addSubscriptionTransactionsSubscriptionTransaction(transaction);
      objects.add(subscription);
    }

    return objects;
  }

  /**
   * Create and store an activation code object in the database. The UUID is
   * generated randomly.
   *
   * @param partner the partner
   * @return the UUID
   */
  private UUID createDatabaseActivationCode(BsPartner partner) {
    // Add a random activation code.
    ActivationCodeDelegate codeDelegate =
      ApiDelegateFactory.getActivationCodeDelegate();
    BsActivationCode code =
      codeDelegate.createActivationCode(null,
                                        12,
                                        new Timestamp(System.currentTimeMillis()),
                                        partner.getPartnerId());
    List<BsActivationCode> codeList = new ArrayList<BsActivationCode>(1);
    codeList.add(code);
    codeDelegate.insert(codeList);
    return code.getActivationCodeId();
  }

  /**
   * Test creating a subscription to TAIR from a new party.
   * 
   * @throws SQLException when there is a lazy-loading problem
   */
  @Test
  public void testCreateSubscription() throws SQLException {
    List<BsParty> bsParties = null;
    try {
      bsParties = createSubscription();
    } catch (InvalidParametersException e) {
      fail("Invalid parameter error: " + e.getMessage());
    } catch (DelegateException e) {
      fail("Delegate error: " + e.getMessage());
    } catch (DtoStatusException e) {
      fail("Invalid status error: " + e.getMessage());
    } finally {
      // Delete the party, which deletes the other created objects in a cascade
      // delete.
      if (bsParties != null) {
        for (BsParty party : bsParties) {
          // Mark for delete.
          party.delete();
        }
        delegate.process(bsParties);
      }
    }
  }

  /**
   * Create a new subscription with a new party and the default partner. This is
   * a utility method called from several tests. The caller should delete the
   * party returned, which also deletes the subscription and its transactions.
   * The method can create one or two subscriptions depending on the flag.
   * 
   * @throws SQLException when there is a problem with lazy-loading
   */
  private List<BsParty> createSubscription() throws SQLException {
    // Query the TAIR partner.
    IPrimaryKey key = ApiFactory.getPartnerPrimaryKey(DEFAULT_PARTNER);
    BsPartner partner =
      ApiDelegateFactory.getPartnerDelegate().getObject((NaturalPrimaryKey)key);
    assertTrue("No default partner queried", partner != null);
    List<IPartner> partners = new ArrayList<IPartner>(1);
    partners.add(partner.toDto());

    List<BsParty> bsParties = null;
    // Insert a new party for the test.
    bsParties = createApiParty(1);
    BsParty party = bsParties.get(0);
    assertTrue("No party created", party != null);
    delegate.insert(bsParties);
    // Create the DTO list.
    List<IParty> parties = new ArrayList<IParty>(bsParties.size());
    parties.add(bsParties.get(0).toDto());

    // Create the subscription.
    List<BsSubscription> subscriptions =
      createApiSubscription(partners, parties, 1);
    assertTrue("No subscription list created", subscriptions != null);
    BsSubscription subscription = subscriptions.get(0);
    assertTrue("No subscription created", subscription != null);

    // Add the subscription to the party.
    party.addSubscriptionSubscription(subscription);

    // Test the transactions.
    assertTrue("No transaction list created",
               subscription.getSubscriptionTransactions() != null);
    assertTrue("No transactions in transaction list",
               subscription.getSubscriptionTransactions().size() > 0);
    BsSubscriptionTransaction trans =
      subscription.getSubscriptionTransactions().get(0);
    assertTrue("No initial transaction created", trans != null);
    assertTrue("Transaction type should be Initial but is "
                   + trans.getTransactionType(),
               trans.getTransactionType().equalsIgnoreCase("Initial"));
    // Process the changes.
    delegate.process(bsParties);
    return bsParties;
  }

  /**
   * Renew a subscription, adding a "Renewal" subscription transaction. Used to
   * add to the subscription created in createSubscription().
   *
   * @param party the party to renew
   * @throws SQLException when there is a lazy loading problem
   */
  private void addRenew(BsParty party) throws SQLException {
    Collection<BsSubscription> subscriptions = party.getSubscription();
    assertTrue("No subscription collection for party", subscriptions != null);
    BsSubscription subscription = subscriptions.iterator().next();
    assertTrue("No subscription for party", subscription != null);
    List<BsSubscriptionTransaction> transactions =
      subscription.getSubscriptionTransactions();
    assertTrue("No transaction list for subscription", transactions != null);
    Timestamp startDate = subscription.getStartDate();
    Timestamp endDate = subscription.getEndDate();
    String transactionType = "Renewal";

    BsActivationCode code = createActivationCode();

    BsSubscriptionTransaction renewal =
      delegate.createSubscriptionTransaction(subscription,
                                             subscription.getPartnerId(),
                                             party.getPartyId(),
                                             new BigInteger("2"),
                                             new Timestamp(System.currentTimeMillis()),
                                             startDate,
                                             endDate,
                                             transactionType,
                                             code.getActivationCodeId());
    assertTrue("No transaction created", renewal != null);
    subscription.addSubscriptionTransactionsSubscriptionTransaction(renewal);
    // Update the subscription end date to one year from now.
    subscription.setEndDate(new Timestamp(System.currentTimeMillis() + 1000
                                          * 60 * 60 * 24 * 365 + 1000 * 60 * 60
                                          * 12));
    // Update the subscription in the database.
    List<BsParty> parties = new ArrayList<BsParty>(1);
    parties.add(party);
    delegate.process(parties);
  }

  /**
   * Create and store an activation code in the database.
   *
   * @return the code business object
   */
  private BsActivationCode createActivationCode() {
    BsActivationCode code;
    ActivationCodeDelegate codeDelegate =
      ApiDelegateFactory.getActivationCodeDelegate();
    code =
      codeDelegate.createActivationCode(null,
                                        12,
                                        new Timestamp(System.currentTimeMillis()),
                                        "yfd");
    assertTrue("No activation code created", code != null);
    List<BsActivationCode> codes = new ArrayList<BsActivationCode>(1);
    codes.add(code);
    codeDelegate.insert(codes);
    return code;
  }

  /**
   * Create a subscription to TAIR from a new party, then renew it, adding a
   * year.
   * 
   * @throws SQLException when there is a lazy loading problem
   */
  @Test
  public void testRenewSubscription() throws SQLException {
    List<BsParty> bsParties = null;
    try {
      bsParties = createSubscription();
      // Extract the end date for later comparison
      BsSubscription subscription =
        getSubscriptionFromSingleParty(bsParties.get(0));
      Timestamp endDate = subscription.getEndDate();
      addRenew(bsParties.get(0));
      IPrimaryKey key = bsParties.get(0).getPrimaryKey();
      BsParty dbParty = delegate.getDatabaseObject((SequencePrimaryKey)key);
      assertTrue("No party in database", dbParty != null);
      // Test the end date
      Timestamp dbEndDate =
        dbParty.getSubscription().iterator().next().getEndDate();
      assertTrue("end date not greater after renewal",
                 dbEndDate.compareTo(endDate) > 0);
      // Test the transaction for a renewal transaction.
      boolean foundRenewal = false;
      for (BsSubscriptionTransaction trans : dbParty.getSubscription().iterator().next().getSubscriptionTransactions()) {
        if (trans.getTransactionType().equals("Renewal")) {
          foundRenewal = true;
          break;
        }
      }
      assertTrue("No renewal transaction in database", foundRenewal);
    } catch (InvalidParametersException e) {
      logger.debug("Invalid parameter", e);
      fail("Invalid parameter error: " + e.getMessage());
    } catch (DelegateException e) {
      logger.error("Delegate exception", e);
      fail("Delegate error: " + e.getMessage());
    } catch (DtoStatusException e) {
      fail("Invalid status error: " + e.getMessage());
    } finally {
      // Delete the party, which deletes the other created objects in a cascade
      // delete.
      if (bsParties != null) {
        for (BsParty party : bsParties) {
          // Mark for delete.
          party.delete();
        }
        delegate.process(bsParties);
      }
    }
  }

  /**
   * A utility method to get a subscription from a party.
   *
   * @param bsParties the list of parties
   * @throws SQLException when there is a lazy-loading problem
   */
  private BsSubscription getSubscriptionFromSingleParty(BsParty party)
      throws SQLException {
    assertTrue("No party created", party != null);
    Collection<BsSubscription> subscriptions = party.getSubscription();
    assertTrue("No subscription collection created", subscriptions != null);
    assertTrue("No subscription created", subscriptions.size() > 0);
    BsSubscription subscription = subscriptions.iterator().next();
    assertTrue("No subscription in collection", subscription != null);
    return subscription;
  }

  /**
   * Create a subscription to TAIR from a new party, then delete it.
   * 
   * @throws SQLException when there is a lazy-loading problem
   */
  @Test
  public void testDeleteSubscription() throws SQLException {
    List<BsParty> bsParties = null;
    try {
      bsParties = createSubscription();
      // Save the primary key for later comparison.
      BsSubscription subscription =
        getSubscriptionFromSingleParty(bsParties.get(0));
      IPrimaryKey subscriptionKey = subscription.getPrimaryKey();
      subscription.delete();
      delegate.process(bsParties);
      // Test to make sure the subscription was deleted.
      IPrimaryKey key = bsParties.get(0).getPrimaryKey();
      BsParty dbParty = delegate.getDatabaseObject((SequencePrimaryKey)key);
      assertTrue("No test party in database", dbParty != null);
      Collection<BsSubscription> subscriptions = dbParty.getSubscription();
      assertTrue("No subscription list", subscriptions != null);
      if (subscriptions.size() > 0) {
        // There are subscriptions, check for the deleted one.
        for (BsSubscription dbSubscription : subscriptions) {
          if (dbSubscription.getPrimaryKey().equals(subscriptionKey)) {
            fail("Subscription not deleted in database");
          }
        }
      }
    } catch (InvalidParametersException e) {
      fail("Invalid parameter error: " + e.getMessage());
    } catch (DelegateException e) {
      fail("Delegate error: " + e.getMessage());
    } catch (DtoStatusException e) {
      fail("Invalid status error: " + e.getMessage());
    } finally {
      // Delete the party, which deletes the other created objects in a cascade
      // delete.
      if (bsParties != null) {
        for (BsParty party : bsParties) {
          // Mark for delete.
          party.delete();
        }
        delegate.process(bsParties);
      }
    }
  }

  @Override
  public void testTruncateTable() {
    // Truncate usually is hard; super.testTruncateTable() if desired
  }

  @Override
  public void testGetAllObjects() {
    super.testGetAllObjects();
  }

  @Override
  protected String getSubsystem() {
    // return explicit subsystem name
    return "org.phoenixbioinformatics.api.db.api";
    // use super.getSubsystem() to get default subsystem name if needed
  }

  @Override
  protected List<BsCountry> createCountryApiCountry(int count)
      throws DelegateException, InvalidParametersException {
    java.util.List<BsCountry> objects = new ArrayList<BsCountry>();

    // Use New Zealand for the country associated with the party
    IPrimaryKey key = ApiFactory.getCountryPrimaryKey(new BigInteger("139"));
    BsCountry country =
      ApiDelegateFactory.getCountryDelegate().getObject((SequencePrimaryKey)key);

    for (int i = 0; i < count; i++) {
      objects.add(country);
    }

    return objects;
  }
}
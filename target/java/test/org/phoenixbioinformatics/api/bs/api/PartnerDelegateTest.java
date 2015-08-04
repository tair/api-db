/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.phoenixbioinformatics.api.bs.api;


import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Random;
import java.util.UUID;

import com.poesys.cartridges.db.utilities.StringUtilities;


/**
 * <p>
 * A test class for the PartnerDelegate class. This class is the concrete
 * subclass of the generated abstract class. Make any changes to DTO behavior by
 * overriding methods here rather than changing the abstract superclass;
 * AndroMDA will overwrite that class when you run it but will never overwrite
 * this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PartnerDelegateTest extends
    org.phoenixbioinformatics.api.bs.api.AbstractPartnerDelegateTest {

  @Override
  protected java.util.List<BsPartnerPattern> createApiPartnerPattern(org.phoenixbioinformatics.api.db.api.IPartner parent,
                                                                     int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    java.util.List<BsPartnerPattern> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsPartnerPattern>();

    for (int i = 0; i < count; i++) {
      String sourceUri = StringUtilities.generateString(200);
      String targetUri = StringUtilities.generateString(200);
      BsPartnerPattern pattern =
        delegate.createPartnerPattern(new BsPartner(parent),
                                      parent.getPartnerId(),
                                      sourceUri,
                                      targetUri);
      objects.add(pattern);
    }

    return objects;
  }

  @Override
  protected java.util.List<BsSubscriptionTerm> createApiSubscriptionTerm(org.phoenixbioinformatics.api.db.api.IPartner parent,
                                                                         int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    java.util.List<BsSubscriptionTerm> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsSubscriptionTerm>();
    Random r = new Random();

    for (int i = 0; i < count; i++) {
      Integer period = r.nextInt();
      Double price = r.nextDouble();
      Double groupDiscountPercentage = r.nextDouble();
      String description = StringUtilities.generateString(200);
      BsSubscriptionTerm term =
        delegate.createSubscriptionTerm(new BsPartner(parent),
                                        parent.getPartnerId(),
                                        period,
                                        price,
                                        groupDiscountPercentage,
                                        description);
      objects.add(term);
    }

    return objects;
  }

  @Override
  protected java.util.List<BsSubscriptionDescriptionItem> createApiSubscriptionDescriptionItem(org.phoenixbioinformatics.api.db.api.IPartner parent,
                                                                                               int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    java.util.List<BsSubscriptionDescriptionItem> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsSubscriptionDescriptionItem>();

    // header is part of description, so use one for all items.
    String header = StringUtilities.generateString(200);

    for (long i = 0; i < count; i++) {
      String text = StringUtilities.generateString(2048);
      BsSubscriptionDescriptionItem item =
        delegate.createSubscriptionDescriptionItem(new BsPartner(parent),
                                                   header,
                                                   parent.getPartnerId(),
                                                   BigInteger.valueOf(i),
                                                   text);
      objects.add(item);
    }

    return objects;
  }

  @Override
  protected java.util.List<BsSubscriptionDescription> createApiSubscriptionDescription(org.phoenixbioinformatics.api.db.api.IPartner parent,
                                                                                       int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    java.util.List<BsSubscriptionDescription> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsSubscriptionDescription>();

    for (long i = 0; i < count; i++) {
      String header = StringUtilities.generateString(200);
      String descriptionType = "Default";
      BsSubscriptionDescription description =
        delegate.createSubscriptionDescription(new BsPartner(parent),
                                               parent.getPartnerId(),
                                               header,
                                               descriptionType);
      objects.add(description);
    }

    return objects;
  }

  @Override
  protected java.util.List<BsIpCount> createApiIpCount(org.phoenixbioinformatics.api.db.api.IPartner parent,
                                                       int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    Random r = new Random();
    java.util.List<BsIpCount> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsIpCount>();

    for (long i = 0; i < count; i++) {
      // Create a random IPv4 IP address.
      String ip =
        new Integer(r.nextInt(255)).toString() + '.'
            + new Integer(r.nextInt(255)).toString() + '.'
            + new Integer(r.nextInt(255)).toString() + '.'
            + new Integer(r.nextInt(255)).toString();
      Integer randomCount = r.nextInt();
      BsIpCount ipCount =
        delegate.createIpCount(new BsPartner(parent),
                               parent.getPartnerId(),
                               ip,
                               randomCount);
      objects.add(ipCount);
    }

    return objects;
  }

  @Override
  protected java.util.List<BsLimitValue> createApiLimitValue(org.phoenixbioinformatics.api.db.api.IPartner parent,
                                                             int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    java.util.List<BsLimitValue> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsLimitValue>();

    for (int i = 0; i < count; i++) {
      BsLimitValue value =
        delegate.createLimitValue(new BsPartner(parent),
                                  parent.getPartnerId(),
                                  i + 7);
      objects.add(value);
    }

    return objects;
  }

  @Override
  protected java.util.List<org.phoenixbioinformatics.api.bs.api.BsAccessRule> createApiAccessRule(java.util.List<org.phoenixbioinformatics.api.db.api.IAccessType> accessTypesList,
                                                                                                  java.util.List<org.phoenixbioinformatics.api.db.api.IPartner> partnerList,
                                                                                                  java.util.List<org.phoenixbioinformatics.api.db.api.IUriPattern> uriPatternsList,
                                                                                                  int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    java.util.List<BsAccessRule> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsAccessRule>();

    // Check the input requirements. The input lists must each have at
    // least count objects as they must map objects one-to-one.
    if (accessTypesList.size() < count) {
      org.junit.Assert.fail("createApiAccessRule accessTypesList list has "
                            + accessTypesList.size()
                            + " elements but needs at least " + count);
    }
    if (partnerList.size() < count) {
      org.junit.Assert.fail("createApiAccessRule partnerList list has "
                            + partnerList.size()
                            + " elements but needs at least " + count);
    }
    if (uriPatternsList.size() < count) {
      org.junit.Assert.fail("createApiAccessRule uriPatternsList list has "
                            + uriPatternsList.size()
                            + " elements but needs at least " + count);
    }

    // implement child creation by mapping the objects in the input lists
    // one-to-one

    PartnerDelegate delegate = ApiDelegateFactory.getPartnerDelegate();

    for (int i = 0; i < count; i++) {
      BsAccessType accessTypesObject = new BsAccessType(accessTypesList.get(i));
      BsPartner partnerObject = new BsPartner(partnerList.get(i));
      BsUriPattern uriPatternsObject = new BsUriPattern(uriPatternsList.get(i));

      BsAccessRule link =
        delegate.createAccessRule(accessTypesObject,
                                  partnerObject,
                                  uriPatternsObject,
                                  accessTypesObject.getAccessTypeId(),
                                  uriPatternsObject.getUriPatternId(),
                                  partnerObject.getPartnerId(),
                                  partnerObject.toDto());
      objects.add(link);
    }

    return objects;
  }

  @Override
  protected java.util.List<BsSubscriptionTransaction> createApiSubscriptionTransaction(org.phoenixbioinformatics.api.db.api.IPartner parent,
                                                                                       int count)
      throws com.poesys.bs.delegate.DelegateException,
      com.poesys.db.InvalidParametersException,
      com.poesys.db.dto.DtoStatusException {
    Random r = new Random();
    java.util.List<BsSubscriptionTransaction> objects =
      new java.util.concurrent.CopyOnWriteArrayList<BsSubscriptionTransaction>();

    for (int i = 0; i < count; i++) {
      // Use default Phoenix party as party reference, id 1
      BigInteger partyId = BigInteger.ONE;
      BigInteger transactionNo = BigInteger.valueOf(i);
      Timestamp transactionDate = new Timestamp(System.currentTimeMillis());
      Timestamp startDate = new Timestamp(System.currentTimeMillis());
      Timestamp endDate = new Timestamp(System.currentTimeMillis() + 1000*60*60*24*365);
      UUID activationCodeId = new UUID(r.nextLong(), r.nextLong());
      String transactionType = i == 0 ? "Initial" : "Renewal";
      BsSubscriptionTransaction transaction =
        delegate.createSubscriptionTransaction(new BsPartner(parent),
                                  parent.getPartnerId(), partyId , transactionNo, transactionDate, startDate, endDate, transactionType, activationCodeId );
      objects.add(transaction);
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

    PartnerDelegate delegate = ApiDelegateFactory.getPartnerDelegate();

    for (int i = 0; i < count; i++) {
      BsPartner partnersObject = new BsPartner(partnersList.get(i));
      BsParty subscribersObject = new BsParty(subscribersList.get(i));

      Timestamp startDate = new Timestamp(System.currentTimeMillis());
      Timestamp endDate =
        new Timestamp(System.currentTimeMillis() * 1000 * 60 * 60 * 24 * 365);
      Long subscriptionId = delegate.getSubscriptionId();
      BsSubscription link =
        delegate.createSubscription(partnersObject,
                                    subscribersObject,
                                    partnersObject.getPartnerId(),
                                    subscribersObject.getPartyId(),
                                    startDate,
                                    endDate,
                                    subscriptionId);
      objects.add(link);
    }

    return objects;
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
}
/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.phoenixbioinformatics.api.bs.api;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.Test;
import org.phoenixbioinformatics.api.db.api.ApiFactory;
import org.phoenixbioinformatics.api.db.api.IAccessType;
import org.phoenixbioinformatics.api.db.api.IPartner;
import org.phoenixbioinformatics.api.db.api.IUriPattern;

import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.db.pk.NaturalPrimaryKey;
import com.poesys.db.pk.SequencePrimaryKey;


/**
 * <p>
 * A test class for the AccessTypeDelegate class. This class is the concrete
 * subclass of the generated abstract class. Make any changes to DTO behavior by
 * overriding methods here rather than changing the abstract superclass;
 * AndroMDA will overwrite that class when you run it but will never overwrite
 * this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class AccessTypeDelegateTest extends
    org.phoenixbioinformatics.api.bs.api.AbstractAccessTypeDelegateTest {

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

    AccessTypeDelegate delegate = ApiDelegateFactory.getAccessTypeDelegate();

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
  public void testTruncateTable() {
    // Truncate usually is hard; super.testTruncateTable() if desired
  }

  @Override
  public void testGetAllObjects() {
    super.testGetAllObjects();
  }

  /**
   * Test creating an access-rule association object using a test access type
   * and uri pattern.
   * 
   * @throws SQLException when there is a problem querying the rules from the
   *           access type
   */
  @Test
  public void createAccessRuleTest() throws SQLException {
    // Create a new AccessType object to perform the test.
    List<BsAccessType> types = null;
    List<BsUriPattern> patterns = null;
    try {
      types = createApiAccessType(1);
      assertTrue("No object created", types.get(0) != null);
      delegate.insert(types);

      // Create a new UriPattern object to perform the test.
      patterns = createApiUriPattern(1);
      assertTrue("No object created", patterns.get(0) != null);
      ApiDelegateFactory.getUriPatternDelegate().insert(patterns);

      // Use the default partner #1 in a partner list.
      List<BsPartner> partners = new ArrayList<BsPartner>();
      IPrimaryKey partnerKey = ApiFactory.getPartnerPrimaryKey("tair");
      partners.add(ApiDelegateFactory.getPartnerDelegate().getObject((NaturalPrimaryKey)partnerKey));

      // Create the rule.
      List<BsAccessRule> rules =
        createApiAccessRule(getDbTypeList(types),
                            getDbPartnerList(partners),
                            getDbPatternList(patterns),
                            1);
      assertTrue("Did not create rules list", rules != null);
      assertTrue("Did not create rule in rules list", rules.size() >= 0);
      assertTrue("Created more than one rule", rules.size() == 1);
      BsAccessRule rule = rules.get(0);
      assertTrue("No rule in first position in list", rule != null);

      // Insert the rule by processing the access type list.
      delegate.process(types);

      // Query the rule as part of the access type.
      IPrimaryKey key = types.get(0).getPrimaryKey();
      BsAccessType dbType = delegate.getDatabaseObject((SequencePrimaryKey)key);
      Collection<BsAccessRule> dbRules = dbType.getAccessRule();
      assertTrue("No access-rule list in access type", dbRules != null);
      for (BsAccessRule dbRule : dbRules) {
        // Test by comparing association object primary key with original rule
        // key
        assertTrue(dbRule.getPrimaryKey().equals(rule.getPrimaryKey()));
      }
    } catch (InvalidParametersException e) {
      fail("Invalid parameter error: " + e.getMessage());
    } catch (DelegateException e) {
      fail("Delegate error: " + e.getMessage());
    } finally {
      // Delete the inserted objects to clean up.

      // Mark all the access types for delete.
      for (BsAccessType type : types) {
        type.delete();
      }
      delegate.deleteBatch(types);

      // Mark all the access types for delete.
      for (BsUriPattern pattern : patterns) {
        pattern.delete();
      }
      ApiDelegateFactory.getUriPatternDelegate().deleteBatch(patterns);
    }

  }

  /**
   * Convert a list of URI pattern business objects to URI pattern DbDTOs.
   *
   * @param patterns the list of business objects
   * @return the list of DbDto objects
   */
  private List<IUriPattern> getDbPatternList(List<BsUriPattern> patterns) {
    List<IUriPattern> dtos = new ArrayList<IUriPattern>(patterns.size());
    for (BsUriPattern pattern : patterns) {
      dtos.add(pattern.toDto());
    }
    return dtos;
  }

  /**
   * Convert a list of URI pattern business objects to URI pattern DbDTOs.
   *
   * @param patterns the list of business objects
   * @return the list of DbDto objects
   */
  private List<IPartner> getDbPartnerList(List<BsPartner> partners) {
    List<IPartner> dtos = new ArrayList<IPartner>(partners.size());
    for (BsPartner partner : partners) {
      dtos.add(partner.toDto());
    }
    return dtos;
  }

  /**
   * Convert a list of URI pattern business objects to URI pattern DbDTOs.
   *
   * @param patterns the list of business objects
   * @return the list of DbDto objects
   */
  private List<IAccessType> getDbTypeList(List<BsAccessType> types) {
    List<IAccessType> dtos = new ArrayList<IAccessType>(types.size());
    for (BsAccessType type : types) {
      dtos.add(type.toDto());
    }
    return dtos;
  }

  /**
   * Create some number of new UriPattern objects and return them in a list.
   * This is a helper method for writable children DTOs.
   * 
   * @param count the number of objects to create
   * @return the stored object
   * @throws InvalidParametersException when an invalid parameter prevents the
   *           creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  protected List<org.phoenixbioinformatics.api.bs.api.BsUriPattern> createApiUriPattern(int count)
      throws DelegateException, InvalidParametersException {
    List<org.phoenixbioinformatics.api.bs.api.BsUriPattern> objects =
      new CopyOnWriteArrayList<org.phoenixbioinformatics.api.bs.api.BsUriPattern>();
    @SuppressWarnings("unused")
    java.util.Random r = new java.util.Random();

    for (int i = 0; i < count; i++) {
      java.math.BigInteger uriPatternId = null;
      java.lang.String pattern =
        com.poesys.cartridges.db.utilities.StringUtilities.generateString(200);

      // Create the object.
      BsUriPattern object = null;
      try {
        object =
          ApiDelegateFactory.getUriPatternDelegate().createUriPattern(uriPatternId,
                                                                      pattern);
      } catch (InvalidParametersException e) {
        Object[] args = e.getParameters().toArray();
        String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
        throw new RuntimeException(message, e);
      } catch (DelegateException e) {
        throw new RuntimeException(e.getMessage(), e);
      }

      objects.add(object);
    }

    return objects;
  }

  @Override
  protected String getSubsystem() {
    // return explicit subsystem name
    return "org.phoenixbioinformatics.api.db.api";
    // use super.getSubsystem() to get default subsystem name if needed
  }
}
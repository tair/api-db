/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.phoenixbioinformatics.api.bs.api;


/**
 * <p>
 * A test class for the UriPatternDelegate class. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * This class does not test the creation of access rules, which gets done through
 * the AccessTypeDelegateTest class.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class UriPatternDelegateTest extends org.phoenixbioinformatics.api.bs.api.AbstractUriPatternDelegateTest {

  @Override
  protected java.util.List<org.phoenixbioinformatics.api.bs.api.BsAccessRule> createApiAccessRule(java.util.List<org.phoenixbioinformatics.api.db.api.IAccessType> accessTypesList, java.util.List<org.phoenixbioinformatics.api.db.api.IPartner> partnerList, java.util.List<org.phoenixbioinformatics.api.db.api.IUriPattern> uriPatternsList, int count) 
      throws com.poesys.bs.delegate.DelegateException, 
             com.poesys.db.InvalidParametersException, 
             com.poesys.db.dto.DtoStatusException {
    java.util.List<BsAccessRule> objects = 
      new java.util.concurrent.CopyOnWriteArrayList<BsAccessRule>();
    
    // Check the input requirements. The input lists must each have at
    // least count objects as they must map objects one-to-one.
    if (accessTypesList.size() < count) {
      org.junit.Assert.fail("createApiAccessRule accessTypesList list has " + accessTypesList.size() + 
        " elements but needs at least " + count);
    }
    if (partnerList.size() < count) {
      org.junit.Assert.fail("createApiAccessRule partnerList list has " + partnerList.size() + 
        " elements but needs at least " + count);
    }
    if (uriPatternsList.size() < count) {
      org.junit.Assert.fail("createApiAccessRule uriPatternsList list has " + uriPatternsList.size() + 
        " elements but needs at least " + count);
    }

    // implement child creation by mapping the objects in the input lists one-to-one
    
    UriPatternDelegate delegate =
       ApiDelegateFactory.getUriPatternDelegate();
       
    for (int i = 0; i < count; i++) {
      BsAccessType accessTypesObject = new BsAccessType(accessTypesList.get(i));
      BsPartner partnerObject = new BsPartner(partnerList.get(i));
      BsUriPattern uriPatternsObject = new BsUriPattern(uriPatternsList.get(i));

      BsAccessRule link =
          delegate.createAccessRule(accessTypesObject, partnerObject, uriPatternsObject, accessTypesObject.getAccessTypeId(), uriPatternsObject.getUriPatternId(), partnerObject.getPartnerId(), partnerObject.toDto());
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
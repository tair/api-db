/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegateTest.vsl

package org.phoenixbioinformatics.api.bs.api;


import static org.junit.Assert.assertTrue;
import org.junit.After;

import com.poesys.db.connection.ConnectionException;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.DaoManagerFactory;
import com.poesys.db.dao.IDaoManager;


/**
 * <p>
 * Test the PartyDelegate class.
 * </p>
 * <p>
 * Note that all the test cases defined here run independently, because JUnit
 * does not guarantee the execution order of the test cases in any way.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractPartyDelegateTest {
  /** Define a class logger. */
  protected static Logger logger = Logger.getLogger(AbstractPartyDelegateTest.class);
  /** Subsystem name in database.properties file */
  protected String subsystem = "org.phoenixbioinformatics.api.db.api";
  /** Boolean saved off for later comparison in update tests */
  protected Boolean originalBooleanValue = null;
  /** Delegate created at class level for sharing between methods */
  protected PartyDelegate delegate = null;

  /**
   * Set up the test by creating the class under test (CUT).
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Before
  public void setUp() {
    delegate = ApiDelegateFactory.getPartyDelegate();
    // Clear any existing caches of objects using the memory manager set in
    // the creation of the delegate.
    clearCaches();
    assertTrue("No delegate created", delegate != null);
  }
  
  /**
   * Helper method to clear caches for any objects used in the test
   */
  protected void clearCaches() {
    // Primary class PartyProxy cache
    IDaoManager manager = DaoManagerFactory.getManager(getSubsystem());
    if (manager != null) {
      manager.clearCache(org.phoenixbioinformatics.api.db.api.PartyProxy.class.getName());
    }

    // Clear nested object caches
    
    // Child IpRange cache
    IDaoManager IpRangeManager = DaoManagerFactory.getManager("org.phoenixbioinformatics.api.db.api");
    if (IpRangeManager != null) {
      IpRangeManager.clearCache(org.phoenixbioinformatics.api.db.api.IpRange.class.getName());
    }
    
    // Child Login cache
    IDaoManager LoginManager = DaoManagerFactory.getManager("org.phoenixbioinformatics.api.db.api");
    if (LoginManager != null) {
      LoginManager.clearCache(org.phoenixbioinformatics.api.db.api.Login.class.getName());
    }
    
    // Child SubscriptionTransaction cache
    IDaoManager SubscriptionTransactionManager = DaoManagerFactory.getManager("org.phoenixbioinformatics.api.db.api");
    if (SubscriptionTransactionManager != null) {
      SubscriptionTransactionManager.clearCache(org.phoenixbioinformatics.api.db.api.SubscriptionTransaction.class.getName());
    }
    
    // Child Subscription Proxy cache
    IDaoManager SubscriptionManager = DaoManagerFactory.getManager("org.phoenixbioinformatics.api.db.api");
    if (SubscriptionManager != null) {
      SubscriptionManager.clearCache(org.phoenixbioinformatics.api.db.api.Subscription.class.getName());
    }
  }

  /**
   * Create some number of new Party objects and return them in a list.  
   * This is a helper method for writable children DTOs.
   * 
   * @param count the number of objects to create
   * @return the stored object
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  protected List<org.phoenixbioinformatics.api.bs.api.BsParty> createApiParty(int count) 
      throws DelegateException, InvalidParametersException {
    List<org.phoenixbioinformatics.api.bs.api.BsParty> objects = 
      new CopyOnWriteArrayList<org.phoenixbioinformatics.api.bs.api.BsParty>();
    @SuppressWarnings("unused")
    java.util.Random r = new java.util.Random();
    
    for (int i = 0; i < count; i++) {
      // Create a null variable for the Country, which is not required.
      java.math.BigInteger countryId = null;
      java.math.BigInteger partyId = null;
      java.lang.String name = 
        com.poesys.cartridges.db.utilities.StringUtilities.generateString(200);
      java.lang.String partyType = 
        com.poesys.cartridges.db.utilities.StringUtilities.generateString(200);
      java.lang.Boolean display = r.nextBoolean();

      // Create the object.
      BsParty object = null;
      try {
        object = delegate.createParty(partyId, name, partyType, display, countryId);
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

  /**
   * <p>
   * Create some number of new IpRange objects and return them in a list.  
   * This is a helper method that the concrete subclass needs to implement. It
   * returns a child object.
   * </p>
   * <ul>
   * <li>Create the list to return as a CopyOnWriteArrayList&lt;BsIpRange&gt;</li>
   * <li>Generate any required objects linked to this object other than the 
   * parent by calling the appropriate delegate's create method</li>
   * <li>Create the sub-key as an integer for ordered subkeys or a random string
   * for unordered subkeys</li>
   * <li>Generate random values for any primitive data members</li>
   * <li>Create the BsIpRange by calling delegate.createBsIpRange</li>
   * <li>Add the new child to the list</li>
   * </ul>
   * <p>
   * Key type: CompositeKey
   * </p>
   * @param parent the parent Party
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.phoenixbioinformatics.api.bs.api.BsIpRange> createApiIpRange(org.phoenixbioinformatics.api.db.api.IParty parent, 
                                                       int count) 
      throws DelegateException, InvalidParametersException; // create 2
      
  /**
   * <p>
   * Create some number of new Login objects and return them in a list.  
   * This is a helper method that the concrete subclass needs to implement. It
   * returns a child object.
   * </p>
   * <ul>
   * <li>Create the list to return as a CopyOnWriteArrayList&lt;BsLogin&gt;</li>
   * <li>Generate any required objects linked to this object other than the 
   * parent by calling the appropriate delegate's create method</li>
   * <li>Create the sub-key as an integer for ordered subkeys or a random string
   * for unordered subkeys</li>
   * <li>Generate random values for any primitive data members</li>
   * <li>Create the BsLogin by calling delegate.createBsLogin</li>
   * <li>Add the new child to the list</li>
   * </ul>
   * <p>
   * Key type: CompositeKey
   * </p>
   * @param parent the parent Party
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.phoenixbioinformatics.api.bs.api.BsLogin> createApiLogin(org.phoenixbioinformatics.api.db.api.IParty parent, 
                                                       int count) 
      throws DelegateException, InvalidParametersException; // create 2
      
  /**
   * <p>
   * Create some number of new SubscriptionTransaction objects and return them in a list.  
   * This is a helper method that the concrete subclass needs to implement. It
   * returns a child object.
   * </p>
   * <ul>
   * <li>Create the list to return as a CopyOnWriteArrayList&lt;BsSubscriptionTransaction&gt;</li>
   * <li>Generate any required objects linked to this object other than the 
   * parent by calling the appropriate delegate's create method</li>
   * <li>Create the sub-key as an integer for ordered subkeys or a random string
   * for unordered subkeys</li>
   * <li>Generate random values for any primitive data members</li>
   * <li>Create the BsSubscriptionTransaction by calling delegate.createBsSubscriptionTransaction</li>
   * <li>Add the new child to the list</li>
   * </ul>
   * <p>
   * Key type: CompositeKey
   * </p>
   * @param parent the parent Party
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.phoenixbioinformatics.api.bs.api.BsSubscriptionTransaction> createApiSubscriptionTransaction(org.phoenixbioinformatics.api.db.api.IParty parent, 
                                                       int count) 
      throws DelegateException, InvalidParametersException; // create 2
      
  /**
   * <p>
   * Create some number of new Subscription objects and return them in a list.  
   * This is a helper method that the concrete subclass needs to implement. It
   * returns a child object.
   * </p>
   * <ul>
   * <li>Create the list to return as a CopyOnWriteArrayList&lt;BsSubscription&gt;</li>
   * <li>Generate any required objects linked to this object other than the 
   * associated objects by calling the appropriate delegate's create method</li>
   * <li>Generate random values for any primitive data members</li>
   * <li>Create the BsSubscription by calling delegate.createBsSubscription</li>
   * <li>Add the new child to the list</li>
   * </ul>
   * <p>
   * Key type: AssociationKey
   * </p>
   * @param subscribedPartnersList a list of source objects to link with at least the number
   *                 of objects required by count
   * @param subscribersList a list of source objects to link with at least the number
   *                 of objects required by count
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.phoenixbioinformatics.api.bs.api.BsSubscription> createApiSubscription(List<org.phoenixbioinformatics.api.db.api.IPartner> subscribedPartnersList, List<org.phoenixbioinformatics.api.db.api.IParty> subscribersList, int count) 
      throws DelegateException, InvalidParametersException; // create 1

  /**
   * <p>
   * Create some number of new Country objects and return them in a list.  
   * This is a helper method that the concrete subclass needs to implement. It
   * returns the "child" corresponding to the superclass.
   * </p>
   * <ul>
   * <li>Create the list to return as a CopyOnWriteArrayList&lt;BsCountry&gt;</li>
   * <li>Generate random values for any primitive data members</li>
   * <li>Create the BsCountry by calling delegate.createBs${foreignDto.name}</li>
   * <li>Add the new child to the list</li>
   * </ul>
   * <p>
   * Key type: SequenceKey
   * </p>
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.phoenixbioinformatics.api.bs.api.BsCountry> createCountryApiCountry(int count) 
      throws DelegateException, InvalidParametersException; // create 4
      
  /**
   * Test method for delegate insert
   */
  @Test
  public void testInsert() {
    // Create a new Party object to perform the test.
    List<BsParty> objects = createApiParty(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);

    BsParty queriedObject = queryStoredObject(key);
    assertTrue("No queried inserted object", queriedObject != null);
    assertTrue("Wrong object", objects.get(0).equals(queriedObject));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * Test method for getObject
   * 
   * @throws java.sql.SQLException when there is a problem querying a collection 
   *                               property
   */
  @Test
  public void testGetObject() throws java.sql.SQLException {
    // Create a new Party object to perform the test.
    List<BsParty> objects = createApiParty(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key generated from concrete implementation", key != null);
    BsParty insertedObject = objects.get(0);
    assertTrue("No comparison object for object query", insertedObject != null);
    
    // Query the object.
    BsParty object = delegate.getObject(key);
    assertTrue("Couldn't get object", object != null);
    assertTrue("Wrong object", insertedObject.equals(object));
    
    // Testing lazy loading of subscribedPartners Collection property
    java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsPartner> subscribedPartners = 
      object.getSubscribedPartners();
    assertTrue("partner not lazily loaded", subscribedPartners != null);
    
    // Testing lazy loading of subscription Collection property
    java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsSubscription> subscription = 
      object.getSubscription();
    assertTrue("subscription not lazily loaded", subscription != null);
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty o : objects) {
      o.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * <p>
   * Test method for getAllObjects
   * </p>
   * <p>
   * For this read/write class, the method ensures that there are objects to
   * query by inserting an object, querying, then deleting the object.
   * </p>
   *
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testGetAllObjects() 
       throws InvalidParametersException, DelegateException {
    // Create a new Party object to perform the test.
    List<BsParty> insertedObjects = createApiParty(1);
    assertTrue("No object created", insertedObjects.get(0) != null);
    delegate.insert(insertedObjects);
    
    // Query all the objects.
    List<BsParty> objects = delegate.getAllObjects(100);
    assertTrue("Couldn't create list", objects != null);
    // The list should not be empty.
    assertTrue("List of all objects empty", objects.size() != 0);
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty o : insertedObjects) {
      o.delete();
    }

    delegate.deleteBatch(insertedObjects);
  }

  /**
   * A helper method that queried a previously stored object identified by its
   * primary key. The method returns the queried object for further testing
   * after performing structural tests on the object.
   * 
   * @param key the primary key of the object to retrieve
   * @return the object
   * @throws DelegateException when there is a problem querying the object
   */
  protected BsParty queryStoredObject(com.poesys.db.pk.SequencePrimaryKey key)
      throws DelegateException {
    // Clear the caches, then query the saved object and test it.
    clearCaches();

    BsParty queriedObject = delegate.getDatabaseObject(key);
    assertTrue("Object not found", queriedObject != null);
    return queriedObject;
  }

  /**
   * A helper method that tests the stored existence of the object identified
   * by the pre-existing, saved primary key.
   * 
   * @param key the primary key (com.poesys.db.pk.SequencePrimaryKey) of the object to check
   * @return true if the object is in the database, false if not
   * @throws DelegateException when there is a problem querying the object
   */
  protected boolean exists(com.poesys.db.pk.SequencePrimaryKey key) throws DelegateException {
    // Clear the caches, then query the saved object and test it.
    clearCaches();

    BsParty queriedObject = delegate.getObject(key);
    return queriedObject != null;
  }

  /**
   * Test the updating of the inserted object.
   */
  @Test
  public void testUpdate() {
    // Create a new Party object to perform the test.
    List<BsParty> objects = createApiParty(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);
    BsParty insertedObject = objects.get(0);
    assertTrue("No created object to update", insertedObject != null);
    
    // Update the inserted object and query it to test.
    updateColumn(insertedObject);
    delegate.update(insertedObject);
    BsParty queriedObject = queryStoredObject(key);
    assertTrue("Object not updated", isColumnUpdated(queriedObject));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }
  
  /**
   * Update the first mutable column with a new value.
   *
   * @param object the BsParty object to update
   */
  protected void updateColumn(BsParty object) {
    try {
      object.setName("Party.name updated".substring(0, "Party.name updated".length() < 200 ? "Party.name updated".length() : 200));
    } catch (com.poesys.db.dto.DtoStatusException e) {
      org.junit.Assert.fail(e.getMessage());
    }
  }

  /**
   * Is the appropriate column in the input object set to the update value?
   *
   * @param object the BsParty object to update
   * @return true if the column is updated, false if not
   * @see #updateColumn
   */
  protected boolean isColumnUpdated(BsParty object) {
    boolean retVal = false;
    retVal = object.getName().equals("Party.name updated".substring(0, "Party.name updated".length() < 200 ? "Party.name updated".length() : 200));
    return retVal;
  }

  /**
   * Is the appropriate column in the input object set to the updated value in 
   * the original object? This method is a helper for the batchUpdate test.
   *
   * @param original the original, updated BsParty object
   * @param queried the queried BsParty object
   * @return true if the column is updated, false if not
   */
  protected boolean isColumnUpdated(BsParty original, BsParty queried) {
    boolean retVal = true;
    retVal = 
      retVal && queried.getName().equals(original.getName());
    retVal = 
      retVal && queried.getPartyType().equals(original.getPartyType());
    retVal = 
      retVal && queried.getDisplay().equals(original.getDisplay());
    return retVal;
  }

  /**
   * Test method for batch update
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testUpdateBatch() throws InvalidParametersException,
      DelegateException {
    List<BsParty> objects = createApiParty(2);
    delegate.insert(objects);
    // Allocate a map to hold the updated objects for later comparison.
    java.util.Map<com.poesys.db.pk.IPrimaryKey, BsParty> map = 
      new java.util.TreeMap<com.poesys.db.pk.IPrimaryKey, BsParty>();
    for (BsParty object : objects) {
      updateColumn(object);
      // Add the object to the storage map.
      map.put(object.getPrimaryKey(), object);
    }
    delegate.updateBatch(objects);
    
    clearCaches();
    
    for (BsParty object : objects) {
      BsParty queriedObject = 
        queryStoredObject((com.poesys.db.pk.SequencePrimaryKey)object.getPrimaryKey());
      BsParty originalObject = map.get(object.getPrimaryKey());
      assertTrue("Object not updated", 
                 isColumnUpdated(originalObject, queriedObject));
    }
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * Test method for delete
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testDelete() throws InvalidParametersException,
      DelegateException {
    // Create a new Party object to perform the test.
    List<BsParty> objects = createApiParty(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);
    BsParty insertedObject = objects.get(0);
    assertTrue("No inserted object to delete", insertedObject != null);
    
    delegate.delete(insertedObject);
    assertTrue("object not deleted", !exists(key));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * Test method for deleteBatch
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testDeleteBatch() throws InvalidParametersException,
      DelegateException {
    List<BsParty> objects = createApiParty(2);
    delegate.insert(objects);
    
    // Mark all the objects for delete.
    for (BsParty object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);

    for (BsParty object : objects) {
      assertTrue("object not deleted", !exists((com.poesys.db.pk.SequencePrimaryKey)object.getPrimaryKey()));
    }
  }

  /**
   * Test method for process()
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Test
  public void testProcess() throws InvalidParametersException,
      DelegateException {
    // Create 3 rows--one to insert, one to update, one to delete.
    List<BsParty> allObjects = createApiParty(3);
    // Insert the first two rows to later update and delete.
    List<BsParty> existingObjects = 
      new CopyOnWriteArrayList<BsParty>();
    existingObjects.add(allObjects.get(0));
    existingObjects.add(allObjects.get(1));
    delegate.insert(existingObjects);
    updateColumn(existingObjects.get(0));
    existingObjects.get(1).delete();

    // Set the third object as the object to insert.
    List<BsParty> insertObject = 
      new CopyOnWriteArrayList<BsParty>();
    insertObject.add(allObjects.get(2));
    
    // Put it all together.
    List<BsParty> objects = 
      new CopyOnWriteArrayList<BsParty>(existingObjects);
    objects.addAll(insertObject);

    // Test the process method
    delegate.process(objects);

    // Verify the update
    BsParty queriedObject = 
      queryStoredObject((com.poesys.db.pk.SequencePrimaryKey)existingObjects.get(0).getPrimaryKey());
    assertTrue("Update not processed", isColumnUpdated(queriedObject));

    // Verify the delete
    assertTrue("object not deleted", !exists((com.poesys.db.pk.SequencePrimaryKey)existingObjects.get(1).getPrimaryKey()));

    // Verify the insert
    assertTrue("object not inserted", exists((com.poesys.db.pk.SequencePrimaryKey)insertObject.get(0).getPrimaryKey()));
    
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty object : allObjects) {
      object.delete();
    }

    delegate.deleteBatch(allObjects);
  }

  /**
   * Test the creation and adding of a child BsIpRange object to the BsParty
   * as a ipRanges link.
   */
  @Test
  public void testUpdateAddIpRangesIpRange()  {
    // Create a new BsParty object to perform the test.
    List<BsParty> objects = createApiParty(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);

    // Test to make sure the object is there.
    BsParty queriedObject = queryStoredObject(key);
    assertTrue("No queried inserted object", queriedObject != null);
    assertTrue("Wrong object", objects.get(0).equals(queriedObject));

    // Add a child and update the parent to insert the child.
    List<BsIpRange> children = createApiIpRange(queriedObject.toDto(), 1);
    queriedObject.addIpRangesIpRange(children.get(0));
    delegate.update(queriedObject);
    
    // Test to make sure the object is there.
    BsParty queriedUpdatedObject = queryStoredObject(key);
    assertTrue("No queried updated object", queriedUpdatedObject != null);
    assertTrue("Wrong object", objects.get(0).equals(queriedUpdatedObject));
    assertTrue("No ipRanges, IpRange not inserted", 
               queriedUpdatedObject.getIpRanges().size() == 1);
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * Test the creation and adding of a child BsLogin object to the BsParty
   * as a login link.
   */
  @Test
  public void testUpdateAddLoginLogin()  {
    // Create a new BsParty object to perform the test.
    List<BsParty> objects = createApiParty(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);

    // Test to make sure the object is there.
    BsParty queriedObject = queryStoredObject(key);
    assertTrue("No queried inserted object", queriedObject != null);
    assertTrue("Wrong object", objects.get(0).equals(queriedObject));

    // Add a child and update the parent to insert the child.
    List<BsLogin> children = createApiLogin(queriedObject.toDto(), 1);
    queriedObject.addLoginLogin(children.get(0));
    delegate.update(queriedObject);
    
    // Test to make sure the object is there.
    BsParty queriedUpdatedObject = queryStoredObject(key);
    assertTrue("No queried updated object", queriedUpdatedObject != null);
    assertTrue("Wrong object", objects.get(0).equals(queriedUpdatedObject));
    assertTrue("No login, Login not inserted", 
               queriedUpdatedObject.getLogin().size() == 1);
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsParty object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }

  /**
   * Test method for truncateTable
   */
  @Test
  public void testTruncateTable() {
    delegate.truncateTable("Party");
    List<BsParty> objects = delegate.getAllObjects(100);
    assertTrue("Couldn't create list", objects != null);
    // The list should be empty.
    assertTrue("Table not truncated", objects.size() == 0);
  }

  /**
   * Return the database access subsystem name to use to look up access
   * properties in the database.properties file. The concrete implementation
   * should override this method to provide a different subsystem name if
   * needed.
   * 
   * @return the database access subsystem name
   */
  protected String getSubsystem() {
    return subsystem;
  }
  
  /**
   * Flush all resources associated with connections.
   * 
   * @throws ConnectionException when there is a problem flushing resources
   */
  @After
  public void tearDown() throws ConnectionException {
    delegate.flush();
  }
}

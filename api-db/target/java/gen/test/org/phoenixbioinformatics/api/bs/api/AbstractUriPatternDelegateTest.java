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
 * Test the UriPatternDelegate class.
 * </p>
 * <p>
 * Note that all the test cases defined here run independently, because JUnit
 * does not guarantee the execution order of the test cases in any way.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractUriPatternDelegateTest {
  /** Define a class logger. */
  protected static Logger logger = Logger.getLogger(AbstractUriPatternDelegateTest.class);
  /** Subsystem name in database.properties file */
  protected String subsystem = "org.phoenixbioinformatics.api.db.api";
  /** Boolean saved off for later comparison in update tests */
  protected Boolean originalBooleanValue = null;
  /** Delegate created at class level for sharing between methods */
  protected UriPatternDelegate delegate = null;

  /**
   * Set up the test by creating the class under test (CUT).
   * 
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
   * @throws DelegateException when a problem occurs during object creation
   */
  @Before
  public void setUp() {
    delegate = ApiDelegateFactory.getUriPatternDelegate();
    // Clear any existing caches of objects using the memory manager set in
    // the creation of the delegate.
    clearCaches();
    assertTrue("No delegate created", delegate != null);
  }
  
  /**
   * Helper method to clear caches for any objects used in the test
   */
  protected void clearCaches() {
    // Primary class UriPatternProxy cache
    IDaoManager manager = DaoManagerFactory.getManager(getSubsystem());
    if (manager != null) {
      manager.clearCache(org.phoenixbioinformatics.api.db.api.UriPatternProxy.class.getName());
    }

    // Clear nested object caches
    
    // Child AccessRule Proxy cache
    IDaoManager AccessRuleManager = DaoManagerFactory.getManager("org.phoenixbioinformatics.api.db.api");
    if (AccessRuleManager != null) {
      AccessRuleManager.clearCache(org.phoenixbioinformatics.api.db.api.AccessRule.class.getName());
    }
  }

  /**
   * Create some number of new UriPattern objects and return them in a list.  
   * This is a helper method for writable children DTOs.
   * 
   * @param count the number of objects to create
   * @return the stored object
   * @throws InvalidParametersException when an invalid parameter prevents the
   *       creation of an object
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
        object = delegate.createUriPattern(uriPatternId, pattern);
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
   * Create some number of new AccessRule objects and return them in a list.  
   * This is a helper method that the concrete subclass needs to implement. It
   * returns a child object.
   * </p>
   * <ul>
   * <li>Create the list to return as a CopyOnWriteArrayList&lt;BsAccessRule&gt;</li>
   * <li>Generate any required objects linked to this object other than the 
   * associated objects by calling the appropriate delegate's create method</li>
   * <li>Generate random values for any primitive data members</li>
   * <li>Create the BsAccessRule by calling delegate.createBsAccessRule</li>
   * <li>Add the new child to the list</li>
   * </ul>
   * <p>
   * Key type: AssociationKey
   * </p>
   * @param accessTypesList a list of source objects to link with at least the number
   *                 of objects required by count
   * @param partnerList a list of source objects to link with at least the number
   *                 of objects required by count
   * @param uriPatternsList a list of source objects to link with at least the number
   *                 of objects required by count
   * @param count the number of objects to create
   * @return the stored object
   * @throws DelegateException when there is a problem creating an object
   * @throws InvalidParametersException when there is some problem with the 
   *                                    input parameters for creating an object
   */
  abstract protected List<org.phoenixbioinformatics.api.bs.api.BsAccessRule> createApiAccessRule(List<org.phoenixbioinformatics.api.db.api.IAccessType> accessTypesList, List<org.phoenixbioinformatics.api.db.api.IPartner> partnerList, List<org.phoenixbioinformatics.api.db.api.IUriPattern> uriPatternsList, int count) 
      throws DelegateException, InvalidParametersException; // create 1

  /**
   * Test method for delegate insert
   */
  @Test
  public void testInsert() {
    // Create a new UriPattern object to perform the test.
    List<BsUriPattern> objects = createApiUriPattern(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);

    BsUriPattern queriedObject = queryStoredObject(key);
    assertTrue("No queried inserted object", queriedObject != null);
    assertTrue("Wrong object", objects.get(0).equals(queriedObject));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsUriPattern object : objects) {
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
    // Create a new UriPattern object to perform the test.
    List<BsUriPattern> objects = createApiUriPattern(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key generated from concrete implementation", key != null);
    BsUriPattern insertedObject = objects.get(0);
    assertTrue("No comparison object for object query", insertedObject != null);
    
    // Query the object.
    BsUriPattern object = delegate.getObject(key);
    assertTrue("Couldn't get object", object != null);
    assertTrue("Wrong object", insertedObject.equals(object));
    
    // Testing lazy loading of accessTypes Collection property
    java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsAccessType> accessTypes = 
      object.getAccessTypes();
    assertTrue("accessType not lazily loaded", accessTypes != null);
    
    // Testing lazy loading of accessRule Collection property
    java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsAccessRule> accessRule = 
      object.getAccessRule();
    assertTrue("accessRule not lazily loaded", accessRule != null);
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsUriPattern o : objects) {
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
    // Create a new UriPattern object to perform the test.
    List<BsUriPattern> insertedObjects = createApiUriPattern(1);
    assertTrue("No object created", insertedObjects.get(0) != null);
    delegate.insert(insertedObjects);
    
    // Query all the objects.
    List<BsUriPattern> objects = delegate.getAllObjects(100);
    assertTrue("Couldn't create list", objects != null);
    // The list should not be empty.
    assertTrue("List of all objects empty", objects.size() != 0);
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsUriPattern o : insertedObjects) {
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
  protected BsUriPattern queryStoredObject(com.poesys.db.pk.SequencePrimaryKey key)
      throws DelegateException {
    // Clear the caches, then query the saved object and test it.
    clearCaches();

    BsUriPattern queriedObject = delegate.getDatabaseObject(key);
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

    BsUriPattern queriedObject = delegate.getObject(key);
    return queriedObject != null;
  }

  /**
   * Test the updating of the inserted object.
   */
  @Test
  public void testUpdate() {
    // Create a new UriPattern object to perform the test.
    List<BsUriPattern> objects = createApiUriPattern(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);
    BsUriPattern insertedObject = objects.get(0);
    assertTrue("No created object to update", insertedObject != null);
    
    // Update the inserted object and query it to test.
    updateColumn(insertedObject);
    delegate.update(insertedObject);
    BsUriPattern queriedObject = queryStoredObject(key);
    assertTrue("Object not updated", isColumnUpdated(queriedObject));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsUriPattern object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);
  }
  
  /**
   * Update the first mutable column with a new value.
   *
   * @param object the BsUriPattern object to update
   */
  protected void updateColumn(BsUriPattern object) {
    try {
      object.setPattern("UriPattern.pattern updated".substring(0, "UriPattern.pattern updated".length() < 200 ? "UriPattern.pattern updated".length() : 200));
    } catch (com.poesys.db.dto.DtoStatusException e) {
      org.junit.Assert.fail(e.getMessage());
    }
  }

  /**
   * Is the appropriate column in the input object set to the update value?
   *
   * @param object the BsUriPattern object to update
   * @return true if the column is updated, false if not
   * @see #updateColumn
   */
  protected boolean isColumnUpdated(BsUriPattern object) {
    boolean retVal = false;
    retVal = object.getPattern().equals("UriPattern.pattern updated".substring(0, "UriPattern.pattern updated".length() < 200 ? "UriPattern.pattern updated".length() : 200));
    return retVal;
  }

  /**
   * Is the appropriate column in the input object set to the updated value in 
   * the original object? This method is a helper for the batchUpdate test.
   *
   * @param original the original, updated BsUriPattern object
   * @param queried the queried BsUriPattern object
   * @return true if the column is updated, false if not
   */
  protected boolean isColumnUpdated(BsUriPattern original, BsUriPattern queried) {
    boolean retVal = true;
    retVal = 
      retVal && queried.getPattern().equals(original.getPattern());
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
    List<BsUriPattern> objects = createApiUriPattern(2);
    delegate.insert(objects);
    // Allocate a map to hold the updated objects for later comparison.
    java.util.Map<com.poesys.db.pk.IPrimaryKey, BsUriPattern> map = 
      new java.util.TreeMap<com.poesys.db.pk.IPrimaryKey, BsUriPattern>();
    for (BsUriPattern object : objects) {
      updateColumn(object);
      // Add the object to the storage map.
      map.put(object.getPrimaryKey(), object);
    }
    delegate.updateBatch(objects);
    
    clearCaches();
    
    for (BsUriPattern object : objects) {
      BsUriPattern queriedObject = 
        queryStoredObject((com.poesys.db.pk.SequencePrimaryKey)object.getPrimaryKey());
      BsUriPattern originalObject = map.get(object.getPrimaryKey());
      assertTrue("Object not updated", 
                 isColumnUpdated(originalObject, queriedObject));
    }
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsUriPattern object : objects) {
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
    // Create a new UriPattern object to perform the test.
    List<BsUriPattern> objects = createApiUriPattern(1);
    assertTrue("No object created", objects.get(0) != null);
    delegate.insert(objects);
    com.poesys.db.pk.SequencePrimaryKey key = 
      (com.poesys.db.pk.SequencePrimaryKey)objects.get(0).getPrimaryKey();
    assertTrue("No key for inserted object", key != null);
    BsUriPattern insertedObject = objects.get(0);
    assertTrue("No inserted object to delete", insertedObject != null);
    
    delegate.delete(insertedObject);
    assertTrue("object not deleted", !exists(key));
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsUriPattern object : objects) {
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
    List<BsUriPattern> objects = createApiUriPattern(2);
    delegate.insert(objects);
    
    // Mark all the objects for delete.
    for (BsUriPattern object : objects) {
      object.delete();
    }

    delegate.deleteBatch(objects);

    for (BsUriPattern object : objects) {
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
    List<BsUriPattern> allObjects = createApiUriPattern(3);
    // Insert the first two rows to later update and delete.
    List<BsUriPattern> existingObjects = 
      new CopyOnWriteArrayList<BsUriPattern>();
    existingObjects.add(allObjects.get(0));
    existingObjects.add(allObjects.get(1));
    delegate.insert(existingObjects);
    updateColumn(existingObjects.get(0));
    existingObjects.get(1).delete();

    // Set the third object as the object to insert.
    List<BsUriPattern> insertObject = 
      new CopyOnWriteArrayList<BsUriPattern>();
    insertObject.add(allObjects.get(2));
    
    // Put it all together.
    List<BsUriPattern> objects = 
      new CopyOnWriteArrayList<BsUriPattern>(existingObjects);
    objects.addAll(insertObject);

    // Test the process method
    delegate.process(objects);

    // Verify the update
    BsUriPattern queriedObject = 
      queryStoredObject((com.poesys.db.pk.SequencePrimaryKey)existingObjects.get(0).getPrimaryKey());
    assertTrue("Update not processed", isColumnUpdated(queriedObject));

    // Verify the delete
    assertTrue("object not deleted", !exists((com.poesys.db.pk.SequencePrimaryKey)existingObjects.get(1).getPrimaryKey()));

    // Verify the insert
    assertTrue("object not inserted", exists((com.poesys.db.pk.SequencePrimaryKey)insertObject.get(0).getPrimaryKey()));
    
    // Delete the inserted objects to clean up.
    // Mark all the objects for delete.
    for (BsUriPattern object : allObjects) {
      object.delete();
    }

    delegate.deleteBatch(allObjects);
  }

  /**
   * Test method for truncateTable
   */
  @Test
  public void testTruncateTable() {
    delegate.truncateTable("UriPattern");
    List<BsUriPattern> objects = delegate.getAllObjects(100);
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

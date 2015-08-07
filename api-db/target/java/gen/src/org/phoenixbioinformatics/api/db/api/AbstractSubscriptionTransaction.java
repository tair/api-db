/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;

import com.poesys.db.dto.AbstractDto;
import com.poesys.db.dto.DtoStatusException;


/**
 * <p>
 * A data-access layer data-transfer object for the SubscriptionTransaction. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A specific transaction related to the subscription; provides the transactional
 * history for the subscription
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractSubscriptionTransaction extends AbstractDto implements ISubscriptionTransaction {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the activationCode association data
   *
   * Source: AddToOneAssociationOptionalObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryActivationCodeSetter extends com.poesys.db.dto.AbstractObjectSetter<org.phoenixbioinformatics.api.db.api.IActivationCode> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryActivationCodeSetter object.
     */
    public QueryActivationCodeSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.ActivationCode.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return activationCodeKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IActivationCode> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QueryActivationCode();
    }

    @Override
    protected void set(org.phoenixbioinformatics.api.db.api.IActivationCode dto) {
      // No status change, this is just filling in the object data.
      activationCode = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated activationCode is not null
      return activationCode != null;
    }
  }

  /**
   * Insert setter for inserting nested object property activationCode.
   */
  private class InsertActivationCodeSetter 
      extends com.poesys.db.dto.AbstractInsertSetter {
    // Property activationCode source: AddToOneAssociationOptionalObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertActivationCodeSetter object.
     */
    public InsertActivationCodeSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.ActivationCode.class.getName();
    }

    @SuppressWarnings("unchecked")
    @Override
    protected java.util.Collection<com.poesys.db.dto.IDbDto> getDtos() {
      java.util.ArrayList<com.poesys.db.dto.IDbDto> array =
        new java.util.ArrayList<com.poesys.db.dto.IDbDto>(1);
      array.add(activationCode);
      java.util.Collection<? extends com.poesys.db.dto.IDbDto> dtos = array;
      return (java.util.Collection<com.poesys.db.dto.IDbDto>)dtos;
    }

    @Override
    protected boolean createKey() {
      // Key type: GuidKey
      return true;
    }
  }

  /**
   * Setter for processing added activationCode, updated activationCode, and 
   * deleted activationCode. 
   */
   
  private class UpdateActivationCodeSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.phoenixbioinformatics.api.db.api.IActivationCode> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdateActivationCodeSetter object.
     */
    public UpdateActivationCodeSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IActivationCode dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // activationCode source: AddToOneAssociationOptionalObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IActivationCode> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.ActivationCode.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.phoenixbioinformatics.api.db.api.IActivationCode> updater = 
        factory.getUpdate(new org.phoenixbioinformatics.api.db.api.sql.UpdateActivationCode());

      // Update the leaf class.
      updater.setLeaf(true);
      updater.update(connection, dto);
      // Complete the update by setting the DTO to EXISTING status.
      dto.setExisting();
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IActivationCode dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IActivationCode> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.ActivationCode.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.phoenixbioinformatics.api.db.api.IActivationCode> dao = 
        factory.getDelete(new org.phoenixbioinformatics.api.db.api.sql.DeleteActivationCode());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IActivationCode dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IActivationCode> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.ActivationCode.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.phoenixbioinformatics.api.db.api.IActivationCode> inserter =
        factory.getInsert(new org.phoenixbioinformatics.api.db.api.sql.InsertActivationCode(), createKey());


      // Insert the superclass objects from the root down. Suppress nested
      // inserts for the superclasses, wait until the concrete class. Also set 
      // pre-insert suppression off to have the root insert linked, to-one class
      // objects.
      dto.setSuppressNestedInserts(true);
      dto.setSuppressNestedPreInserts(false);

      // Suppress inserts in concrete class.
      dto.setSuppressNestedPreInserts(true);
      
      // Insert the object of the current class after enabling nested inserts,
      // which will allow connecting up linked objects to any of the inserted
      // classes.
      dto.setSuppressNestedInserts(false);
      inserter.setLeaf(true);
      inserter.insert(connection, dto);
    }

    @Override
    protected org.phoenixbioinformatics.api.db.api.IActivationCode getDto() {
      return activationCode;
    }
    
    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.ActivationCode.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: GuidKey
      return true;
    }
  }

  /**
   * Foreign key object used by QueryActivationCodeSetter nested class to query object
   */
  private IPrimaryKey activationCodeKey;
  
  /**
   * Set the foreign key activationCodeKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param activationCodeKey the foreign key
   */
  void setActivationCodeKey(IPrimaryKey activationCodeKey) {
    this.activationCodeKey = activationCodeKey;
  }

  /**
   * Nested class that manages the subscription association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QuerySubscriptionSetter extends com.poesys.db.dto.AbstractObjectSetter<org.phoenixbioinformatics.api.db.api.ISubscription> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QuerySubscriptionSetter object.
     */
    public QuerySubscriptionSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Subscription.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return subscriptionKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.phoenixbioinformatics.api.db.api.ISubscription> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QuerySubscription();
    }

    @Override
    protected void set(org.phoenixbioinformatics.api.db.api.ISubscription dto) {
      // No status change, this is just filling in the object data.
      subscription = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated subscription is not null
      return subscription != null;
    }
  }

  /**
   * Insert setter for inserting nested object property subscription.
   */
  private class InsertSubscriptionSetter 
      extends com.poesys.db.dto.AbstractInsertSetter {
    // Property subscription source: AddToOneAssociationRequiredObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertSubscriptionSetter object.
     */
    public InsertSubscriptionSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Subscription.class.getName();
    }

    @SuppressWarnings("unchecked")
    @Override
    protected java.util.Collection<com.poesys.db.dto.IDbDto> getDtos() {
      java.util.ArrayList<com.poesys.db.dto.IDbDto> array =
        new java.util.ArrayList<com.poesys.db.dto.IDbDto>(1);
      array.add(subscription);
      java.util.Collection<? extends com.poesys.db.dto.IDbDto> dtos = array;
      return (java.util.Collection<com.poesys.db.dto.IDbDto>)dtos;
    }

    @Override
    protected boolean createKey() {
      // Key type: AssociationKey
      return true;
    }
  }

  /**
   * Setter for processing added subscription, updated subscription, and 
   * deleted subscription. 
   */
   
  private class UpdateSubscriptionSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.phoenixbioinformatics.api.db.api.ISubscription> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdateSubscriptionSetter object.
     */
    public UpdateSubscriptionSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.ISubscription dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // subscription source: AddToOneAssociationRequiredObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.ISubscription> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Subscription.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.phoenixbioinformatics.api.db.api.ISubscription> updater = 
        factory.getUpdate(new org.phoenixbioinformatics.api.db.api.sql.UpdateSubscription());

      // Update the leaf class.
      updater.setLeaf(true);
      updater.update(connection, dto);
      // Complete the update by setting the DTO to EXISTING status.
      dto.setExisting();
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.ISubscription dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.ISubscription> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Subscription.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.phoenixbioinformatics.api.db.api.ISubscription> dao = 
        factory.getDelete(new org.phoenixbioinformatics.api.db.api.sql.DeleteSubscription());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.ISubscription dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.ISubscription> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Subscription.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.phoenixbioinformatics.api.db.api.ISubscription> inserter =
        factory.getInsert(new org.phoenixbioinformatics.api.db.api.sql.InsertSubscription(), createKey());


      // Insert the superclass objects from the root down. Suppress nested
      // inserts for the superclasses, wait until the concrete class. Also set 
      // pre-insert suppression off to have the root insert linked, to-one class
      // objects.
      dto.setSuppressNestedInserts(true);
      dto.setSuppressNestedPreInserts(false);

      // Suppress inserts in concrete class.
      dto.setSuppressNestedPreInserts(true);
      
      // Insert the object of the current class after enabling nested inserts,
      // which will allow connecting up linked objects to any of the inserted
      // classes.
      dto.setSuppressNestedInserts(false);
      inserter.setLeaf(true);
      inserter.insert(connection, dto);
    }

    @Override
    protected org.phoenixbioinformatics.api.db.api.ISubscription getDto() {
      return subscription;
    }
    
    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Subscription.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: AssociationKey
      return true;
    }
  }

  /**
   * Foreign key object used by QuerySubscriptionSetter nested class to query object
   */
  private IPrimaryKey subscriptionKey;
  
  /**
   * Set the foreign key subscriptionKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param subscriptionKey the foreign key
   */
  void setSubscriptionKey(IPrimaryKey subscriptionKey) {
    this.subscriptionKey = subscriptionKey;
  }


  /**
   * Create an empty SubscriptionTransaction for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractSubscriptionTransaction() {
    abstractClass = false;
    createInserters();

    // Setter arrays (create if null)
    if (querySetters == null) {
      querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (insertSetters == null) {
      insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (preSetters == null) {
      preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (postSetters == null) {
      postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (readObjectSetters == null) {
      readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }

    // Add the setters for the activationCode property.
    querySetters.add(new QueryActivationCodeSetter());
    preSetters.add(new InsertActivationCodeSetter());
    postSetters.add(new UpdateActivationCodeSetter());

    // Add the setters for the subscription property.
    querySetters.add(new QuerySubscriptionSetter());
    preSetters.add(new InsertSubscriptionSetter());
    postSetters.add(new UpdateSubscriptionSetter());
  }

  /**
   * Create a SubscriptionTransaction. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the SubscriptionTransaction
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param transactionNo the identifying transaction number within the subscription that uniquely
identifies the transaction along with the subscription key
   * @param transactionDate the date and time of the transaction
   * @param startDate at the time of the transaction, the date at which the subscription commences
   * @param endDate at the time of the transaction, the date at which the subscription ends
   * @param transactionType the kind of transaction: Initial, Renewal, Refund
   * @param activationCodeId foreign key used by setter to query associated object
   */
  public AbstractSubscriptionTransaction(IPrimaryKey key, java.lang.String partnerId, java.math.BigInteger partyId, java.math.BigInteger transactionNo, java.sql.Timestamp transactionDate, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.lang.String transactionType, java.util.UUID activationCodeId) {
    this.key = key;

    this.partnerId = partnerId;

    this.partyId = partyId;

    if (partyId == null) {
      throw new com.poesys.db.InvalidParametersException("partyId is required for " + key.getValueList());
    }
    
    this.transactionNo = transactionNo;

    this.transactionDate = transactionDate;

    if (transactionDate == null) {
      throw new com.poesys.db.InvalidParametersException("transactionDate is required for " + key.getValueList());
    }
    
    this.startDate = startDate;

    if (startDate == null) {
      throw new com.poesys.db.InvalidParametersException("startDate is required for " + key.getValueList());
    }
    
    this.endDate = endDate;

    if (endDate == null) {
      throw new com.poesys.db.InvalidParametersException("endDate is required for " + key.getValueList());
    }
    
    this.transactionType = transactionType;

    if (transactionType == null) {
      throw new com.poesys.db.InvalidParametersException("transactionType is required for " + key.getValueList());
    }
    
    this.activationCodeId = activationCodeId;

    // Setter arrays (create if null)
    if (querySetters == null) {
      querySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (insertQuerySetters == null) {
      insertQuerySetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (insertSetters == null) {
      insertSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (preSetters == null) {
      preSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (postSetters == null) {
      postSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    if (readObjectSetters == null) {
      readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    }
    
    // Add the setters for the activationCode property.
    querySetters.add(new QueryActivationCodeSetter());
    // Set the object property primary key with a factory method.
    // TODO: fix problem with foreign keys/associated keys VND-168
    // activationCodeKey = org.phoenixbioinformatics.api.db.api.ApiFactory.getActivationCodePrimaryKey();
    insertSetters.add(new InsertActivationCodeSetter());
    preSetters.add(new InsertActivationCodeSetter());
    postSetters.add(new UpdateActivationCodeSetter());
    
    
    // Add the setters for the subscription property.
    querySetters.add(new QuerySubscriptionSetter());
    // Set the object property primary key with a factory method.
    // TODO: fix problem with foreign keys/associated keys VND-168
    // subscriptionKey = org.phoenixbioinformatics.api.db.api.ApiFactory.getSubscriptionPrimaryKey();
    insertSetters.add(new InsertSubscriptionSetter());
    preSetters.add(new InsertSubscriptionSetter());
    postSetters.add(new UpdateSubscriptionSetter());
    
    abstractClass = false;
    createInserters();
  }

  @Override
  public boolean equals(Object arg0) {
    ISubscriptionTransaction other = (ISubscriptionTransaction)arg0;
    return other.getPrimaryKey().equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    ISubscriptionTransaction other = (ISubscriptionTransaction)o;
    // Sort on the key. Same semantics as equals and hashCode().
    return other.getPrimaryKey().compareTo(key);
  }
  
  @Override
  public String getSubsystem() {
    return "org.phoenixbioinformatics.api.db.api";
  }

  @Override
  public void markChildrenDeleted() throws DtoStatusException {
  }

  @Override
  public IPrimaryKey getPrimaryKey() {
    return key;
  }
  
  @Override
  public java.sql.Connection getConnection() throws java.sql.SQLException {
    java.sql.Connection connection = null;
    
	/* 
	 * The resource bundle for the DTO's subsystem contains the suffix that
	 * distinguishes multiple versions of the subsystem in the database.properties
	 * file, such as "prod" or "test". Most database.properties files have only
	 * one implementation and use external facilities to switch between the
	 * databases (JNDI, for example, or producing different database.properties
	 * files in different setups). Use the subsystem resource bundle to get the
	 * suffix, then use the full subsystem name to get a connection factory for
	 * the DTO's subsystem, then use that factory to get a JDBC connection.
	 */
	java.util.ResourceBundle rb = 
	  java.util.ResourceBundle.getBundle("org.phoenixbioinformatics.api.db.api");
    String subsystem =
      "org.phoenixbioinformatics.api.db.api"
          + (rb.getString("suffix") == null
             || rb.getString("suffix").length() == 0 ? ""
              : "." + rb.getString("suffix"));
	  
	try {
	  connection = 
	    com.poesys.db.connection.ConnectionFactoryFactory.getInstance(subsystem).getConnection();
	} catch (com.poesys.db.InvalidParametersException e) {
	  throw new java.sql.SQLException(e.getMessage());
	} catch (java.io.IOException e) {
	  throw new java.sql.SQLException(e.getMessage());
	}
	
	return connection;
  }
  /**
   * Nested property partnerId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.lang.String partnerId;
  
  /**
   * Get an object of java.lang.String.
   *
   * Source: AddNaturalKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes
   * 
   * @return a java.lang.String
   */

  public java.lang.String getPartnerId() {
    return partnerId;
  }

  /**
   * Clear the partnerId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPartnerId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }
  /**
   * Nested property partyId
   *
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   *
   * Added by AddGeneratedKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.math.BigInteger partyId;
  
  /**
   * Get an object of java.math.BigInteger.
   *
   * Source: AddGeneratedKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes
   * 
   * @return a java.math.BigInteger
   */

  public java.math.BigInteger getPartyId() {
    return partyId;
  }

  /**
   * Clear the partyId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPartyId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }
  /**
   * Nested property transactionNo
   *
   * <p>
   * the identifying transaction number within the subscription that uniquely
   * identifies the transaction along with the subscription key
   * </p>
   *
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.math.BigInteger transactionNo;
  
  /**
   * Get an object of java.math.BigInteger.
   *
   * Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * 
   * @return a java.math.BigInteger
   */

  public java.math.BigInteger getTransactionNo() {
    return transactionNo;
  }

  /**
   * Clear the transactionNo data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTransactionNo() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }
  /**
   * Nested property transactionDate
   *
   * <p>
   * the date and time of the transaction
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.sql.Timestamp transactionDate;
  
  /**
   * Get an object of java.sql.Timestamp.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.sql.Timestamp
   */

  public java.sql.Timestamp getTransactionDate() {
    return transactionDate;
  }

  /**
   * Clear the transactionDate data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTransactionDate() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the transactionDate.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the date and time of the transaction
   * </p>
   *
   * @param transactionDate the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input transactionDate is null
   */
  public void setTransactionDate(java.sql.Timestamp transactionDate)
      throws com.poesys.db.InvalidParametersException {
    if (transactionDate == null) {
      throw new com.poesys.db.InvalidParametersException("transactionDate is required");
    }
    
    this.transactionDate = transactionDate;
    setChanged();
  }
  /**
   * Nested property startDate
   *
   * <p>
   * at the time of the transaction, the date at which the subscription commences
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.sql.Timestamp startDate;
  
  /**
   * Get an object of java.sql.Timestamp.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.sql.Timestamp
   */

  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  /**
   * Clear the startDate data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearStartDate() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the startDate.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * at the time of the transaction, the date at which the subscription commences
   * </p>
   *
   * @param startDate the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input startDate is null
   */
  public void setStartDate(java.sql.Timestamp startDate)
      throws com.poesys.db.InvalidParametersException {
    if (startDate == null) {
      throw new com.poesys.db.InvalidParametersException("startDate is required");
    }
    
    this.startDate = startDate;
    setChanged();
  }
  /**
   * Nested property endDate
   *
   * <p>
   * at the time of the transaction, the date at which the subscription ends
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.sql.Timestamp endDate;
  
  /**
   * Get an object of java.sql.Timestamp.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.sql.Timestamp
   */

  public java.sql.Timestamp getEndDate() {
    return endDate;
  }

  /**
   * Clear the endDate data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearEndDate() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the endDate.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * at the time of the transaction, the date at which the subscription ends
   * </p>
   *
   * @param endDate the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input endDate is null
   */
  public void setEndDate(java.sql.Timestamp endDate)
      throws com.poesys.db.InvalidParametersException {
    if (endDate == null) {
      throw new com.poesys.db.InvalidParametersException("endDate is required");
    }
    
    this.endDate = endDate;
    setChanged();
  }
  /**
   * Nested property transactionType
   *
   * <p>
   * the kind of transaction: Initial, Renewal, Refund
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String transactionType;
  
  /**
   * Get an object of java.lang.String.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.lang.String
   */

  public java.lang.String getTransactionType() {
    return transactionType;
  }

  /**
   * Clear the transactionType data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearTransactionType() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the transactionType.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the kind of transaction: Initial, Renewal, Refund
   * </p>
   *
   * @param transactionType the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input transactionType is null
   */
  public void setTransactionType(java.lang.String transactionType)
      throws com.poesys.db.InvalidParametersException {
    if (transactionType == null) {
      throw new com.poesys.db.InvalidParametersException("transactionType is required");
    }
    
    this.transactionType = transactionType;
    setChanged();
  }
  /**
   * Nested property activationCode
   *
   * <p>
   * the activation code that "pays" for the transaction (initial or renew
   * transactions)
   * </p>
   *
   * Added by AddToOneAssociationOptionalObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.phoenixbioinformatics.api.db.api.IActivationCode activationCode;
  
  /**
   * Get an object of org.phoenixbioinformatics.api.db.api.IActivationCode.
   *
   * Source: AddToOneAssociationOptionalObjectProperties
   * 
   * @return a org.phoenixbioinformatics.api.db.api.IActivationCode
   */

  public org.phoenixbioinformatics.api.db.api.IActivationCode getActivationCode() {
    return activationCode;
  }

  /**
   * Clear the activationCode data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearActivationCode() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the activationCode.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the activation code that "pays" for the transaction (initial or renew
   * transactions)
   * </p>
   *
   * @param activationCode the value with which to set the property
   */
  public  void setActivationCode(org.phoenixbioinformatics.api.db.api.IActivationCode activationCode) {
    this.activationCode = activationCode;
    // Set the IPrimaryKey cache lookup key.
    this.activationCodeKey = activationCode.getPrimaryKey();
    setChanged();
  }
  /**
   * Nested property subscription
   *
   * <p>
   * the subscription that owns the set of transactions
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.phoenixbioinformatics.api.db.api.ISubscription subscription;
  
  /**
   * Get an object of org.phoenixbioinformatics.api.db.api.ISubscription.
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   * 
   * @return a org.phoenixbioinformatics.api.db.api.ISubscription
   */

  public org.phoenixbioinformatics.api.db.api.ISubscription getSubscription() {
    return subscription;
  }

  /**
   * Clear the subscription data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearSubscription() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the subscription.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the subscription that owns the set of transactions
   * </p>
   *
   * @param subscription the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input subscription is null
   */
  public void setSubscription(org.phoenixbioinformatics.api.db.api.ISubscription subscription)
      throws com.poesys.db.InvalidParametersException {
    if (subscription == null) {
      throw new com.poesys.db.InvalidParametersException("subscription is required");
    }
    
    this.subscription = subscription;
    // Set the IPrimaryKey cache lookup key.
    this.subscriptionKey = subscription.getPrimaryKey();
    setChanged();
  }
  /**
   * Nested property activationCodeId
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddGeneratedGuidKeyProperties + AddToOneAssociationAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.util.UUID activationCodeId;
  
  /**
   * Get an object of java.util.UUID.
   *
   * Source: AddGeneratedGuidKeyProperties + AddToOneAssociationAttributeProperties
   * 
   * @return a java.util.UUID
   */

  public java.util.UUID getActivationCodeId() {
    return activationCodeId;
  }

  /**
   * Clear the activationCodeId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearActivationCodeId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }

  /**
   * Create the inserters for the SubscriptionTransaction and its superclasses.
   */
  private void createInserters() {
    com.poesys.db.dao.IDaoManager manager =
      com.poesys.db.dao.DaoManagerFactory.getManager(getSubsystem());
    final com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction> subscriptionTransactionFactory =
      manager.getFactory("org.phoenixbioinformatics.api.db.api.SubscriptionTransaction",
                         getSubsystem(),
                         2147483647);
    com.poesys.db.dao.insert.IInsertSql<ISubscriptionTransaction> sql =
      new org.phoenixbioinformatics.api.db.api.sql.InsertSubscriptionTransaction();
    com.poesys.db.dao.insert.IInsert<ISubscriptionTransaction> inserter =
      subscriptionTransactionFactory.getInsert(sql, true);
    inserters.add(inserter);
  }
}
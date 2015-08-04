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
 * A data-access layer data-transfer object for the ActivationCode. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A code that a subscriber can use to activate their subscription to a partner;
 * the code is the key for the class
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>GuidKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractActivationCode extends AbstractDto implements IActivationCode {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the partner association data
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryPartnerSetter extends com.poesys.db.dto.AbstractObjectSetter<org.phoenixbioinformatics.api.db.api.IPartner> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryPartnerSetter object.
     */
    public QueryPartnerSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Partner.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return partnerKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IPartner> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QueryPartner();
    }

    @Override
    protected void set(org.phoenixbioinformatics.api.db.api.IPartner dto) {
      // No status change, this is just filling in the object data.
      partner = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated partner is not null
      return partner != null;
    }
  }

  /**
   * Insert setter for inserting nested object property partner.
   */
  private class InsertPartnerSetter 
      extends com.poesys.db.dto.AbstractInsertSetter {
    // Property partner source: AddToOneAssociationRequiredObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertPartnerSetter object.
     */
    public InsertPartnerSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Partner.class.getName();
    }

    @SuppressWarnings("unchecked")
    @Override
    protected java.util.Collection<com.poesys.db.dto.IDbDto> getDtos() {
      java.util.ArrayList<com.poesys.db.dto.IDbDto> array =
        new java.util.ArrayList<com.poesys.db.dto.IDbDto>(1);
      array.add(partner);
      java.util.Collection<? extends com.poesys.db.dto.IDbDto> dtos = array;
      return (java.util.Collection<com.poesys.db.dto.IDbDto>)dtos;
    }

    @Override
    protected boolean createKey() {
      // Key type: SequenceKey
      return true;
    }
  }

  /**
   * Setter for processing added partner, updated partner, and 
   * deleted partner. 
   */
   
  private class UpdatePartnerSetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.phoenixbioinformatics.api.db.api.IPartner> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdatePartnerSetter object.
     */
    public UpdatePartnerSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IPartner dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // partner source: AddToOneAssociationRequiredObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IPartner> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Partner.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.phoenixbioinformatics.api.db.api.IPartner> updater = 
        factory.getUpdate(new org.phoenixbioinformatics.api.db.api.sql.UpdatePartner());

      // Update the leaf class.
      updater.setLeaf(true);
      updater.update(connection, dto);
      // Complete the update by setting the DTO to EXISTING status.
      dto.setExisting();
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IPartner dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IPartner> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Partner.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.phoenixbioinformatics.api.db.api.IPartner> dao = 
        factory.getDelete(new org.phoenixbioinformatics.api.db.api.sql.DeletePartner());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IPartner dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IPartner> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Partner.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.phoenixbioinformatics.api.db.api.IPartner> inserter =
        factory.getInsert(new org.phoenixbioinformatics.api.db.api.sql.InsertPartner(), createKey());


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
    protected org.phoenixbioinformatics.api.db.api.IPartner getDto() {
      return partner;
    }
    
    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Partner.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: SequenceKey
      return true;
    }
  }

  /**
   * Foreign key object used by QueryPartnerSetter nested class to query object
   */
  private IPrimaryKey partnerKey;
  
  /**
   * Set the foreign key partnerKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param partnerKey the foreign key
   */
  void setPartnerKey(IPrimaryKey partnerKey) {
    this.partnerKey = partnerKey;
  }


  /**
   * Create an empty ActivationCode for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractActivationCode() {
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

    // Add the setters for the partner property.
    querySetters.add(new QueryPartnerSetter());
    preSetters.add(new InsertPartnerSetter());
    postSetters.add(new UpdatePartnerSetter());
  }

  /**
   * Create a ActivationCode. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the ActivationCode
   * @param activationCodeId primary key attribute
   * @param period The number of months for the subscription activated by the code
   * @param purchaseDate the date on which the subscriber purchased the code; possibly used to expire the
code if needed
   * @param partnerId foreign key used by setter to query associated object
   */
  public AbstractActivationCode(IPrimaryKey key, java.util.UUID activationCodeId, java.lang.Integer period, java.sql.Timestamp purchaseDate, java.math.BigInteger partnerId) {
    this.key = key;

    this.activationCodeId = activationCodeId;

    if (activationCodeId == null) {
      throw new com.poesys.db.InvalidParametersException("activationCodeId is required for " + key.getValueList());
    }
    
    this.period = period;

    if (period == null) {
      throw new com.poesys.db.InvalidParametersException("period is required for " + key.getValueList());
    }
    
    this.purchaseDate = purchaseDate;

    if (purchaseDate == null) {
      throw new com.poesys.db.InvalidParametersException("purchaseDate is required for " + key.getValueList());
    }
    
    this.partnerId = partnerId;

    if (partnerId == null) {
      throw new com.poesys.db.InvalidParametersException("partnerId is required for " + key.getValueList());
    }
    
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
    
    // Add the setters for the partner property.
    querySetters.add(new QueryPartnerSetter());
    // Set the object property primary key with a factory method.
    // TODO: fix problem with foreign keys/associated keys VND-168
    // partnerKey = org.phoenixbioinformatics.api.db.api.ApiFactory.getPartnerPrimaryKey();
    insertSetters.add(new InsertPartnerSetter());
    preSetters.add(new InsertPartnerSetter());
    postSetters.add(new UpdatePartnerSetter());
    
    abstractClass = false;
    createInserters();
  }

  @Override
  public boolean equals(Object arg0) {
    IActivationCode other = (IActivationCode)arg0;
    return other.getPrimaryKey().equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    IActivationCode other = (IActivationCode)o;
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
   * Nested property activationCodeId
   *
   * <p>
   * Primary key attribute
   * </p>
   *
   * Added by AddGeneratedGuidKeyProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.util.UUID activationCodeId;
  
  /**
   * Get an object of java.util.UUID.
   *
   * Source: AddGeneratedGuidKeyProperties
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
  /**
   * Nested property period
   *
   * <p>
   * The number of months for the subscription activated by the code
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.Integer period;
  
  /**
   * Get an object of java.lang.Integer.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.lang.Integer
   */

  public java.lang.Integer getPeriod() {
    return period;
  }

  /**
   * Clear the period data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPeriod() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the period.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * The number of months for the subscription activated by the code
   * </p>
   *
   * @param period the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input period is null
   */
  public void setPeriod(java.lang.Integer period)
      throws com.poesys.db.InvalidParametersException {
    if (period == null) {
      throw new com.poesys.db.InvalidParametersException("period is required");
    }
    
    this.period = period;
    setChanged();
  }
  /**
   * Nested property purchaseDate
   *
   * <p>
   * the date on which the subscriber purchased the code; possibly used to expire the
   * code if needed
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.sql.Timestamp purchaseDate;
  
  /**
   * Get an object of java.sql.Timestamp.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.sql.Timestamp
   */

  public java.sql.Timestamp getPurchaseDate() {
    return purchaseDate;
  }

  /**
   * Clear the purchaseDate data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPurchaseDate() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the purchaseDate.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the date on which the subscriber purchased the code; possibly used to expire the
   * code if needed
   * </p>
   *
   * @param purchaseDate the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input purchaseDate is null
   */
  public void setPurchaseDate(java.sql.Timestamp purchaseDate)
      throws com.poesys.db.InvalidParametersException {
    if (purchaseDate == null) {
      throw new com.poesys.db.InvalidParametersException("purchaseDate is required");
    }
    
    this.purchaseDate = purchaseDate;
    setChanged();
  }
  /**
   * Nested property partner
   *
   * <p>
   * the partner that the set of activation codes activates
   * </p>
   *
   * Added by AddToOneAssociationRequiredObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.phoenixbioinformatics.api.db.api.IPartner partner;
  
  /**
   * Get an object of org.phoenixbioinformatics.api.db.api.IPartner.
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   * 
   * @return a org.phoenixbioinformatics.api.db.api.IPartner
   */

  public org.phoenixbioinformatics.api.db.api.IPartner getPartner() {
    return partner;
  }

  /**
   * Clear the partner data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPartner() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the partner.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the partner that the set of activation codes activates
   * </p>
   *
   * @param partner the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input partner is null
   */
  public void setPartner(org.phoenixbioinformatics.api.db.api.IPartner partner)
      throws com.poesys.db.InvalidParametersException {
    if (partner == null) {
      throw new com.poesys.db.InvalidParametersException("partner is required");
    }
    
    this.partner = partner;
    // Set the IPrimaryKey cache lookup key.
    this.partnerKey = partner.getPrimaryKey();
    setChanged();
  }
  /**
   * Nested property partnerId
   *
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   *
   * Added by AddGeneratedKeyProperties + AddToOneAssociationAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.math.BigInteger partnerId;
  
  /**
   * Get an object of java.math.BigInteger.
   *
   * Source: AddGeneratedKeyProperties + AddToOneAssociationAttributeProperties
   * 
   * @return a java.math.BigInteger
   */

  public java.math.BigInteger getPartnerId() {
    return partnerId;
  }

  /**
   * Clear the partnerId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPartnerId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }

  /**
   * Create the inserters for the ActivationCode and its superclasses.
   */
  private void createInserters() {
    com.poesys.db.dao.IDaoManager manager =
      com.poesys.db.dao.DaoManagerFactory.getManager(getSubsystem());
    final com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IActivationCode> activationCodeFactory =
      manager.getFactory("org.phoenixbioinformatics.api.db.api.ActivationCode",
                         getSubsystem(),
                         2147483647);
    com.poesys.db.dao.insert.IInsertSql<IActivationCode> sql =
      new org.phoenixbioinformatics.api.db.api.sql.InsertActivationCode();
    com.poesys.db.dao.insert.IInsert<IActivationCode> inserter =
      activationCodeFactory.getInsert(sql, true);
    inserters.add(inserter);
  }
}
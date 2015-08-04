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
 * A data-access layer data-transfer object for the PageView. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A single access of a URI for a given IP address at a given date and time; may be
 * part of a session if it has a session id
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 *     <li>SequenceKey</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractPageView extends AbstractDto implements IPageView {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  // Setter strategy nested classes for single-object associations
  
  /**
   * Nested class that manages the party association data
   *
   * Source: AddToOneAssociationOptionalObjectProperties
   *
   * @author Poesys/DB Cartridge
   */
  private class QueryPartySetter extends com.poesys.db.dto.AbstractObjectSetter<org.phoenixbioinformatics.api.db.api.IParty> {
    private static final long serialVersionUID = 1L;
    
    /**
     * Create a QueryPartySetter object.
     */
    public QueryPartySetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Party.class.getName();
    }

    @Override
    protected IPrimaryKey getKey() {
      return partyKey;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IParty> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QueryParty();
    }

    @Override
    protected void set(org.phoenixbioinformatics.api.db.api.IParty dto) {
      // No status change, this is just filling in the object data.
      party = dto;
    }

    @Override
    public boolean isSet() {
      // Object is set if the associated party is not null
      return party != null;
    }
  }

  /**
   * Insert setter for inserting nested object property party.
   */
  private class InsertPartySetter 
      extends com.poesys.db.dto.AbstractInsertSetter {
    // Property party source: AddToOneAssociationOptionalObjectProperties
    private static final long serialVersionUID = 1L;

    /**
     * Create an InsertPartySetter object.
     */
    public InsertPartySetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Party.class.getName();
    }

    @SuppressWarnings("unchecked")
    @Override
    protected java.util.Collection<com.poesys.db.dto.IDbDto> getDtos() {
      java.util.ArrayList<com.poesys.db.dto.IDbDto> array =
        new java.util.ArrayList<com.poesys.db.dto.IDbDto>(1);
      array.add(party);
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
   * Setter for processing added party, updated party, and 
   * deleted party. 
   */
   
  private class UpdatePartySetter 
      extends com.poesys.db.dto.AbstractProcessNestedObject<org.phoenixbioinformatics.api.db.api.IParty> {
    private static final long serialVersionUID = 1L;

    /**
     * Create an UpdatePartySetter object.
     */
    public UpdatePartySetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected void doChanged(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IParty dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
        // party source: AddToOneAssociationOptionalObjectProperties
        // Immutable: false
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IParty> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Party.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.update.IUpdate<org.phoenixbioinformatics.api.db.api.IParty> updater = 
        factory.getUpdate(new org.phoenixbioinformatics.api.db.api.sql.UpdateParty());

      // Update the leaf class.
      updater.setLeaf(true);
      updater.update(connection, dto);
      // Complete the update by setting the DTO to EXISTING status.
      dto.setExisting();
    }
    
    @Override
    protected void doDeleted(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IParty dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IParty> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Party.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.delete.IDelete<org.phoenixbioinformatics.api.db.api.IParty> dao = 
        factory.getDelete(new org.phoenixbioinformatics.api.db.api.sql.DeleteParty());
      dao.delete(connection, dto);
    }

    @Override
    protected void doNew(java.sql.Connection connection, org.phoenixbioinformatics.api.db.api.IParty dto)
        throws java.sql.SQLException, com.poesys.db.BatchException, com.poesys.db.ConstraintViolationException,
        com.poesys.db.dto.DtoStatusException {
      com.poesys.db.dao.IDaoManager manager = 
        com.poesys.db.dao.DaoManagerFactory.getManager(subsystem);
      com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IParty> factory = 
        manager.getFactory(org.phoenixbioinformatics.api.db.api.Party.class.getName(), subsystem, 2147483647);
      com.poesys.db.dao.insert.IInsert<org.phoenixbioinformatics.api.db.api.IParty> inserter =
        factory.getInsert(new org.phoenixbioinformatics.api.db.api.sql.InsertParty(), createKey());


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
    protected org.phoenixbioinformatics.api.db.api.IParty getDto() {
      return party;
    }
    
    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.Party.class.getName();
    }

    @Override
    protected boolean createKey() {
      // Key type: SequenceKey
      return true;
    }
  }

  /**
   * Foreign key object used by QueryPartySetter nested class to query object
   */
  private IPrimaryKey partyKey;
  
  /**
   * Set the foreign key partyKey. This has package access to enable
   * the subsystem factory getData method to call this method to set the key
   * by creating it from the queried result set.
   *
   * @param partyKey the foreign key
   */
  void setPartyKey(IPrimaryKey partyKey) {
    this.partyKey = partyKey;
  }


  /**
   * Create an empty PageView for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractPageView() {
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

    // Add the setters for the party property.
    querySetters.add(new QueryPartySetter());
    preSetters.add(new InsertPartySetter());
    postSetters.add(new UpdatePartySetter());
  }

  /**
   * Create a PageView. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the PageView
   * @param pageViewId primary key attribute
   * @param pageViewDate the date and time of the page view request
   * @param uri the request URI and any query string
   * @param ip the IP address of the requests in the session; all page views in the session
have this IP address
   * @param sessionId a token identifying a collection of page views as defined by the client
processing the page views
   * @param partyId foreign key used by setter to query associated object
   */
  public AbstractPageView(IPrimaryKey key, java.math.BigInteger pageViewId, java.sql.Timestamp pageViewDate, java.lang.String uri, java.lang.String ip, java.lang.String sessionId, java.math.BigInteger partyId) {
    this.key = key;

    this.pageViewId = pageViewId;

    if (pageViewId == null) {
      throw new com.poesys.db.InvalidParametersException("pageViewId is required for " + key.getValueList());
    }
    
    this.pageViewDate = pageViewDate;

    if (pageViewDate == null) {
      throw new com.poesys.db.InvalidParametersException("pageViewDate is required for " + key.getValueList());
    }
    
    this.uri = uri;

    if (uri == null) {
      throw new com.poesys.db.InvalidParametersException("uri is required for " + key.getValueList());
    }
    
    this.ip = ip;

    if (ip == null) {
      throw new com.poesys.db.InvalidParametersException("ip is required for " + key.getValueList());
    }
    
    this.sessionId = sessionId;

    if (sessionId == null) {
      throw new com.poesys.db.InvalidParametersException("sessionId is required for " + key.getValueList());
    }
    
    this.partyId = partyId;

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
    
    // Add the setters for the party property.
    querySetters.add(new QueryPartySetter());
    // Set the object property primary key with a factory method.
    // TODO: fix problem with foreign keys/associated keys VND-168
    // partyKey = org.phoenixbioinformatics.api.db.api.ApiFactory.getPartyPrimaryKey();
    insertSetters.add(new InsertPartySetter());
    preSetters.add(new InsertPartySetter());
    postSetters.add(new UpdatePartySetter());
    
    abstractClass = false;
    createInserters();
  }

  @Override
  public boolean equals(Object arg0) {
    IPageView other = (IPageView)arg0;
    return other.getPrimaryKey().equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    IPageView other = (IPageView)o;
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
   * Nested property pageViewId
   *
   * <p>
   * Primary key attribute
   * </p>
   *
   * Added by AddGeneratedKeyProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: false
   * Property is lazy: false
   */
  private java.math.BigInteger pageViewId;
  
  /**
   * Get an object of java.math.BigInteger.
   *
   * Source: AddGeneratedKeyProperties
   * 
   * @return a java.math.BigInteger
   */

  public java.math.BigInteger getPageViewId() {
    return pageViewId;
  }

  /**
   * Clear the pageViewId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPageViewId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }
  /**
   * Nested property pageViewDate
   *
   * <p>
   * the date and time of the page view request
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.sql.Timestamp pageViewDate;
  
  /**
   * Get an object of java.sql.Timestamp.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.sql.Timestamp
   */

  public java.sql.Timestamp getPageViewDate() {
    return pageViewDate;
  }

  /**
   * Clear the pageViewDate data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearPageViewDate() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the pageViewDate.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the date and time of the page view request
   * </p>
   *
   * @param pageViewDate the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input pageViewDate is null
   */
  public void setPageViewDate(java.sql.Timestamp pageViewDate)
      throws com.poesys.db.InvalidParametersException {
    if (pageViewDate == null) {
      throw new com.poesys.db.InvalidParametersException("pageViewDate is required");
    }
    
    this.pageViewDate = pageViewDate;
    setChanged();
  }
  /**
   * Nested property uri
   *
   * <p>
   * the request URI and any query string
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String uri;
  
  /**
   * Get an object of java.lang.String.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.lang.String
   */

  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Clear the uri data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearUri() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the uri.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the request URI and any query string
   * </p>
   *
   * @param uri the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input uri is null
   */
  public void setUri(java.lang.String uri)
      throws com.poesys.db.InvalidParametersException {
    if (uri == null) {
      throw new com.poesys.db.InvalidParametersException("uri is required");
    }
    
    this.uri = uri;
    setChanged();
  }
  /**
   * Nested property ip
   *
   * <p>
   * the IP address of the requests in the session; all page views in the session
   * have this IP address
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String ip;
  
  /**
   * Get an object of java.lang.String.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.lang.String
   */

  public java.lang.String getIp() {
    return ip;
  }

  /**
   * Clear the ip data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearIp() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the ip.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the IP address of the requests in the session; all page views in the session
   * have this IP address
   * </p>
   *
   * @param ip the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input ip is null
   */
  public void setIp(java.lang.String ip)
      throws com.poesys.db.InvalidParametersException {
    if (ip == null) {
      throw new com.poesys.db.InvalidParametersException("ip is required");
    }
    
    this.ip = ip;
    setChanged();
  }
  /**
   * Nested property sessionId
   *
   * <p>
   * a token identifying a collection of page views as defined by the client
   * processing the page views
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String sessionId;
  
  /**
   * Get an object of java.lang.String.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.lang.String
   */

  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * Clear the sessionId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearSessionId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the sessionId.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * a token identifying a collection of page views as defined by the client
   * processing the page views
   * </p>
   *
   * @param sessionId the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input sessionId is null
   */
  public void setSessionId(java.lang.String sessionId)
      throws com.poesys.db.InvalidParametersException {
    if (sessionId == null) {
      throw new com.poesys.db.InvalidParametersException("sessionId is required");
    }
    
    this.sessionId = sessionId;
    setChanged();
  }
  /**
   * Nested property party
   *
   * <p>
   * the optional party that initiated a session containing the page view; party is
   * optional because it depends on whether the party has authenticated or not, which
   * is outside the scope of the session
   * </p>
   *
   * Added by AddToOneAssociationOptionalObjectProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private org.phoenixbioinformatics.api.db.api.IParty party;
  
  /**
   * Get an object of org.phoenixbioinformatics.api.db.api.IParty.
   *
   * Source: AddToOneAssociationOptionalObjectProperties
   * 
   * @return a org.phoenixbioinformatics.api.db.api.IParty
   */

  public org.phoenixbioinformatics.api.db.api.IParty getParty() {
    return party;
  }

  /**
   * Clear the party data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearParty() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the party.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the optional party that initiated a session containing the page view; party is
   * optional because it depends on whether the party has authenticated or not, which
   * is outside the scope of the session
   * </p>
   *
   * @param party the value with which to set the property
   */
  public  void setParty(org.phoenixbioinformatics.api.db.api.IParty party) {
    this.party = party;
    // Set the IPrimaryKey cache lookup key.
    this.partyKey = party.getPrimaryKey();
    setChanged();
  }
  /**
   * Nested property partyId
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
  private java.math.BigInteger partyId;
  
  /**
   * Get an object of java.math.BigInteger.
   *
   * Source: AddGeneratedKeyProperties + AddToOneAssociationAttributeProperties
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

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }

  /**
   * Create the inserters for the PageView and its superclasses.
   */
  private void createInserters() {
    com.poesys.db.dao.IDaoManager manager =
      com.poesys.db.dao.DaoManagerFactory.getManager(getSubsystem());
    final com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IPageView> pageViewFactory =
      manager.getFactory("org.phoenixbioinformatics.api.db.api.PageView",
                         getSubsystem(),
                         2147483647);
    com.poesys.db.dao.insert.IInsertSql<IPageView> sql =
      new org.phoenixbioinformatics.api.db.api.sql.InsertPageView();
    com.poesys.db.dao.insert.IInsert<IPageView> inserter =
      pageViewFactory.getInsert(sql, true);
    inserters.add(inserter);
  }
}
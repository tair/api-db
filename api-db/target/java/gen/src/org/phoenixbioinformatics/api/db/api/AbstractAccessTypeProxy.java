/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDtoProxy.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.dto.AbstractLazyLoadingDtoProxy;


/**
 * <p>
 * A data-access layer data-transfer object (DTO) lazy-loading proxy for the 
 * AccessType. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A particular kind of access to authorize
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractAccessTypeProxy extends AbstractLazyLoadingDtoProxy implements IAccessType {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  
    // Setter strategy nested classes for multiple-object associations

  /** Flag indicating whether the uriPatterns property has been loaded */
  boolean uriPatternsLoaded = false;

  /**
   * Query setter for lazily querying nested uriPatterns collection
   * (collection property)
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.phoenixbioinformatics.api.db.api.sql.QueryUriPatternsByAccessType
   */
  private class QueryUriPatternsSetter 
      extends com.poesys.db.dto.AbstractLazyListSetter<org.phoenixbioinformatics.api.db.api.IUriPattern, IAccessType, java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern>> {
    /** Serial version UID for Serializable object */
    private static final long serialVersionUID = 1L;
    private static final int FETCH_SIZE = 10;

    /**
     * Create a QueryUriPatternsSetter object.
     */
    public QueryUriPatternsSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.UriPattern.class.getName();
    }

    @Override
    protected int getFetchSize() {
      return FETCH_SIZE;
    }

    @Override
    protected IAccessType getParametersDto() {
      return AbstractAccessTypeProxy.this;
    }

    @Override
    protected com.poesys.db.dao.query.IParameterizedQuerySql<org.phoenixbioinformatics.api.db.api.IUriPattern, IAccessType> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QueryUriPatternsByAccessType();
    }

    @Override
    protected void set(java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> collection) {
      try {
        // Register the observer parent with the subject children.
        for (org.phoenixbioinformatics.api.db.api.IUriPattern child : collection) {
          child.attach(AbstractAccessTypeProxy.this.dto,
                              com.poesys.db.dao.DataEvent.MARKED_DELETED);
          child.attach(AbstractAccessTypeProxy.this.dto, com.poesys.db.dao.DataEvent.DELETE);
        }
        setUriPattern(collection);
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Just lazy loading here, not actually setting. Ignore this exception.        
      }
    }

    @Override
    public boolean isSet() {
      // Set if proxy has loaded uriPatterns
      return uriPatternsLoaded;
    }
  }


  /**
   * Read-Object setter for de-serializing nested uriPatterns collection
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   *
   * @see org.phoenixbioinformatics.api.db.api.sql.QueryUriPattern
   */
  private class ReadUriPatternsSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.phoenixbioinformatics.api.db.api.IUriPattern> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadUriPatternsSetter object to read the uriPattern collection.
     */
    public ReadUriPatternsSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.UriPattern.class.getName();
    }

    @Override
    protected java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> getObjectCollection() {
      java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> uriPatterns = null;
      try {
        uriPatterns = ((org.phoenixbioinformatics.api.db.api.AccessType)dto).getUriPatterns();
      } catch (java.sql.SQLException e) {
        throw new RuntimeException("SQL Exception on collection query: " + e.getMessage(), e);
      }
      return uriPatterns;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.phoenixbioinformatics.api.db.api.AccessType)dto).uriPatternKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IUriPattern> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QueryUriPattern();
    }

    @Override
    protected void set(java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> collection) {
      ((org.phoenixbioinformatics.api.db.api.AccessType)dto).uriPatterns = collection;
    }
  }


  /**
   * Add a org.phoenixbioinformatics.api.db.api.IUriPattern object to the UriPatterns collection. The method
   * loads the collection if it is not already in memory.
   *
   * add method #1 (collection property)
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   * 
   * @param object the org.phoenixbioinformatics.api.db.api.IUriPattern object to add to the collection
   * @throws java.sql.SQLException when there is a database problem
   */
  public void addUriPatternsUriPattern(org.phoenixbioinformatics.api.db.api.IUriPattern object)throws java.sql.SQLException {
    // Collection is lazily loaded, check and load if necessary.
    if (!uriPatternsLoaded) {
      getUriPatterns();
    }
    ((AccessType)dto).addUriPatternsUriPattern(object);
  }

  

  /** Flag indicating whether the accessRule property has been loaded */
  boolean accessRuleLoaded = false;

  /**
   * Query setter for lazily querying nested accessRule collection
   * (collection property)
   *
   * Source: AddAssociationClassCollectionProperties
   *
   * @see org.phoenixbioinformatics.api.db.api.sql.QueryAccessRuleByAccessType
   */
  private class QueryAccessRuleSetter 
      extends com.poesys.db.dto.AbstractLazyListSetter<org.phoenixbioinformatics.api.db.api.IAccessRule, IAccessType, java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule>> {
    /** Serial version UID for Serializable object */
    private static final long serialVersionUID = 1L;
    private static final int FETCH_SIZE = 10;

    /**
     * Create a QueryAccessRuleSetter object.
     */
    public QueryAccessRuleSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.AccessRule.class.getName();
    }

    @Override
    protected int getFetchSize() {
      return FETCH_SIZE;
    }

    @Override
    protected IAccessType getParametersDto() {
      return AbstractAccessTypeProxy.this;
    }

    @Override
    protected com.poesys.db.dao.query.IParameterizedQuerySql<org.phoenixbioinformatics.api.db.api.IAccessRule, IAccessType> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QueryAccessRuleByAccessType();
    }

    @Override
    protected void set(java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> collection) {
      try {
        // Register the observer parent with the subject children.
        for (org.phoenixbioinformatics.api.db.api.IAccessRule child : collection) {
          child.attach(AbstractAccessTypeProxy.this.dto,
                              com.poesys.db.dao.DataEvent.MARKED_DELETED);
          child.attach(AbstractAccessTypeProxy.this.dto, com.poesys.db.dao.DataEvent.DELETE);
        }
        setAccessRule(collection);
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Just lazy loading here, not actually setting. Ignore this exception.        
      }
    }

    @Override
    public boolean isSet() {
      // Set if proxy has loaded accessRule
      return accessRuleLoaded;
    }
  }


  /**
   * Read-Object setter for de-serializing nested accessRule collection
   *
   * Source: AddAssociationClassCollectionProperties
   *
   * @see org.phoenixbioinformatics.api.db.api.sql.QueryAccessRule
   */
  private class ReadAccessRuleSetter 
      extends com.poesys.db.dto.AbstractCollectionReadSetter<org.phoenixbioinformatics.api.db.api.IAccessRule> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadAccessRuleSetter object to read the accessRule collection.
     */
    public ReadAccessRuleSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.AccessRule.class.getName();
    }

    @Override
    protected java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> getObjectCollection() {
      java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> accessRule = null;
      try {
        accessRule = ((org.phoenixbioinformatics.api.db.api.AccessType)dto).getAccessRule();
      } catch (java.sql.SQLException e) {
        throw new RuntimeException("SQL Exception on collection query: " + e.getMessage(), e);
      }
      return accessRule;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.phoenixbioinformatics.api.db.api.AccessType)dto).accessRuleKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IAccessRule> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QueryAccessRule();
    }

    @Override
    protected void set(java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> collection) {
      ((org.phoenixbioinformatics.api.db.api.AccessType)dto).accessRule = collection;
    }
  }


  /**
   * Add a org.phoenixbioinformatics.api.db.api.IAccessRule object to the AccessRule collection. The method
   * loads the collection if it is not already in memory.
   *
   * add method #1 (collection property)
   *
   * Source: AddAssociationClassCollectionProperties
   * 
   * @param object the org.phoenixbioinformatics.api.db.api.IAccessRule object to add to the collection
   * @throws java.sql.SQLException when there is a database problem
   */
  public void addAccessRuleAccessRule(org.phoenixbioinformatics.api.db.api.IAccessRule object)throws java.sql.SQLException {
    // Collection is lazily loaded, check and load if necessary.
    if (!accessRuleLoaded) {
      getAccessRule();
    }
    ((AccessType)dto).addAccessRuleAccessRule(object);
  }

  /**
   * Create a AccessTypeProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractAccessTypeProxy(AccessType dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters.add(new ReadUriPatternsSetter());
    readObjectSetters.add(new ReadAccessRuleSetter());
  }

  @Override
  public boolean equals(Object obj) {
    AbstractAccessTypeProxy otherProxy = (AbstractAccessTypeProxy)obj;
    return ((AccessType)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((AccessType)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  /**
   * Get an object of java.math.BigInteger
   *
   * Source: AddGeneratedKeyProperties
   * Lazy: false
   * 
   * @return a java.math.BigInteger
   */
  public java.math.BigInteger getAccessTypeId() {
    return ((AccessType)dto).getAccessTypeId();
  }

  /**
   * Get an object of java.lang.String
   *
   * Source: AddLocalAttributeProperties
   * Lazy: false
   * 
   * @return a java.lang.String
   */
  public java.lang.String getName() {
    return ((AccessType)dto).getName();
  }

  public void setName(java.lang.String name)
      throws com.poesys.db.InvalidParametersException {
    ((AccessType)dto).setName(name);
  }

  /**
   * Get a collection of org.phoenixbioinformatics.api.db.api.IUriPattern
   * loading the uriPatterns association if it is not already in memory.
   *
   * Source: TransformToProperty + AddToManyAssociationCollectionProperties
   * Lazy: true
   * 
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern>
   * @throws java.sql.SQLException when there is a database problem
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> getUriPatterns() throws java.sql.SQLException {
    // Lazy-load the local property uriPatterns if not loaded.
    if (!uriPatternsLoaded) {
      try {
        com.poesys.db.dto.ISet setter = new QueryUriPatternsSetter();
        setter.set(dto.getConnection());
      } catch (com.poesys.db.InvalidParametersException e) {
        throw new java.sql.SQLException(e.getMessage());
      }
    }
    return ((AccessType)dto).getUriPatterns();
  }

  /**
   * Clear the lazily loaded property uriPatterns if it is loaded.
   */
  public void clearUriPatterns() {
    // Only clear if loaded already.
    if (uriPatternsLoaded) {
      try {
        // Call the local lazy property setter to clear the property.
        ((AccessType)dto).setUriPattern(null);
        ((AccessType)dto).undoStatus();
        uriPatternsLoaded = false;
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Couldn't set status to CHANGED, ignore because we don't want it set
      }
    }
  }

  /**
   * Set the uriPatterns from a lazy-loading proxy. The IDbDto-
   * derived interface does not contain this method.
   *
   * @param uriPatterns the lazily loaded value to assign
   */
  public void setUriPattern(java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> uriPatterns)
      {
    ((AccessType)dto).setUriPattern(uriPatterns);
    // Mark the property loaded and undo the status change.
    dto.undoStatus();
    uriPatternsLoaded = true;
  }

  /**
   * Get a collection of org.phoenixbioinformatics.api.db.api.IAccessRule
   * loading the accessRule association if it is not already in memory.
   *
   * Source: AddAssociationClassCollectionProperties
   * Lazy: true
   * 
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule>
   * @throws java.sql.SQLException when there is a database problem
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> getAccessRule() throws java.sql.SQLException {
    // Lazy-load the local property accessRule if not loaded.
    if (!accessRuleLoaded) {
      try {
        com.poesys.db.dto.ISet setter = new QueryAccessRuleSetter();
        setter.set(dto.getConnection());
      } catch (com.poesys.db.InvalidParametersException e) {
        throw new java.sql.SQLException(e.getMessage());
      }
    }
    return ((AccessType)dto).getAccessRule();
  }

  /**
   * Clear the lazily loaded property accessRule if it is loaded.
   */
  public void clearAccessRule() {
    // Only clear if loaded already.
    if (accessRuleLoaded) {
      try {
        // Call the local lazy property setter to clear the property.
        ((AccessType)dto).setAccessRule(null);
        ((AccessType)dto).undoStatus();
        accessRuleLoaded = false;
      } catch (com.poesys.db.dto.DtoStatusException e) {
        // Couldn't set status to CHANGED, ignore because we don't want it set
      }
    }
  }

  /**
   * Set the accessRule from a lazy-loading proxy. The IDbDto-
   * derived interface does not contain this method.
   *
   * @param accessRule the lazily loaded value to assign
   * @throws com.poesys.db.InvalidParametersException when the property value is null
   */
  public void setAccessRule(java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> accessRule)
      throws com.poesys.db.InvalidParametersException {
    ((AccessType)dto).setAccessRule(accessRule);
    // Mark the property loaded and undo the status change.
    dto.undoStatus();
    accessRuleLoaded = true;
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((AccessType)dto).markChildrenDeleted();
  }
}
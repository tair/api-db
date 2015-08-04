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
 * A data-access layer data-transfer object for the ApiKey. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * Provides a set of API keys for use in authenticating callers of the API; only
 * authenticated callers may call the API
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
public abstract class AbstractApiKey extends AbstractDto implements IApiKey {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  

  /**
   * Create an empty ApiKey for use in building a new object. The 
   * concrete subclass must call this constructor.
   */
  public AbstractApiKey() {
    abstractClass = false;
    createInserters();
  }

  /**
   * Create a ApiKey. The concrete subclass must call this constructor.
   *
   * @param key the primary key of the ApiKey
   * @param apiKeyId primary key attribute
   * @param apiKey the API key token
   */
  public AbstractApiKey(IPrimaryKey key, java.math.BigInteger apiKeyId, java.lang.String apiKey) {
    this.key = key;

    this.apiKeyId = apiKeyId;

    if (apiKeyId == null) {
      throw new com.poesys.db.InvalidParametersException("apiKeyId is required for " + key.getValueList());
    }
    
    this.apiKey = apiKey;

    if (apiKey == null) {
      throw new com.poesys.db.InvalidParametersException("apiKey is required for " + key.getValueList());
    }
    
    abstractClass = false;
    createInserters();
  }

  @Override
  public boolean equals(Object arg0) {
    IApiKey other = (IApiKey)arg0;
    return other.getPrimaryKey().equals(key);
  }

  @Override
  public int hashCode() {
    return key.hashCode();
  }

  @Override
  public int compareTo(com.poesys.db.dto.IDbDto o) {
    IApiKey other = (IApiKey)o;
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
   * Nested property apiKeyId
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
  private java.math.BigInteger apiKeyId;
  
  /**
   * Get an object of java.math.BigInteger.
   *
   * Source: AddGeneratedKeyProperties
   * 
   * @return a java.math.BigInteger
   */

  public java.math.BigInteger getApiKeyId() {
    return apiKeyId;
  }

  /**
   * Clear the apiKeyId data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearApiKeyId() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }
  /**
   * Nested property apiKey
   *
   * <p>
   * the API key token
   * </p>
   *
   * Added by AddLocalAttributeProperties
   * Class is read/write: true
   * Class is immutable: false
   * Property is read/write: true
   * Property is lazy: false
   */
  private java.lang.String apiKey;
  
  /**
   * Get an object of java.lang.String.
   *
   * Source: AddLocalAttributeProperties
   * 
   * @return a java.lang.String
   */

  public java.lang.String getApiKey() {
    return apiKey;
  }

  /**
   * Clear the apiKey data member; override in proxy if lazily loaded,
   * otherwise this method does nothing.
   */
  public void clearApiKey() {
    // Override in proxy if lazily loaded; otherwise does nothing
  }

  /**
   * <p>
   * Set the apiKey.
   * </p>
   * <ul>
   * <li>Read/Write DTO: true</li>
   * <li>Immutable DTO: false</li>
   * <li>Read/Write property: true</li>
   * <li>Immutable property: false</li>
   * <li>Lazy property: false (if true, proxy calls this method)</li>
   * </ul>
   * <p>
   * the API key token
   * </p>
   *
   * @param apiKey the value with which to set the property
   * @throws com.poesys.db.InvalidParametersException when the input apiKey is null
   */
  public void setApiKey(java.lang.String apiKey)
      throws com.poesys.db.InvalidParametersException {
    if (apiKey == null) {
      throw new com.poesys.db.InvalidParametersException("apiKey is required");
    }
    
    this.apiKey = apiKey;
    setChanged();
  }

  @Override
  public void update(com.poesys.db.dto.ISubject subject,
                     com.poesys.db.dao.DataEvent event)
      throws com.poesys.db.dto.DtoStatusException {
  }

  /**
   * Create the inserters for the ApiKey and its superclasses.
   */
  private void createInserters() {
    com.poesys.db.dao.IDaoManager manager =
      com.poesys.db.dao.DaoManagerFactory.getManager(getSubsystem());
    final com.poesys.db.dao.IDaoFactory<org.phoenixbioinformatics.api.db.api.IApiKey> apiKeyFactory =
      manager.getFactory("org.phoenixbioinformatics.api.db.api.ApiKey",
                         getSubsystem(),
                         2147483647);
    com.poesys.db.dao.insert.IInsertSql<IApiKey> sql =
      new org.phoenixbioinformatics.api.db.api.sql.InsertApiKey();
    com.poesys.db.dao.insert.IInsert<IApiKey> inserter =
      apiKeyFactory.getInsert(sql, true);
    inserters.add(inserter);
  }
}
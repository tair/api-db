/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegate.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.bs.delegate.AbstractDataDelegate;
import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.connection.IConnectionFactory.DBMS;
import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.dao.update.IUpdateSql;
import com.poesys.db.dao.delete.IDeleteSql;
import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.dao.query.IQuerySql;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * ApiKey objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class ApiKeyDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * Provides a set of API keys for use in authenticating callers of the API; only
 * authenticated callers may call the API
 * </p>
 * @see ApiKeyDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractApiKeyDelegate
    extends AbstractDataDelegate<BsApiKey, org.phoenixbioinformatics.api.db.api.IApiKey, com.poesys.db.pk.SequencePrimaryKey> {
  /**
   * Create an AbstractApiKeyDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractApiKeyDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractApiKeyDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractApiKeyDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.phoenixbioinformatics.api.db.api.ApiKey.class.getName();
  }

  @Override
  protected IInsertSql<org.phoenixbioinformatics.api.db.api.IApiKey> getInsertSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.InsertApiKey();
  }

  @Override
  protected IDeleteSql<org.phoenixbioinformatics.api.db.api.IApiKey> getDeleteSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.DeleteApiKey();
  }

  @Override
  protected IUpdateSql<org.phoenixbioinformatics.api.db.api.IApiKey> getUpdateSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.UpdateApiKey();
  }

  @Override
  protected IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IApiKey> getQueryByKeySql() {
    return new org.phoenixbioinformatics.api.db.api.sql.QueryApiKey();
  }

  @Override
  protected IQuerySql<org.phoenixbioinformatics.api.db.api.IApiKey> getQueryListSql() {
    // Query-All method not required
    return new org.phoenixbioinformatics.api.db.api.sql.QueryAllApiKey();
  }

  @Override
  protected org.phoenixbioinformatics.api.bs.api.BsApiKey wrapData(org.phoenixbioinformatics.api.db.api.IApiKey dto) {
    return new org.phoenixbioinformatics.api.bs.api.BsApiKey(dto);
  }

  /**
   * <p>
   * Create a new ApiKey with data fields.
   * </p>
   * <p>
   * The ApiKey class has a sequence key; this method generates the
   * sequence for later insertion into the database.
   * </p>
   * 
   * @param apiKeyId primary key attribute
   * @param apiKey the API key token
   * @return the new ApiKey object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.phoenixbioinformatics.api.bs.api.BsApiKey createApiKey(java.math.BigInteger apiKeyId, java.lang.String apiKey)
      throws DelegateException {
      com.poesys.db.pk.SequencePrimaryKey key = null;

    // Generate a new ApiKey id if the input key is null.
    if (apiKeyId == null) {
      java.sql.Connection connection = null;
      try {
        connection = getConnection();
        if (connection == null) {
          throw new DelegateException("Could not get database connection to generate sequence");
        }
        
        if (dbms.equals(DBMS.MYSQL) || dbms.equals(DBMS.JNDI_MYSQL)) {
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createMySqlSequenceKey(connection,
                                                                      "ApiKey_SEQ",
                                                                      "apiKeyId",
                                                                      "org.phoenixbioinformatics.api.db.api.ApiKey");
        } else if (dbms.equals(DBMS.ORACLE) || dbms.equals(DBMS.JNDI_ORACLE)) {
          // Create key with sequence ApiKey_SEQ
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createOracleSequenceKey(connection,
                                                                       "ApiKey_SEQ",
                                                                       "apiKeyId",
                                                                       "org.phoenixbioinformatics.api.db.api.ApiKey");
        } else {
          throw new DelegateException("com.poesys.bs.delegate.msg.noDbms");
        }
        // Get the sequence number for use as an attribute value.
        apiKeyId = key.getValue();
      } catch (com.poesys.db.InvalidParametersException e) {
        Object[] args = e.getParameters().toArray();
        String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
        throw new DelegateException(message, e);
      } catch (com.poesys.db.NoPrimaryKeyException e) {
        Object[] args = e.getParameters().toArray();
        String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
        throw new DelegateException(message, e);
      } catch (java.sql.SQLException e) {
        throw new DelegateException(e.getMessage(), e);
      } finally {
        // Done with this connection, close it and return it to the pool.
        if (connection != null) {
          try {
            connection.close();
          } catch (java.sql.SQLException e) {
            throw new DelegateException(e.getMessage(), e);
          }
        }
      }
    } else {
      key = com.poesys.db.pk.PrimaryKeyFactory.createSequenceKey("apiKeyId", apiKeyId, "org.phoenixbioinformatics.api.db.api.ApiKey");
    }

    // Create a data-access DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.IApiKey dto =
      new org.phoenixbioinformatics.api.db.api.ApiKey(key, apiKeyId, apiKey);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsApiKey(dto);
  }

}

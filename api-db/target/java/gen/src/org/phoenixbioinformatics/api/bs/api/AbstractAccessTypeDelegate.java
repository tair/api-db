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
 * AccessType objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class AccessTypeDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * A particular kind of access to authorize
 * </p>
 * @see AccessTypeDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractAccessTypeDelegate
    extends AbstractDataDelegate<BsAccessType, org.phoenixbioinformatics.api.db.api.IAccessType, com.poesys.db.pk.SequencePrimaryKey> {
  /**
   * Create an AbstractAccessTypeDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractAccessTypeDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractAccessTypeDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractAccessTypeDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.phoenixbioinformatics.api.db.api.AccessType.class.getName();
  }

  @Override
  protected IInsertSql<org.phoenixbioinformatics.api.db.api.IAccessType> getInsertSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.InsertAccessType();
  }

  @Override
  protected IDeleteSql<org.phoenixbioinformatics.api.db.api.IAccessType> getDeleteSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.DeleteAccessType();
  }

  @Override
  protected IUpdateSql<org.phoenixbioinformatics.api.db.api.IAccessType> getUpdateSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.UpdateAccessType();
  }

  @Override
  protected IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IAccessType> getQueryByKeySql() {
    return new org.phoenixbioinformatics.api.db.api.sql.QueryAccessType();
  }

  @Override
  protected IQuerySql<org.phoenixbioinformatics.api.db.api.IAccessType> getQueryListSql() {
    // Query-All method not required
    return new org.phoenixbioinformatics.api.db.api.sql.QueryAllAccessType();
  }

  @Override
  protected org.phoenixbioinformatics.api.bs.api.BsAccessType wrapData(org.phoenixbioinformatics.api.db.api.IAccessType dto) {
    return new org.phoenixbioinformatics.api.bs.api.BsAccessType(dto);
  }

  /**
   * <p>
   * Create a new AccessType with data fields.
   * </p>
   * <p>
   * The AccessType class has a sequence key; this method generates the
   * sequence for later insertion into the database.
   * </p>
   * 
   * @param accessTypeId primary key attribute
   * @param name the name of the access type
   * @return the new AccessType object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.phoenixbioinformatics.api.bs.api.BsAccessType createAccessType(java.math.BigInteger accessTypeId, java.lang.String name)
      throws DelegateException {
      com.poesys.db.pk.SequencePrimaryKey key = null;

    // Generate a new AccessType id if the input key is null.
    if (accessTypeId == null) {
      java.sql.Connection connection = null;
      try {
        connection = getConnection();
        if (connection == null) {
          throw new DelegateException("Could not get database connection to generate sequence");
        }
        
        if (dbms.equals(DBMS.MYSQL) || dbms.equals(DBMS.JNDI_MYSQL)) {
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createMySqlSequenceKey(connection,
                                                                      "AccessType_SEQ",
                                                                      "accessTypeId",
                                                                      "org.phoenixbioinformatics.api.db.api.AccessType");
        } else if (dbms.equals(DBMS.ORACLE) || dbms.equals(DBMS.JNDI_ORACLE)) {
          // Create key with sequence AccessType_SEQ
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createOracleSequenceKey(connection,
                                                                       "AccessType_SEQ",
                                                                       "accessTypeId",
                                                                       "org.phoenixbioinformatics.api.db.api.AccessType");
        } else {
          throw new DelegateException("com.poesys.bs.delegate.msg.noDbms");
        }
        // Get the sequence number for use as an attribute value.
        accessTypeId = key.getValue();
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
      key = com.poesys.db.pk.PrimaryKeyFactory.createSequenceKey("accessTypeId", accessTypeId, "org.phoenixbioinformatics.api.db.api.AccessType");
    }

    // Create a data-access DTO proxy (supports lazy loading).
    org.phoenixbioinformatics.api.db.api.IAccessType dto =
      new org.phoenixbioinformatics.api.db.api.AccessTypeProxy(new org.phoenixbioinformatics.api.db.api.AccessType(key, accessTypeId, name));

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsAccessType(dto);
  }

  /**
   * Create a new AccessRule association class child of AccessType with 
   * an association key. This class links the input objects.
   * 
   * @param accessTypesObject associated AccessType object (part of the key)
   * @param partnerObject associated Partner object (part of the key)
   * @param uriPatternsObject associated UriPattern object (part of the key)
   * @param accessTypeId Attribute that is part of the association key
   * @param uriPatternId Attribute that is part of the association key
   * @param partnerId foreign key used as primary key in association class
   * @param partner 
   * @return a new AccessRule business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsAccessRule createAccessRule(org.phoenixbioinformatics.api.bs.api.BsAccessType accessTypesObject, org.phoenixbioinformatics.api.bs.api.BsPartner partnerObject, org.phoenixbioinformatics.api.bs.api.BsUriPattern uriPatternsObject, java.math.BigInteger accessTypeId, java.math.BigInteger uriPatternId, java.lang.String partnerId, org.phoenixbioinformatics.api.db.api.IPartner partner) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.AssociationPrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.pk.IPrimaryKey> list =
        new java.util.ArrayList<com.poesys.db.pk.IPrimaryKey>();
      list.add(accessTypesObject.getPrimaryKey());
      list.add(partnerObject.getPrimaryKey());
      list.add(uriPatternsObject.getPrimaryKey());
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createAssociationKey(list, "org.phoenixbioinformatics.api.db.api.AccessRule");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create an association-key child data-access AccessRule DTO proxy (supports lazy loading).
    org.phoenixbioinformatics.api.db.api.IAccessRule dto =
      new org.phoenixbioinformatics.api.db.api.AccessRuleProxy(new org.phoenixbioinformatics.api.db.api.AccessRule(key, accessTypesObject.toDto(), partnerObject.toDto(), uriPatternsObject.toDto(), accessTypeId, uriPatternId, partnerId, partner));

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsAccessRule(dto);
  }

  @Override
  public void truncateTable(String tableName) throws DelegateException {
    java.sql.Connection c = getConnection();
    com.poesys.db.dao.ddl.ISql sql = null;
    com.poesys.db.dao.ddl.IExecuteSql executive = null;

    // First truncate any child tables.
    sql = new com.poesys.db.dao.ddl.TruncateTableSql("AccessRule");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "AccessRule", e);
    }

    // Now truncate the current table.
    sql = new com.poesys.db.dao.ddl.TruncateTableSql(tableName);
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "AccessType", e);
    }
  }
}

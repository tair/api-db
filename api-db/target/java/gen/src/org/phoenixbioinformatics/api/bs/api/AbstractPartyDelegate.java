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
 * Party objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class PartyDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * An abstract entity that is either a person or an organization
 * </p>
 * @see PartyDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractPartyDelegate
    extends AbstractDataDelegate<BsParty, org.phoenixbioinformatics.api.db.api.IParty, com.poesys.db.pk.SequencePrimaryKey> {
  /**
   * Create an AbstractPartyDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractPartyDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractPartyDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractPartyDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.phoenixbioinformatics.api.db.api.Party.class.getName();
  }

  @Override
  protected IInsertSql<org.phoenixbioinformatics.api.db.api.IParty> getInsertSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.InsertParty();
  }

  @Override
  protected IDeleteSql<org.phoenixbioinformatics.api.db.api.IParty> getDeleteSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.DeleteParty();
  }

  @Override
  protected IUpdateSql<org.phoenixbioinformatics.api.db.api.IParty> getUpdateSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.UpdateParty();
  }

  @Override
  protected IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IParty> getQueryByKeySql() {
    return new org.phoenixbioinformatics.api.db.api.sql.QueryParty();
  }

  @Override
  protected IQuerySql<org.phoenixbioinformatics.api.db.api.IParty> getQueryListSql() {
    // Query-All method not required
    return new org.phoenixbioinformatics.api.db.api.sql.QueryAllParty();
  }

  @Override
  protected org.phoenixbioinformatics.api.bs.api.BsParty wrapData(org.phoenixbioinformatics.api.db.api.IParty dto) {
    return new org.phoenixbioinformatics.api.bs.api.BsParty(dto);
  }

  /**
   * <p>
   * Create a new Party with data fields.
   * </p>
   * <p>
   * The Party class has a sequence key; this method generates the
   * sequence for later insertion into the database.
   * </p>
   * 
   * @param partyId primary key attribute
   * @param name the name by which the party is known
   * @param partyType the kind of Party this is:
User
   * @param display 
   * @param countryId foreign key used by setter to query associated object
   * @return the new Party object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.phoenixbioinformatics.api.bs.api.BsParty createParty(java.math.BigInteger partyId, java.lang.String name, java.lang.String partyType, java.lang.Boolean display, java.math.BigInteger countryId)
      throws DelegateException {
      com.poesys.db.pk.SequencePrimaryKey key = null;

    // Generate a new Party id if the input key is null.
    if (partyId == null) {
      java.sql.Connection connection = null;
      try {
        connection = getConnection();
        if (connection == null) {
          throw new DelegateException("Could not get database connection to generate sequence");
        }
        
        if (dbms.equals(DBMS.MYSQL) || dbms.equals(DBMS.JNDI_MYSQL)) {
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createMySqlSequenceKey(connection,
                                                                      "Party_SEQ",
                                                                      "partyId",
                                                                      "org.phoenixbioinformatics.api.db.api.Party");
        } else if (dbms.equals(DBMS.ORACLE) || dbms.equals(DBMS.JNDI_ORACLE)) {
          // Create key with sequence Party_SEQ
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createOracleSequenceKey(connection,
                                                                       "Party_SEQ",
                                                                       "partyId",
                                                                       "org.phoenixbioinformatics.api.db.api.Party");
        } else {
          throw new DelegateException("com.poesys.bs.delegate.msg.noDbms");
        }
        // Get the sequence number for use as an attribute value.
        partyId = key.getValue();
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
      key = com.poesys.db.pk.PrimaryKeyFactory.createSequenceKey("partyId", partyId, "org.phoenixbioinformatics.api.db.api.Party");
    }

    // Create a data-access DTO proxy (supports lazy loading).
    org.phoenixbioinformatics.api.db.api.IParty dto =
      new org.phoenixbioinformatics.api.db.api.PartyProxy(new org.phoenixbioinformatics.api.db.api.Party(key, partyId, name, partyType, display, countryId));

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsParty(dto);
  }

  /**
   * Create a new IpRange child of Party with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param start the IP address that is the first address in the range; must not be part of any
other range for the subscription
   * @param end the IP address that is the last address in the range; must be greater than the
start and must be a "reasonable" end to the range (TBD)
   * @return a new IpRange business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsIpRange createIpRange(org.phoenixbioinformatics.api.bs.api.BsParty parent, java.math.BigInteger partyId, java.lang.String start, java.lang.String end) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("startIp", start));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.IpRange");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.IpRange");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access IpRange DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.IIpRange dto =
      new org.phoenixbioinformatics.api.db.api.IpRange(key, partyId, start, end);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsIpRange(dto);
  }
  /**
   * Create a new Login child of Party with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param username the unique, case-insensitive username for a party
   * @param password the password that authenticates the user/party
   * @param email the party's email address
   * @param institution the name of the organization to which the party belongs, such as a company or
university name
   * @param userIdentifier a partner-specific identifier for the user, represented as a string (such as the
TAIR community id); used by the partner to identify the user
   * @param partnerId foreign key used by setter to query associated object
   * @return a new Login business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsLogin createLogin(org.phoenixbioinformatics.api.bs.api.BsParty parent, java.math.BigInteger partyId, java.lang.String username, java.lang.String password, java.lang.String email, java.lang.String institution, java.lang.String userIdentifier, java.lang.String partnerId) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("username", username));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.Login");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.Login");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access Login DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.ILogin dto =
      new org.phoenixbioinformatics.api.db.api.Login(key, partyId, username, password, email, institution, userIdentifier, partnerId);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsLogin(dto);
  }
  /**
   * Create a new SubscriptionTransaction child of Party with a composite key.
   * 
   * @param bsSubscription the parent of the child object to create
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param transactionNo the identifying transaction number within the subscription that uniquely
identifies the transaction along with the subscription key
   * @param transactionDate the date and time of the transaction
   * @param startDate at the time of the transaction, the date at which the subscription commences
   * @param endDate at the time of the transaction, the date at which the subscription ends
   * @param transactionType the kind of transaction: Initial, Renewal, Refund
   * @param activationCodeId foreign key used by setter to query associated object
   * @return a new SubscriptionTransaction business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsSubscriptionTransaction createSubscriptionTransaction(BsSubscription bsSubscription, java.lang.String partnerId, java.math.BigInteger partyId, java.math.BigInteger transactionNo, java.sql.Timestamp transactionDate, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.lang.String transactionType, java.util.UUID activationCodeId) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.BigIntegerColumnValue("transactionNo", transactionNo));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.SubscriptionTransaction");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(bsSubscription.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.SubscriptionTransaction");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access SubscriptionTransaction DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction dto =
      new org.phoenixbioinformatics.api.db.api.SubscriptionTransaction(key, partnerId, partyId, transactionNo, transactionDate, startDate, endDate, transactionType, activationCodeId);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsSubscriptionTransaction(dto);
  }
  /**
   * Create a new Subscription association class child of Party with 
   * an association key. This class links the input objects.
   * 
   * @param subscribedPartnersObject associated Partner object (part of the key)
   * @param subscribersObject associated Party object (part of the key)
   * @param partnerId Attribute that is part of the association key
   * @param partyId Attribute that is part of the association key
   * @param startDate the date and time at which the subscription commences; if this is in the future,
the subscription is not yet in effect
   * @param endDate the date and time at which the subscription ends
   * @param subscriptionId an alternate single-number identifier for the subscription
   * @return a new Subscription business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsSubscription createSubscription(org.phoenixbioinformatics.api.bs.api.BsPartner subscribedPartnersObject, org.phoenixbioinformatics.api.bs.api.BsParty subscribersObject, java.lang.String partnerId, java.math.BigInteger partyId, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.math.BigInteger subscriptionId) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.AssociationPrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.pk.IPrimaryKey> list =
        new java.util.ArrayList<com.poesys.db.pk.IPrimaryKey>();
      list.add(subscribedPartnersObject.getPrimaryKey());
      list.add(subscribersObject.getPrimaryKey());
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createAssociationKey(list, "org.phoenixbioinformatics.api.db.api.Subscription");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create an association-key child data-access Subscription DTO proxy (supports lazy loading).
    org.phoenixbioinformatics.api.db.api.ISubscription dto =
      new org.phoenixbioinformatics.api.db.api.SubscriptionProxy(new org.phoenixbioinformatics.api.db.api.Subscription(key, subscribedPartnersObject.toDto(), subscribersObject.toDto(), partnerId, partyId, startDate, endDate, subscriptionId));

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsSubscription(dto);
  }

  @Override
  public void truncateTable(String tableName) throws DelegateException {
    java.sql.Connection c = getConnection();
    com.poesys.db.dao.ddl.ISql sql = null;
    com.poesys.db.dao.ddl.IExecuteSql executive = null;

    // First truncate any child tables.
    sql = new com.poesys.db.dao.ddl.TruncateTableSql("IpRange");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "IpRange", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("Login");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "Login", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("SubscriptionTransaction");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "SubscriptionTransaction", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("Subscription");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "Subscription", e);
    }

    // Now truncate the current table.
    sql = new com.poesys.db.dao.ddl.TruncateTableSql(tableName);
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "Party", e);
    }
  }
}

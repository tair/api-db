/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.phoenixbioinformatics.api.bs.api;


import java.math.BigInteger;
import java.sql.Connection;

import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.connection.IConnectionFactory;
import com.poesys.db.connection.IConnectionFactory.DBMS;
import com.poesys.db.pk.SequencePrimaryKey;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Partner objects and their dependents. This class delegates to an abstract
 * class, AbstractPartnerDelegate. You can modify this class to override methods
 * in that class or to add operations to the API.
 * </p>
 * <p>
 * a system that comprises a unit for subscription, authentication, and
 * authorization
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PartnerDelegate extends AbstractPartnerDelegate {
  private static final String NO_CONNECTION_FOR_SEQ =
    "Could not get database connection to generate sequence id for subscription";

  /**
   * Create a PartnerDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public PartnerDelegate(String subsystem) {
    super(subsystem);
  }

  /**
   * Create a PartnerDelegate object with a supplied subsystem and DBMS, usually
   * JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public PartnerDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }

  /**
   * Get a new subscription id using a sequence generator.
   *
   * @return the new ID
   */
  public BigInteger getSubscriptionId() {
    // TODO refactor this into Poesys/DB as generic code
    Connection connection = null;
    BigInteger id = null;
    SequencePrimaryKey key = null;

    try {
      connection = getConnection();
      if (connection == null) {
        throw new DelegateException(NO_CONNECTION_FOR_SEQ);
      }

      if (dbms.equals(DBMS.MYSQL) || dbms.equals(DBMS.JNDI_MYSQL)) {
        key =
          com.poesys.db.pk.PrimaryKeyFactory.createMySqlSequenceKey(connection,
                                                                    "Subscription_SEQ",
                                                                    "subscriptionId",
                                                                    "org.phoenixbioinformatics.api.db.api.Subscription");
      } else if (dbms.equals(DBMS.ORACLE) || dbms.equals(DBMS.JNDI_ORACLE)) {
        // Create key with sequence Country_SEQ
        key =
          com.poesys.db.pk.PrimaryKeyFactory.createOracleSequenceKey(connection,
                                                                     "Subscription_SEQ",
                                                                     "subscriptionId",
                                                                     "org.phoenixbioinformatics.api.db.api.Subscription");
      } else {
        throw new DelegateException("com.poesys.bs.delegate.msg.noDbms");
      }
      if (key != null) {
        id = key.getValue();
      }
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
    return id;
  }
}
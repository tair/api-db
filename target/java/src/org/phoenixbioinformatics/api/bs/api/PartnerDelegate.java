/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Partner objects and their dependents. This class delegates to an abstract
 * class, AbstractPartnerDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * a system that comprises a unit for subscription, authentication, and
 * authorization
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PartnerDelegate extends AbstractPartnerDelegate {
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
   * Create a PartnerDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
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
  public Long getSubscriptionId() {
    // TODO Temporarily use random number; replace with Oracle sequence call
    java.util.Random r = new java.util.Random();

    return r.nextLong();
  }
  
}
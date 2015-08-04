/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Party objects and their dependents. This class delegates to an abstract
 * class, AbstractPartyDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * An abstract entity that is either a person or an organization
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PartyDelegate extends AbstractPartyDelegate {
  /**
   * Create a PartyDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public PartyDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a PartyDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public PartyDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}
/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: Delegate.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.connection.IConnectionFactory;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * PageView objects and their dependents. This class delegates to an abstract
 * class, AbstractPageViewDelegate. You can modify this class to override
 * methods in that class or to add operations to the API.
 * </p>
 * <p>
 * A single access of a URI for a given IP address at a given date and time; may be
 * part of a session if it has a session id
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PageViewDelegate extends AbstractPageViewDelegate {
  /**
   * Create a PageViewDelegate object with a supplied subsystem, using the
   * default database properties (usually for testing).
   * 
   * @param subsystem the subsystem to use
   */
  public PageViewDelegate(String subsystem) {
    super(subsystem);
  }
  
  /**
   * Create a PageViewDelegate object with a supplied subsystem and DBMS,
   * usually JNDI for production/test usage with an application server.
   * 
   * @param subsystem the subsystem to use
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public PageViewDelegate(String subsystem, IConnectionFactory.DBMS dbms) {
    super(subsystem, dbms);
  }
  
}
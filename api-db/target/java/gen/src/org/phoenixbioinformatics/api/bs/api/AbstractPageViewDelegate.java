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
 * PageView objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class PageViewDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * A single access of a URI for a given IP address at a given date and time; may be
 * part of a session if it has a session id
 * </p>
 * @see PageViewDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractPageViewDelegate
    extends AbstractDataDelegate<BsPageView, org.phoenixbioinformatics.api.db.api.IPageView, com.poesys.db.pk.SequencePrimaryKey> {
  /**
   * Create an AbstractPageViewDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractPageViewDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractPageViewDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractPageViewDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.phoenixbioinformatics.api.db.api.PageView.class.getName();
  }

  @Override
  protected IInsertSql<org.phoenixbioinformatics.api.db.api.IPageView> getInsertSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.InsertPageView();
  }

  @Override
  protected IDeleteSql<org.phoenixbioinformatics.api.db.api.IPageView> getDeleteSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.DeletePageView();
  }

  @Override
  protected IUpdateSql<org.phoenixbioinformatics.api.db.api.IPageView> getUpdateSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.UpdatePageView();
  }

  @Override
  protected IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IPageView> getQueryByKeySql() {
    return new org.phoenixbioinformatics.api.db.api.sql.QueryPageView();
  }

  @Override
  protected IQuerySql<org.phoenixbioinformatics.api.db.api.IPageView> getQueryListSql() {
    // Query-All method not required
    return new org.phoenixbioinformatics.api.db.api.sql.QueryAllPageView();
  }

  @Override
  protected org.phoenixbioinformatics.api.bs.api.BsPageView wrapData(org.phoenixbioinformatics.api.db.api.IPageView dto) {
    return new org.phoenixbioinformatics.api.bs.api.BsPageView(dto);
  }

  /**
   * <p>
   * Create a new PageView with data fields.
   * </p>
   * <p>
   * The PageView class has a sequence key; this method generates the
   * sequence for later insertion into the database.
   * </p>
   * 
   * @param pageViewId primary key attribute
   * @param pageViewDate the date and time of the page view request
   * @param uri the request URI and any query string
   * @param ip the IP address of the requests in the session; all page views in the session
have this IP address
   * @param sessionId a token identifying a collection of page views as defined by the client
processing the page views
   * @param partyId foreign key used by setter to query associated object
   * @return the new PageView object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.phoenixbioinformatics.api.bs.api.BsPageView createPageView(java.math.BigInteger pageViewId, java.sql.Timestamp pageViewDate, java.lang.String uri, java.lang.String ip, java.lang.String sessionId, java.math.BigInteger partyId)
      throws DelegateException {
      com.poesys.db.pk.SequencePrimaryKey key = null;

    // Generate a new PageView id if the input key is null.
    if (pageViewId == null) {
      java.sql.Connection connection = null;
      try {
        connection = getConnection();
        if (connection == null) {
          throw new DelegateException("Could not get database connection to generate sequence");
        }
        
        if (dbms.equals(DBMS.MYSQL) || dbms.equals(DBMS.JNDI_MYSQL)) {
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createMySqlSequenceKey(connection,
                                                                      "PageView_SEQ",
                                                                      "pageViewId",
                                                                      "org.phoenixbioinformatics.api.db.api.PageView");
        } else if (dbms.equals(DBMS.ORACLE) || dbms.equals(DBMS.JNDI_ORACLE)) {
          // Create key with sequence PageView_SEQ
          key =
            com.poesys.db.pk.PrimaryKeyFactory.createOracleSequenceKey(connection,
                                                                       "PageView_SEQ",
                                                                       "pageViewId",
                                                                       "org.phoenixbioinformatics.api.db.api.PageView");
        } else {
          throw new DelegateException("com.poesys.bs.delegate.msg.noDbms");
        }
        // Get the sequence number for use as an attribute value.
        pageViewId = key.getValue();
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
      key = com.poesys.db.pk.PrimaryKeyFactory.createSequenceKey("pageViewId", pageViewId, "org.phoenixbioinformatics.api.db.api.PageView");
    }

    // Create a data-access DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.IPageView dto =
      new org.phoenixbioinformatics.api.db.api.PageView(key, pageViewId, pageViewDate, uri, ip, sessionId, partyId);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsPageView(dto);
  }

}
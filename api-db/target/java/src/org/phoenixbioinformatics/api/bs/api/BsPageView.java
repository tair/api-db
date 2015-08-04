/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the PageView. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A single access of a URI for a given IP address at a given date and time; may be
 * part of a session if it has a session id
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 *     <li>SequenceKey</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsPageView extends org.phoenixbioinformatics.api.bs.api.AbstractBsPageView {
  /**
   * Create a BsPageView object from a PageView object.
   * 
   * @param dto the data-access layer PageView DTO
   * @throws DelegateException when there is a problem creating the PageView
   */
  public BsPageView(org.phoenixbioinformatics.api.db.api.IPageView dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsPageView. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the PageView
   * @param pageViewId primary key attribute
   * @param pageViewDate the date and time of the page view request
   * @param uri the request URI and any query string
   * @param ip the IP address of the requests in the session; all page views in the session
have this IP address
   * @param sessionId a token identifying a collection of page views as defined by the client
processing the page views
   * @param partyId foreign key used by setter to query associated object
   */
  public BsPageView(IPrimaryKey key, java.math.BigInteger pageViewId, java.sql.Timestamp pageViewDate, java.lang.String uri, java.lang.String ip, java.lang.String sessionId, java.math.BigInteger partyId) {
    super(key, pageViewId, pageViewDate, uri, ip, sessionId, partyId); 
  }
}
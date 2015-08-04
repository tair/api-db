/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the UriPattern. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A regular expression pattern that specifies a set of URIs
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
public class BsUriPattern extends org.phoenixbioinformatics.api.bs.api.AbstractBsUriPattern {
  /**
   * Create a BsUriPattern object from a UriPattern object.
   * 
   * @param dto the data-access layer UriPattern DTO
   * @throws DelegateException when there is a problem creating the UriPattern
   */
  public BsUriPattern(org.phoenixbioinformatics.api.db.api.IUriPattern dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsUriPattern. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the UriPattern
   * @param uriPatternId primary key attribute
   * @param pattern a regular expression that identifies a set of URIs
   */
  public BsUriPattern(IPrimaryKey key, java.math.BigInteger uriPatternId, java.lang.String pattern) {
    super(key, uriPatternId, pattern); 
  }
}
/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the UriPattern. This class
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
public class UriPattern extends AbstractUriPattern {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a UriPattern as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public UriPattern() {
    super(); 
  }

  /**
   * <p>
   * Create a UriPattern. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the UriPattern
   * @param uriPatternId primary key attribute
   * @param pattern a regular expression that identifies a set of URIs
   */
  public UriPattern(IPrimaryKey key, java.math.BigInteger uriPatternId, java.lang.String pattern) {
    super(key, uriPatternId, pattern); 
  }
}
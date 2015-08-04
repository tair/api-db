/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the PartnerPattern. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A regular expression pattern that identifies a set of URIs for the partner
 * system; the complete set of patterns for the partner defines the complete set of
 * URIs for the partner system; the patterns must be mutually exclusive across all
 * partners and patterns.
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class PartnerPattern extends AbstractPartnerPattern {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a PartnerPattern as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public PartnerPattern() {
    super(); 
  }

  /**
   * <p>
   * Create a PartnerPattern. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the PartnerPattern
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sourceUri the source URI that the user requests; this is a regular expression that
identifies a set of potential URIs in a complete match scenario; this is the
original URI that comes into the proxy server
   * @param targetUri the URI that replaces the complete match on the source URI; this is the URI that
identifies the partner server (the proxied URI for the proxy server)
   */
  public PartnerPattern(IPrimaryKey key, java.math.BigInteger partnerId, java.lang.String sourceUri, java.lang.String targetUri) {
    super(key, partnerId, sourceUri, targetUri); 
  }
}
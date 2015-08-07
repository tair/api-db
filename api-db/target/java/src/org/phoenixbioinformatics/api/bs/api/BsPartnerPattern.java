/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the PartnerPattern. This class
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
public class BsPartnerPattern extends org.phoenixbioinformatics.api.bs.api.AbstractBsPartnerPattern {
  /**
   * Create a BsPartnerPattern object from a PartnerPattern object.
   * 
   * @param dto the data-access layer PartnerPattern DTO
   * @throws DelegateException when there is a problem creating the PartnerPattern
   */
  public BsPartnerPattern(org.phoenixbioinformatics.api.db.api.IPartnerPattern dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsPartnerPattern. This constructor calls the abstract superclass 
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
  public BsPartnerPattern(IPrimaryKey key, java.lang.String partnerId, java.lang.String sourceUri, java.lang.String targetUri) {
    super(key, partnerId, sourceUri, targetUri); 
  }
}
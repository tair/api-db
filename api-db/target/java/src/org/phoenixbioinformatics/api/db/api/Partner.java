/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Partner. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * a system that comprises a unit for subscription, authentication, and
 * authorization
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>NaturalKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class Partner extends AbstractPartner {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Partner as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Partner() {
    super(); 
  }

  /**
   * <p>
   * Create a Partner. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Partner
   * @param partnerId 
   * @param name the name of the partner system
   * @param logoUri a URI that returns a logo for the partner
   * @param termOfServiceUri a URI that returns an array of subscription terms for the partner
   */
  public Partner(IPrimaryKey key, java.lang.String partnerId, java.lang.String name, java.lang.String logoUri, java.lang.String termOfServiceUri) {
    super(key, partnerId, name, logoUri, termOfServiceUri); 
  }
}
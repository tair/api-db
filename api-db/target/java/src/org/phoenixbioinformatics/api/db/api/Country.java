/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Country. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * a country with a unique name
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
public class Country extends AbstractCountry {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Country as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Country() {
    super(); 
  }

  /**
   * <p>
   * Create a Country. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Country
   * @param countryId primary key attribute
   * @param name the unique name of the country
   */
  public Country(IPrimaryKey key, java.math.BigInteger countryId, java.lang.String name) {
    super(key, countryId, name); 
  }
}
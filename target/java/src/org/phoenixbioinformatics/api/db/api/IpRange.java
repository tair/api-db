/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the IpRange. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A range of IP addresses for a subscription; ranges must not overlap for a
 * subscription, they must be mutually exclusive
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
public class IpRange extends AbstractIpRange {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a IpRange as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public IpRange() {
    super(); 
  }

  /**
   * <p>
   * Create a IpRange. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the IpRange
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param start the IP address that is the first address in the range; must not be part of any
other range for the subscription
   * @param end the IP address that is the last address in the range; must be greater than the
start and must be a "reasonable" end to the range (TBD)
   */
  public IpRange(IPrimaryKey key, java.math.BigInteger partyId, java.lang.String start, java.lang.String end) {
    super(key, partyId, start, end); 
  }
}
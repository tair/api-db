/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the IpRange. This class
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
public class BsIpRange extends org.phoenixbioinformatics.api.bs.api.AbstractBsIpRange {
  /**
   * Create a BsIpRange object from a IpRange object.
   * 
   * @param dto the data-access layer IpRange DTO
   * @throws DelegateException when there is a problem creating the IpRange
   */
  public BsIpRange(org.phoenixbioinformatics.api.db.api.IIpRange dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsIpRange. This constructor calls the abstract superclass 
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
  public BsIpRange(IPrimaryKey key, java.math.BigInteger partyId, java.lang.String start, java.lang.String end) {
    super(key, partyId, start, end); 
  }
}
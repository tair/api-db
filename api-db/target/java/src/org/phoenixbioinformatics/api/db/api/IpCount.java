/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the IpCount. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A counter for each IP address that has accessed a partner
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
public class IpCount extends AbstractIpCount {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a IpCount as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public IpCount() {
    super(); 
  }

  /**
   * <p>
   * Create a IpCount. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the IpCount
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param ip the IP address being tracked (IPv4 or IPv6)
   * @param count the count of page views by the IP address since initialization
   */
  public IpCount(IPrimaryKey key, java.lang.String partnerId, java.lang.String ip, java.lang.Integer count) {
    super(key, partnerId, ip, count); 
  }
}
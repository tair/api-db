/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the LimitValue. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An integer count that sets a boundary; the set of counts is a series of integer
 * boundaries that the metering system uses to take its actions--usually the last
 * one is the blocking limit, while the earlier ones provide warnings
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
public class BsLimitValue extends org.phoenixbioinformatics.api.bs.api.AbstractBsLimitValue {
  /**
   * Create a BsLimitValue object from a LimitValue object.
   * 
   * @param dto the data-access layer LimitValue DTO
   * @throws DelegateException when there is a problem creating the LimitValue
   */
  public BsLimitValue(org.phoenixbioinformatics.api.db.api.ILimitValue dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLimitValue. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the LimitValue
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param value the count at which the limit applies
   */
  public BsLimitValue(IPrimaryKey key, java.lang.String partnerId, java.lang.Integer value) {
    super(key, partnerId, value); 
  }
}
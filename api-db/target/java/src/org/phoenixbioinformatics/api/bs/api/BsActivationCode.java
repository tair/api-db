/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the ActivationCode. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A code that a subscriber can use to activate their subscription to a partner;
 * the code is the key for the class
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>GuidKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsActivationCode extends org.phoenixbioinformatics.api.bs.api.AbstractBsActivationCode {
  /**
   * Create a BsActivationCode object from a ActivationCode object.
   * 
   * @param dto the data-access layer ActivationCode DTO
   * @throws DelegateException when there is a problem creating the ActivationCode
   */
  public BsActivationCode(org.phoenixbioinformatics.api.db.api.IActivationCode dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsActivationCode. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ActivationCode
   * @param activationCodeId primary key attribute
   * @param period The number of months for the subscription activated by the code
   * @param purchaseDate the date on which the subscriber purchased the code; possibly used to expire the
code if needed
   * @param partnerId foreign key used by setter to query associated object
   */
  public BsActivationCode(IPrimaryKey key, java.util.UUID activationCodeId, java.lang.Integer period, java.sql.Timestamp purchaseDate, java.lang.String partnerId) {
    super(key, activationCodeId, period, purchaseDate, partnerId); 
  }
}
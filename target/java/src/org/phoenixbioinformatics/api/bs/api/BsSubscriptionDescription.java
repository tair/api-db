/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the SubscriptionDescription. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A collection of descriptive texts to display for a particular kind of
 * subscription; a partner may have any number of such texts to display in
 * different named contexts
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
public class BsSubscriptionDescription extends org.phoenixbioinformatics.api.bs.api.AbstractBsSubscriptionDescription {
  /**
   * Create a BsSubscriptionDescription object from a SubscriptionDescription object.
   * 
   * @param dto the data-access layer SubscriptionDescription DTO
   * @throws DelegateException when there is a problem creating the SubscriptionDescription
   */
  public BsSubscriptionDescription(org.phoenixbioinformatics.api.db.api.ISubscriptionDescription dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsSubscriptionDescription. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the SubscriptionDescription
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param header the header text for the section display
   * @param descriptionType the type of description:
Default
Individual
Institution
Commercial
   */
  public BsSubscriptionDescription(IPrimaryKey key, java.math.BigInteger partnerId, java.lang.String header, java.lang.String descriptionType) {
    super(key, partnerId, header, descriptionType); 
  }
}
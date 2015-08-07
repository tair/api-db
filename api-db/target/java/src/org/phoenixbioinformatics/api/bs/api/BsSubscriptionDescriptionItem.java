/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the SubscriptionDescriptionItem. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A specific item of descriptive text
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
public class BsSubscriptionDescriptionItem extends org.phoenixbioinformatics.api.bs.api.AbstractBsSubscriptionDescriptionItem {
  /**
   * Create a BsSubscriptionDescriptionItem object from a SubscriptionDescriptionItem object.
   * 
   * @param dto the data-access layer SubscriptionDescriptionItem DTO
   * @throws DelegateException when there is a problem creating the SubscriptionDescriptionItem
   */
  public BsSubscriptionDescriptionItem(org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsSubscriptionDescriptionItem. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the SubscriptionDescriptionItem
   * @param descriptionType composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param itemNo the number that identifies the description item within the description
   * @param text the text to display for the type of context
   */
  public BsSubscriptionDescriptionItem(IPrimaryKey key, java.lang.String descriptionType, java.lang.String partnerId, java.math.BigInteger itemNo, java.lang.String text) {
    super(key, descriptionType, partnerId, itemNo, text); 
  }
}
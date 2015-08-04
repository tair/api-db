/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the SubscriptionDescriptionItem. This class
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
public class SubscriptionDescriptionItem extends AbstractSubscriptionDescriptionItem {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a SubscriptionDescriptionItem as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public SubscriptionDescriptionItem() {
    super(); 
  }

  /**
   * <p>
   * Create a SubscriptionDescriptionItem. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the SubscriptionDescriptionItem
   * @param header composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param itemNo the number that identifies the description item within the description
   * @param text the text to display for the type of context
   */
  public SubscriptionDescriptionItem(IPrimaryKey key, java.lang.String header, java.math.BigInteger partnerId, java.math.BigInteger itemNo, java.lang.String text) {
    super(key, header, partnerId, itemNo, text); 
  }
}
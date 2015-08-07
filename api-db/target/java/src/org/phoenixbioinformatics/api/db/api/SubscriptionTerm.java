/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the SubscriptionTerm. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A standardized period of time and price for access during that period
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
public class SubscriptionTerm extends AbstractSubscriptionTerm {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a SubscriptionTerm as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public SubscriptionTerm() {
    super(); 
  }

  /**
   * <p>
   * Create a SubscriptionTerm. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the SubscriptionTerm
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param period the period of time for which a subscription allows access to a partner system
   * @param price the price for a subscription for this term
   * @param groupDiscountPercentage the discount for this term for a group subscription expressed as a decimal
number with 2 significant digits
   * @param description text describing the term suitable for display in the user interface, such as
"Annual ($199 USD)" for a 365-day term priced at $199
   */
  public SubscriptionTerm(IPrimaryKey key, java.lang.String partnerId, java.lang.Integer period, java.lang.Double price, java.lang.Double groupDiscountPercentage, java.lang.String description) {
    super(key, partnerId, period, price, groupDiscountPercentage, description); 
  }
}
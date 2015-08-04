/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the SubscriptionDescription. This class
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
public class SubscriptionDescription extends AbstractSubscriptionDescription {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a SubscriptionDescription as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public SubscriptionDescription() {
    super(); 
  }

  /**
   * <p>
   * Create a SubscriptionDescription. This constructor calls the abstract superclass 
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
  public SubscriptionDescription(IPrimaryKey key, java.math.BigInteger partnerId, java.lang.String header, java.lang.String descriptionType) {
    super(key, partnerId, header, descriptionType); 
  }
}
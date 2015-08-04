/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.phoenixbioinformatics.api.db.api;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * SubscriptionDescription. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * A collection of descriptive texts to display for a particular kind of
 * subscription; a partner may have any number of such texts to display in
 * different named contexts
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class SubscriptionDescriptionProxy extends AbstractSubscriptionDescriptionProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a SubscriptionDescriptionProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public SubscriptionDescriptionProxy(SubscriptionDescription dto) {
    super(dto); 
  }
}
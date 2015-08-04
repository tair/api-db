/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.phoenixbioinformatics.api.db.api;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * Subscription. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * An agreement by a party to take and pay for access to a partner system; a
 * relationship between a party and a partner system
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class SubscriptionProxy extends AbstractSubscriptionProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a SubscriptionProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public SubscriptionProxy(Subscription dto) {
    super(dto); 
  }
}
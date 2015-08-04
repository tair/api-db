/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.phoenixbioinformatics.api.db.api;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * AccessRule. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * A rule that links a set of URIs to a specific access type for a specific partner
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class AccessRuleProxy extends AbstractAccessRuleProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a AccessRuleProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public AccessRuleProxy(AccessRule dto) {
    super(dto); 
  }
}
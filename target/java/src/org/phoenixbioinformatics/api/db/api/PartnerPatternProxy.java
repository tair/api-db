/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.phoenixbioinformatics.api.db.api;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * PartnerPattern. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * A regular expression pattern that identifies a set of URIs for the partner
 * system; the complete set of patterns for the partner defines the complete set of
 * URIs for the partner system; the patterns must be mutually exclusive across all
 * partners and patterns.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PartnerPatternProxy extends AbstractPartnerPatternProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a PartnerPatternProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public PartnerPatternProxy(PartnerPattern dto) {
    super(dto); 
  }
}
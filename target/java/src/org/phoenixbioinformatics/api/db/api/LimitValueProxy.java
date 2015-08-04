/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDtoProxy.vsl

package org.phoenixbioinformatics.api.db.api;


/**
 * <p>
 * A data-access layer proxy for the data-transfer object (DTO) for the 
 * LimitValue. This class is the concrete subclass of the generated abstract 
 * class. Make any changes to proxy behavior by overriding methods here rather 
 * than changing the abstract superclass; AndroMDA will overwrite that class 
 * when you run it but will never overwrite this concrete subclass.
 * </p>
 * <p>
 * An integer count that sets a boundary; the set of counts is a series of integer
 * boundaries that the metering system uses to take its actions--usually the last
 * one is the blocking limit, while the earlier ones provide warnings
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class LimitValueProxy extends AbstractLimitValueProxy {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a LimitValueProxy as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   * @param dto the DTO to proxy
   */
  public LimitValueProxy(LimitValue dto) {
    super(dto); 
  }
}
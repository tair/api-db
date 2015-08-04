/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDtoProxy.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.dto.AbstractLazyLoadingDtoProxy;


/**
 * <p>
 * A data-access layer data-transfer object (DTO) lazy-loading proxy for the 
 * LimitValue. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * An integer count that sets a boundary; the set of counts is a series of integer
 * boundaries that the metering system uses to take its actions--usually the last
 * one is the blocking limit, while the earlier ones provide warnings
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractLimitValueProxy extends AbstractLazyLoadingDtoProxy implements ILimitValue {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a LimitValueProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractLimitValueProxy(LimitValue dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractLimitValueProxy otherProxy = (AbstractLimitValueProxy)obj;
    return ((LimitValue)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((LimitValue)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  /**
   * Get an object of java.math.BigInteger
   *
   * Source: AddGeneratedKeyProperties + AddParentKeyAttributes
   * Lazy: false
   * 
   * @return a java.math.BigInteger
   */
  public java.math.BigInteger getPartnerId() {
    return ((LimitValue)dto).getPartnerId();
  }

  /**
   * Get an object of java.lang.Integer
   *
   * Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Lazy: false
   * 
   * @return a java.lang.Integer
   */
  public java.lang.Integer getValue() {
    return ((LimitValue)dto).getValue();
  }

  /**
   * Get an object of org.phoenixbioinformatics.api.db.api.IPartner
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   * Lazy: false
   * 
   * @return a org.phoenixbioinformatics.api.db.api.IPartner
   */
  public org.phoenixbioinformatics.api.db.api.IPartner getPartner() {
    return ((LimitValue)dto).getPartner();
  }

  public void setPartner(org.phoenixbioinformatics.api.db.api.IPartner partner)
      throws com.poesys.db.InvalidParametersException {
    ((LimitValue)dto).setPartner(partner);
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((LimitValue)dto).markChildrenDeleted();
  }
}
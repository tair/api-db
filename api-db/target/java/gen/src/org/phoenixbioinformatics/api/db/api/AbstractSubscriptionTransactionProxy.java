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
 * SubscriptionTransaction. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A specific transaction related to the subscription; provides the transactional
 * history for the subscription
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractSubscriptionTransactionProxy extends AbstractLazyLoadingDtoProxy implements ISubscriptionTransaction {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  
  /**
   * Create a SubscriptionTransactionProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractSubscriptionTransactionProxy(SubscriptionTransaction dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
  }

  @Override
  public boolean equals(Object obj) {
    AbstractSubscriptionTransactionProxy otherProxy = (AbstractSubscriptionTransactionProxy)obj;
    return ((SubscriptionTransaction)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((SubscriptionTransaction)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  /**
   * Get an object of java.lang.String
   *
   * Source: AddNaturalKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes
   * Lazy: false
   * 
   * @return a java.lang.String
   */
  public java.lang.String getPartnerId() {
    return ((SubscriptionTransaction)dto).getPartnerId();
  }

  /**
   * Get an object of java.math.BigInteger
   *
   * Source: AddGeneratedKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes
   * Lazy: false
   * 
   * @return a java.math.BigInteger
   */
  public java.math.BigInteger getPartyId() {
    return ((SubscriptionTransaction)dto).getPartyId();
  }

  /**
   * Get an object of java.math.BigInteger
   *
   * Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Lazy: false
   * 
   * @return a java.math.BigInteger
   */
  public java.math.BigInteger getTransactionNo() {
    return ((SubscriptionTransaction)dto).getTransactionNo();
  }

  /**
   * Get an object of java.sql.Timestamp
   *
   * Source: AddLocalAttributeProperties
   * Lazy: false
   * 
   * @return a java.sql.Timestamp
   */
  public java.sql.Timestamp getTransactionDate() {
    return ((SubscriptionTransaction)dto).getTransactionDate();
  }

  public void setTransactionDate(java.sql.Timestamp transactionDate)
      throws com.poesys.db.InvalidParametersException {
    ((SubscriptionTransaction)dto).setTransactionDate(transactionDate);
  }

  /**
   * Get an object of java.sql.Timestamp
   *
   * Source: AddLocalAttributeProperties
   * Lazy: false
   * 
   * @return a java.sql.Timestamp
   */
  public java.sql.Timestamp getStartDate() {
    return ((SubscriptionTransaction)dto).getStartDate();
  }

  public void setStartDate(java.sql.Timestamp startDate)
      throws com.poesys.db.InvalidParametersException {
    ((SubscriptionTransaction)dto).setStartDate(startDate);
  }

  /**
   * Get an object of java.sql.Timestamp
   *
   * Source: AddLocalAttributeProperties
   * Lazy: false
   * 
   * @return a java.sql.Timestamp
   */
  public java.sql.Timestamp getEndDate() {
    return ((SubscriptionTransaction)dto).getEndDate();
  }

  public void setEndDate(java.sql.Timestamp endDate)
      throws com.poesys.db.InvalidParametersException {
    ((SubscriptionTransaction)dto).setEndDate(endDate);
  }

  /**
   * Get an object of java.lang.String
   *
   * Source: AddLocalAttributeProperties
   * Lazy: false
   * 
   * @return a java.lang.String
   */
  public java.lang.String getTransactionType() {
    return ((SubscriptionTransaction)dto).getTransactionType();
  }

  public void setTransactionType(java.lang.String transactionType)
      throws com.poesys.db.InvalidParametersException {
    ((SubscriptionTransaction)dto).setTransactionType(transactionType);
  }

  /**
   * Get an object of org.phoenixbioinformatics.api.db.api.IActivationCode
   *
   * Source: AddToOneAssociationOptionalObjectProperties
   * Lazy: false
   * 
   * @return a org.phoenixbioinformatics.api.db.api.IActivationCode
   */
  public org.phoenixbioinformatics.api.db.api.IActivationCode getActivationCode() {
    return ((SubscriptionTransaction)dto).getActivationCode();
  }

  public void setActivationCode(org.phoenixbioinformatics.api.db.api.IActivationCode activationCode)
      {
    ((SubscriptionTransaction)dto).setActivationCode(activationCode);
  }

  /**
   * Get an object of org.phoenixbioinformatics.api.db.api.ISubscription
   *
   * Source: AddToOneAssociationRequiredObjectProperties
   * Lazy: false
   * 
   * @return a org.phoenixbioinformatics.api.db.api.ISubscription
   */
  public org.phoenixbioinformatics.api.db.api.ISubscription getSubscription() {
    return ((SubscriptionTransaction)dto).getSubscription();
  }

  public void setSubscription(org.phoenixbioinformatics.api.db.api.ISubscription subscription)
      throws com.poesys.db.InvalidParametersException {
    ((SubscriptionTransaction)dto).setSubscription(subscription);
  }

  /**
   * Get an object of java.util.UUID
   *
   * Source: AddGeneratedGuidKeyProperties + AddToOneAssociationAttributeProperties
   * Lazy: false
   * 
   * @return a java.util.UUID
   */
  public java.util.UUID getActivationCodeId() {
    return ((SubscriptionTransaction)dto).getActivationCodeId();
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((SubscriptionTransaction)dto).markChildrenDeleted();
  }
}
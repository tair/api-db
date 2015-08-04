/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: IDbDto.vsl

package org.phoenixbioinformatics.api.db.api;

import com.poesys.db.dto.IDbDto;

import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer-object interface for the SubscriptionTransaction. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * A specific transaction related to the subscription; provides the transactional
 * history for the subscription
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public interface ISubscriptionTransaction extends IDbDto {

  boolean equals(Object arg0);

  int hashCode();

  /**
   * <p>
   * Mark any children of this DTO as deleted.
   * </p>
   *
   * @throws DtoStatusException when the child cannot be set to DELETED status
   */
  void markChildrenDeleted() throws DtoStatusException;

  IPrimaryKey getPrimaryKey();
  

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes
   * Owning DTO: Partner
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: subscribedPartners
   * </p>
   * @return a java.math.BigInteger partnerId
   */
  public java.math.BigInteger getPartnerId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes
   * Owning DTO: Party
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: subscribers
   * </p>
   * @return a java.math.BigInteger partyId
   */
  public java.math.BigInteger getPartyId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false

  /**
   * <p>
   * the identifying transaction number within the subscription that uniquely
   * identifies the transaction along with the subscription key
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: transactionNo
   * </p>
   * @return a java.math.BigInteger transactionNo
   */
  public java.math.BigInteger getTransactionNo();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the date and time of the transaction
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: transactionDate
   * </p>
   * @return a java.sql.Timestamp transactionDate
   */
  public java.sql.Timestamp getTransactionDate();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the transactionDate.
   * </p>
   *
   * @param transactionDate the value to set into the transactionDate
   * @throws com.poesys.db.InvalidParametersException when the transactionDate 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setTransactionDate(java.sql.Timestamp transactionDate) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * at the time of the transaction, the date at which the subscription commences
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: startDate
   * </p>
   * @return a java.sql.Timestamp startDate
   */
  public java.sql.Timestamp getStartDate();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the startDate.
   * </p>
   *
   * @param startDate the value to set into the startDate
   * @throws com.poesys.db.InvalidParametersException when the startDate 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setStartDate(java.sql.Timestamp startDate) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * at the time of the transaction, the date at which the subscription ends
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: endDate
   * </p>
   * @return a java.sql.Timestamp endDate
   */
  public java.sql.Timestamp getEndDate();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the endDate.
   * </p>
   *
   * @param endDate the value to set into the endDate
   * @throws com.poesys.db.InvalidParametersException when the endDate 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setEndDate(java.sql.Timestamp endDate) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * the kind of transaction: Initial, Renewal, Refund
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: transactionType
   * </p>
   * @return a java.lang.String transactionType
   */
  public java.lang.String getTransactionType();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the transactionType.
   * </p>
   *
   * @param transactionType the value to set into the transactionType
   * @throws com.poesys.db.InvalidParametersException when the transactionType 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setTransactionType(java.lang.String transactionType) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * the activation code that "pays" for the transaction (initial or renew
   * transactions)
   * </p>
   * <p>
   * Added by AddToOneAssociationOptionalObjectProperties
   * Owning DTO: ActivationCode
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: activationCode
   * </p>
   * @return a org.phoenixbioinformatics.api.db.api.IActivationCode activationCode
   */
  public org.phoenixbioinformatics.api.db.api.IActivationCode getActivationCode();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the activationCode.
   * </p>
   *
   * @param activationCode the value to set into the activationCode
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setActivationCode(org.phoenixbioinformatics.api.db.api.IActivationCode activationCode) throws com.poesys.db.dto.DtoStatusException;


  /**
   * <p>
   * the subscription that owns the set of transactions
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: Subscription
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: subscription
   * </p>
   * @return a org.phoenixbioinformatics.api.db.api.ISubscription subscription
   */
  public org.phoenixbioinformatics.api.db.api.ISubscription getSubscription();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the subscription.
   * </p>
   *
   * @param subscription the value to set into the subscription
   * @throws com.poesys.db.InvalidParametersException when the subscription 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setSubscription(org.phoenixbioinformatics.api.db.api.ISubscription subscription) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddGeneratedGuidKeyProperties + AddToOneAssociationAttributeProperties
   * Owning DTO: ActivationCode
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: activationCode
   * </p>
   * @return a java.util.UUID activationCodeId
   */
  public java.util.UUID getActivationCodeId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false
}
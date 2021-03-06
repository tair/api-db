/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractBsDto.vsl


package org.phoenixbioinformatics.api.bs.api;


import com.poesys.bs.delegate.DelegateException;
import com.poesys.bs.dto.IDto;
import com.poesys.db.dto.DtoStatusException;
import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.dto.AbstractDto;


import org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction;
import org.phoenixbioinformatics.api.db.api.SubscriptionTransactionProxy;
import org.phoenixbioinformatics.api.db.api.SubscriptionTransaction;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the SubscriptionTransaction. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
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
public abstract class AbstractBsSubscriptionTransaction 
    extends AbstractDto<org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction> {

  /**
   * Create a BsSubscriptionTransaction object from a SubscriptionTransaction object.
   * 
   * @param dto the data-access layer SubscriptionTransaction DTO
   * @throws DelegateException when there is a problem creating the SubscriptionTransaction
   */
  public AbstractBsSubscriptionTransaction(ISubscriptionTransaction dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a SubscriptionTransaction from new data.
   *
   * @param key the primary key of the SubscriptionTransaction
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param transactionNo the identifying transaction number within the subscription that uniquely
identifies the transaction along with the subscription key
   * @param transactionDate the date and time of the transaction
   * @param startDate at the time of the transaction, the date at which the subscription commences
   * @param endDate at the time of the transaction, the date at which the subscription ends
   * @param transactionType the kind of transaction: Initial, Renewal, Refund
   * @param activationCodeId foreign key used by setter to query associated object
   */
  public AbstractBsSubscriptionTransaction(IPrimaryKey key, java.lang.String partnerId, java.math.BigInteger partyId, java.math.BigInteger transactionNo, java.sql.Timestamp transactionDate, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.lang.String transactionType, java.util.UUID activationCodeId) {
    super(new SubscriptionTransactionProxy(new SubscriptionTransaction(key, partnerId, partyId, transactionNo, transactionDate, startDate, endDate, transactionType, activationCodeId)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<ISubscriptionTransaction> other = (IDto<ISubscriptionTransaction>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<ISubscriptionTransaction> o) {
    return dto.compareTo(o.toDto());
  }

  public void markChildrenDeleted() throws DtoStatusException {
    dto.markChildrenDeleted();
  }
  
  public IPrimaryKey getPrimaryKey() {
    return dto.getPrimaryKey();
  }

  // Data member properties

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a java.lang.String partnerId
   */
  public java.lang.String getPartnerId() {
    return dto.getPartnerId();
  }

  /**
   * <p>
   * Composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties + AddAssociationKeyAttributeProperties + AddParentKeyAttributes as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger partyId
   */
  public java.math.BigInteger getPartyId() {
    return dto.getPartyId();
  }

  /**
   * <p>
   * the identifying transaction number within the subscription that uniquely
   * identifies the transaction along with the subscription key
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger transactionNo
   */
  public java.math.BigInteger getTransactionNo() {
    return dto.getTransactionNo();
  }

  /**
   * <p>
   * the date and time of the transaction
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a java.sql.Timestamp transactionDate
   */
  public java.sql.Timestamp getTransactionDate() {
    return dto.getTransactionDate();
  }

  /**
   * <p>
   * Set the transactionDate.
   * </p>
   * <p>
   * the date and time of the transaction
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @param transactionDate the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter transactionDate is null
   */
  public void setTransactionDate(java.sql.Timestamp transactionDate) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setTransactionDate(transactionDate);
  }

  /**
   * <p>
   * at the time of the transaction, the date at which the subscription commences
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a java.sql.Timestamp startDate
   */
  public java.sql.Timestamp getStartDate() {
    return dto.getStartDate();
  }

  /**
   * <p>
   * Set the startDate.
   * </p>
   * <p>
   * at the time of the transaction, the date at which the subscription commences
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @param startDate the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter startDate is null
   */
  public void setStartDate(java.sql.Timestamp startDate) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setStartDate(startDate);
  }

  /**
   * <p>
   * at the time of the transaction, the date at which the subscription ends
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a java.sql.Timestamp endDate
   */
  public java.sql.Timestamp getEndDate() {
    return dto.getEndDate();
  }

  /**
   * <p>
   * Set the endDate.
   * </p>
   * <p>
   * at the time of the transaction, the date at which the subscription ends
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @param endDate the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter endDate is null
   */
  public void setEndDate(java.sql.Timestamp endDate) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setEndDate(endDate);
  }

  /**
   * <p>
   * the kind of transaction: Initial, Renewal, Refund
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a java.lang.String transactionType
   */
  public java.lang.String getTransactionType() {
    return dto.getTransactionType();
  }

  /**
   * <p>
   * Set the transactionType.
   * </p>
   * <p>
   * the kind of transaction: Initial, Renewal, Refund
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @param transactionType the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter transactionType is null
   */
  public void setTransactionType(java.lang.String transactionType) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setTransactionType(transactionType);
  }

  /**
   * <p>
   * the activation code that "pays" for the transaction (initial or renew
   * transactions)
   * </p>
   * <p>
   * Added by AddToOneAssociationOptionalObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a org.phoenixbioinformatics.api.bs.api.BsActivationCode activationCode
   */
  public org.phoenixbioinformatics.api.bs.api.BsActivationCode getActivationCode() {
    org.phoenixbioinformatics.api.bs.api.BsActivationCode bsObject = null;
    org.phoenixbioinformatics.api.db.api.IActivationCode object = dto.getActivationCode();
	if (object != null) {
	  bsObject = new org.phoenixbioinformatics.api.bs.api.BsActivationCode(object);
	}
	return bsObject;
  }

  /**
   * <p>
   * Set the activationCode.
   * </p>
   * <p>
   * the activation code that "pays" for the transaction (initial or renew
   * transactions)
   * </p>
   * <p>
   * Added by AddToOneAssociationOptionalObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @param activationCode the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setActivationCode(org.phoenixbioinformatics.api.bs.api.BsActivationCode activationCode) 
      throws com.poesys.db.dto.DtoStatusException {
    dto.setActivationCode(activationCode == null ? null : activationCode.toDto());
  }

  /**
   * <p>
   * the subscription that owns the set of transactions
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a org.phoenixbioinformatics.api.bs.api.BsSubscription subscription
   */
  public org.phoenixbioinformatics.api.bs.api.BsSubscription getSubscription() {
    // Return 4
    return new org.phoenixbioinformatics.api.bs.api.BsSubscription(dto.getSubscription());
  }

  /**
   * <p>
   * Set the subscription.
   * </p>
   * <p>
   * the subscription that owns the set of transactions
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @param subscription the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter subscription is null
   */
  public void setSubscription(org.phoenixbioinformatics.api.bs.api.BsSubscription subscription) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setSubscription(subscription == null ? null : subscription.toDto());
  }

  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddGeneratedGuidKeyProperties + AddToOneAssociationAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object SubscriptionTransaction</li>
   * </ul>
   * </p>
   * @return a java.util.UUID activationCodeId
   */
  public java.util.UUID getActivationCodeId() {
    java.util.UUID bsObject = null;
    java.util.UUID object = dto.getActivationCodeId();
    bsObject = object;
	return bsObject;
  }
}
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


import org.phoenixbioinformatics.api.db.api.IActivationCode;
import org.phoenixbioinformatics.api.db.api.ActivationCodeProxy;
import org.phoenixbioinformatics.api.db.api.ActivationCode;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the ActivationCode. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A code that a subscriber can use to activate their subscription to a partner;
 * the code is the key for the class
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>GuidKey</li>
 *     <li>Persistent</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractBsActivationCode 
    extends AbstractDto<org.phoenixbioinformatics.api.db.api.IActivationCode> {

  /**
   * Create a BsActivationCode object from a ActivationCode object.
   * 
   * @param dto the data-access layer ActivationCode DTO
   * @throws DelegateException when there is a problem creating the ActivationCode
   */
  public AbstractBsActivationCode(IActivationCode dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a ActivationCode from new data.
   *
   * @param key the primary key of the ActivationCode
   * @param activationCodeId primary key attribute
   * @param period The number of months for the subscription activated by the code
   * @param purchaseDate the date on which the subscriber purchased the code; possibly used to expire the
code if needed
   * @param partnerId foreign key used by setter to query associated object
   */
  public AbstractBsActivationCode(IPrimaryKey key, java.util.UUID activationCodeId, java.lang.Integer period, java.sql.Timestamp purchaseDate, java.lang.String partnerId) {
    super(new ActivationCodeProxy(new ActivationCode(key, activationCodeId, period, purchaseDate, partnerId)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IActivationCode> other = (IDto<IActivationCode>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IActivationCode> o) {
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
   * Primary key attribute
   * </p>
   * <p>
   * Added by AddGeneratedGuidKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ActivationCode</li>
   * </ul>
   * </p>
   * @return a java.util.UUID activationCodeId
   */
  public java.util.UUID getActivationCodeId() {
    return dto.getActivationCodeId();
  }

  /**
   * <p>
   * The number of months for the subscription activated by the code
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ActivationCode</li>
   * </ul>
   * </p>
   * @return a java.lang.Integer period
   */
  public java.lang.Integer getPeriod() {
    return dto.getPeriod();
  }

  /**
   * <p>
   * Set the period.
   * </p>
   * <p>
   * The number of months for the subscription activated by the code
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ActivationCode</li>
   * </ul>
   * </p>
   * @param period the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter period is null
   */
  public void setPeriod(java.lang.Integer period) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setPeriod(period);
  }

  /**
   * <p>
   * the date on which the subscriber purchased the code; possibly used to expire the
   * code if needed
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ActivationCode</li>
   * </ul>
   * </p>
   * @return a java.sql.Timestamp purchaseDate
   */
  public java.sql.Timestamp getPurchaseDate() {
    return dto.getPurchaseDate();
  }

  /**
   * <p>
   * Set the purchaseDate.
   * </p>
   * <p>
   * the date on which the subscriber purchased the code; possibly used to expire the
   * code if needed
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ActivationCode</li>
   * </ul>
   * </p>
   * @param purchaseDate the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter purchaseDate is null
   */
  public void setPurchaseDate(java.sql.Timestamp purchaseDate) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setPurchaseDate(purchaseDate);
  }

  /**
   * <p>
   * the partner that the set of activation codes activates
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ActivationCode</li>
   * </ul>
   * </p>
   * @return a org.phoenixbioinformatics.api.bs.api.BsPartner partner
   */
  public org.phoenixbioinformatics.api.bs.api.BsPartner getPartner() {
    // Return 4
    return new org.phoenixbioinformatics.api.bs.api.BsPartner(dto.getPartner());
  }

  /**
   * <p>
   * Set the partner.
   * </p>
   * <p>
   * the partner that the set of activation codes activates
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object ActivationCode</li>
   * </ul>
   * </p>
   * @param partner the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter partner is null
   */
  public void setPartner(org.phoenixbioinformatics.api.bs.api.BsPartner partner) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setPartner(partner == null ? null : partner.toDto());
  }

  /**
   * <p>
   * Foreign key used by setter to query associated object
   * </p>
   * <p>
   * Added by AddNaturalKeyProperties + AddToOneAssociationAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object ActivationCode</li>
   * </ul>
   * </p>
   * @return a java.lang.String partnerId
   */
  public java.lang.String getPartnerId() {
    // Return 3
    return dto.getPartnerId();
  }
}
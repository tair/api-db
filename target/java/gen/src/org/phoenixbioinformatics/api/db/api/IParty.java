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
 * A data-access layer data-transfer-object interface for the Party. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * An abstract entity that is either a person or an organization
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 *     <li>SequenceKey</li>
 * </ul>
 * <p>
 * Class is read/write: true
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public interface IParty extends IDbDto {

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
   * Primary key attribute
   * </p>
   * <p>
   * Added by AddGeneratedKeyProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: ${property.prefix}
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
   * the name by which the party is known
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: name
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the name.
   * </p>
   *
   * @param name the value to set into the name
   * @throws com.poesys.db.InvalidParametersException when the name 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setName(java.lang.String name) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * the kind of Party this is:
   * </p>
   * <p>
   * User
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: partyType
   * </p>
   * @return a java.lang.String partyType
   */
  public java.lang.String getPartyType();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the partyType.
   * </p>
   *
   * @param partyType the value to set into the partyType
   * @throws com.poesys.db.InvalidParametersException when the partyType 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setPartyType(java.lang.String partyType) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * the system to which the organization subscribes
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties
   * Owning DTO: Partner
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: subscribedPartners
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * IParty object.
   * </p>
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.IPartner> subscribedPartners
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.IPartner> getSubscribedPartners() throws java.sql.SQLException;

  /**
   * Clear the subscribedPartners so that it will lazily reload.
   */
  public void clearSubscribedPartners();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the subscribedPartners.
   * </p>
   *
   * @param subscribedPartners the value to set into the subscribedPartners
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setPartner(java.util.Collection<org.phoenixbioinformatics.api.db.api.IPartner> subscribedPartners) throws com.poesys.db.dto.DtoStatusException;


  /**
   * <p>
   * the set of sessions initiated by the party
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties
   * Owning DTO: PageView
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: sessions
   * </p>
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.IPageView> sessions
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.IPageView> getSessions();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the sessions.
   * </p>
   *
   * @param sessions the value to set into the sessions
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setSessions(java.util.Collection<org.phoenixbioinformatics.api.db.api.IPageView> sessions) throws com.poesys.db.dto.DtoStatusException;


  /**
   * <p>
   * the set of IP ranges associated with the party
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties
   * Owning DTO: IpRange
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: ipRanges
   * </p>
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.IIpRange> ipRanges
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.IIpRange> getIpRanges();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the ipRanges.
   * </p>
   *
   * @param ipRanges the value to set into the ipRanges
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setIpRanges(java.util.Collection<org.phoenixbioinformatics.api.db.api.IIpRange> ipRanges) throws com.poesys.db.dto.DtoStatusException;


  /**
   * <p>
   * the set of logins for the party for different partners
   * </p>
   * <p>
   * Added by AddToManyChildCollectionProperties
   * Owning DTO: Login
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: login
   * </p>
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.ILogin> login
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.ILogin> getLogin();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the login.
   * </p>
   *
   * @param login the value to set into the login
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setLogin(java.util.Collection<org.phoenixbioinformatics.api.db.api.ILogin> login) throws com.poesys.db.dto.DtoStatusException;


  /**
   * <p>
   * Collection of association class objects (not the associated objects)
   * </p>
   * <p>
   * Added by AddAssociationClassCollectionProperties
   * Owning DTO: Subscription
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: subscribedPartners
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * IParty object.
   * </p>
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.ISubscription> subscription
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.ISubscription> getSubscription() throws java.sql.SQLException;

  /**
   * Clear the subscription so that it will lazily reload.
   */
  public void clearSubscription();
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
  public void setSubscription(java.util.Collection<org.phoenixbioinformatics.api.db.api.ISubscription> subscription) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * Add a Partner object to the subscribedPartners collection.
   *
   * @param object the object to add to the collection
   * @throws java.sql.SQLException when there is a problem lazily loading the 
   *                               collection
   */
  public void addSubscribedPartnersPartner(org.phoenixbioinformatics.api.db.api.IPartner object) throws java.sql.SQLException;

  /**
   * Add a PageView object to the sessions collection.
   *
   * @param object the object to add to the collection
   */
  public void addSessionsPageView(org.phoenixbioinformatics.api.db.api.IPageView object);

  /**
   * Add a IpRange object to the ipRanges collection.
   *
   * @param object the object to add to the collection
   */
  public void addIpRangesIpRange(org.phoenixbioinformatics.api.db.api.IIpRange object);

  /**
   * Add a Login object to the login collection.
   *
   * @param object the object to add to the collection
   */
  public void addLoginLogin(org.phoenixbioinformatics.api.db.api.ILogin object);

  /**
   * Add a Subscription object to the subscription collection.
   *
   * @param object the object to add to the collection
   * @throws java.sql.SQLException when there is a problem lazily loading the 
   *                               collection
   */
  public void addSubscriptionSubscription(org.phoenixbioinformatics.api.db.api.ISubscription object) throws java.sql.SQLException;
}
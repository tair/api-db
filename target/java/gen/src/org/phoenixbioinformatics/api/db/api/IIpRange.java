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
 * A data-access layer data-transfer-object interface for the IpRange. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * A range of IP addresses for a subscription; ranges must not overlap for a
 * subscription, they must be mutually exclusive
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
public interface IIpRange extends IDbDto {

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
   * Added by AddGeneratedKeyProperties + AddParentKeyAttributes
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
   * the IP address that is the first address in the range; must not be part of any
   * other range for the subscription
   * </p>
   * <p>
   * Added by AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: start
   * </p>
   * @return a java.lang.String start
   */
  public java.lang.String getStart();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: false

  /**
   * <p>
   * the IP address that is the last address in the range; must be greater than the
   * start and must be a "reasonable" end to the range (TBD)
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * Owning DTO: ${property.dto.name}
   * Owning package: ${property.dto.packageName}
   * Property prefix: end
   * </p>
   * @return a java.lang.String end
   */
  public java.lang.String getEnd();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the end.
   * </p>
   *
   * @param end the value to set into the end
   * @throws com.poesys.db.InvalidParametersException when the end 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setEnd(java.lang.String end) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * <p>
   * the party that is associated with the IP range
   * </p>
   * <p>
   * Added by AddToOneAssociationRequiredObjectProperties
   * Owning DTO: Party
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: party
   * </p>
   * @return a org.phoenixbioinformatics.api.db.api.IParty party
   */
  public org.phoenixbioinformatics.api.db.api.IParty getParty();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the party.
   * </p>
   *
   * @param party the value to set into the party
   * @throws com.poesys.db.InvalidParametersException when the party 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setParty(org.phoenixbioinformatics.api.db.api.IParty party) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;

}
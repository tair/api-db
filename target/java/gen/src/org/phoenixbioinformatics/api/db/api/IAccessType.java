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
 * A data-access layer data-transfer-object interface for the AccessType. 
 * The data-transfer-object class and proxy class implement this interface, as
 * does the business-layer data-transfer-object class.
 * </p>
 * <p>
 * A particular kind of access to authorize
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
public interface IAccessType extends IDbDto {

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
   * @return a java.math.BigInteger accessTypeId
   */
  public java.math.BigInteger getAccessTypeId();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not true
// Read/Write property: false

  /**
   * <p>
   * the name of the access type
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
   * the set of URI patterns
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties
   * Owning DTO: UriPattern
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: uriPatterns
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * IAccessType object.
   * </p>
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> uriPatterns
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> getUriPatterns() throws java.sql.SQLException;

  /**
   * Clear the uriPatterns so that it will lazily reload.
   */
  public void clearUriPatterns();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the uriPatterns.
   * </p>
   *
   * @param uriPatterns the value to set into the uriPatterns
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setUriPattern(java.util.Collection<org.phoenixbioinformatics.api.db.api.IUriPattern> uriPatterns) throws com.poesys.db.dto.DtoStatusException;


  /**
   * <p>
   * Collection of association class objects (not the associated objects)
   * </p>
   * <p>
   * Added by AddAssociationClassCollectionProperties
   * Owning DTO: AccessRule
   * Owning package: org.phoenixbioinformatics.api.db.api
   * Property prefix: uriPatterns
   * </p>
   * <p>
   * This property loads lazily on demand rather than when you first query the 
   * IAccessType object.
   * </p>
   * @return a java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> accessRule
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> getAccessRule() throws java.sql.SQLException;

  /**
   * Clear the accessRule so that it will lazily reload.
   */
  public void clearAccessRule();
// Setter here if the four conditions below are all true or not false
// Read/Write DTO: true
// Mutable DTO: not false
// Mutable property: not false
// Read/Write property: true

  /**
   * <p>
   * Set the accessRule.
   * </p>
   *
   * @param accessRule the value to set into the accessRule
   * @throws com.poesys.db.InvalidParametersException when the accessRule 
   *       value is null
   * @throws com.poesys.db.dto.DtoStatusException when the status cannot be set to CHANGED
   */
  public void setAccessRule(java.util.Collection<org.phoenixbioinformatics.api.db.api.IAccessRule> accessRule) throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException;


  /**
   * Add a UriPattern object to the uriPatterns collection.
   *
   * @param object the object to add to the collection
   * @throws java.sql.SQLException when there is a problem lazily loading the 
   *                               collection
   */
  public void addUriPatternsUriPattern(org.phoenixbioinformatics.api.db.api.IUriPattern object) throws java.sql.SQLException;

  /**
   * Add a AccessRule object to the accessRule collection.
   *
   * @param object the object to add to the collection
   * @throws java.sql.SQLException when there is a problem lazily loading the 
   *                               collection
   */
  public void addAccessRuleAccessRule(org.phoenixbioinformatics.api.db.api.IAccessRule object) throws java.sql.SQLException;
}
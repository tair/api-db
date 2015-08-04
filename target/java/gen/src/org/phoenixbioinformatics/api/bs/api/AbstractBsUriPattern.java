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


import org.phoenixbioinformatics.api.db.api.IUriPattern;
import org.phoenixbioinformatics.api.db.api.UriPatternProxy;
import org.phoenixbioinformatics.api.db.api.UriPattern;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the UriPattern. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A regular expression pattern that specifies a set of URIs
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
public abstract class AbstractBsUriPattern 
    extends AbstractDto<org.phoenixbioinformatics.api.db.api.IUriPattern> {

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsAccessType objects from a Collection accessTypes of data-access-layer 
   * org.phoenixbioinformatics.api.db.api.IAccessType objects
   */
  private class BsAccessTypesCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.phoenixbioinformatics.api.db.api.IAccessType, org.phoenixbioinformatics.api.bs.api.BsAccessType> {
    @Override
    public org.phoenixbioinformatics.api.bs.api.BsAccessType get(org.phoenixbioinformatics.api.db.api.IAccessType dto) {
      return new org.phoenixbioinformatics.api.bs.api.BsAccessType(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of AccessType objects from an input Collection accessTypes of 
   * business-layer BsAccessType objects
   */
  private class AccessTypesCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.phoenixbioinformatics.api.bs.api.BsAccessType, org.phoenixbioinformatics.api.db.api.IAccessType> {
    @Override
    public org.phoenixbioinformatics.api.db.api.IAccessType get(org.phoenixbioinformatics.api.bs.api.BsAccessType dto) {
      return dto.toDto();
    }
  }

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsAccessRule objects from a Collection accessRule of data-access-layer 
   * org.phoenixbioinformatics.api.db.api.IAccessRule objects
   */
  private class BsAccessRuleCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.phoenixbioinformatics.api.db.api.IAccessRule, org.phoenixbioinformatics.api.bs.api.BsAccessRule> {
    @Override
    public org.phoenixbioinformatics.api.bs.api.BsAccessRule get(org.phoenixbioinformatics.api.db.api.IAccessRule dto) {
      return new org.phoenixbioinformatics.api.bs.api.BsAccessRule(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of AccessRule objects from an input Collection accessRule of 
   * business-layer BsAccessRule objects
   */
  private class AccessRuleCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.phoenixbioinformatics.api.bs.api.BsAccessRule, org.phoenixbioinformatics.api.db.api.IAccessRule> {
    @Override
    public org.phoenixbioinformatics.api.db.api.IAccessRule get(org.phoenixbioinformatics.api.bs.api.BsAccessRule dto) {
      return dto.toDto();
    }
  }

  /**
   * Create a BsUriPattern object from a UriPattern object.
   * 
   * @param dto the data-access layer UriPattern DTO
   * @throws DelegateException when there is a problem creating the UriPattern
   */
  public AbstractBsUriPattern(IUriPattern dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a UriPattern from new data.
   *
   * @param key the primary key of the UriPattern
   * @param uriPatternId primary key attribute
   * @param pattern a regular expression that identifies a set of URIs
   */
  public AbstractBsUriPattern(IPrimaryKey key, java.math.BigInteger uriPatternId, java.lang.String pattern) {
    super(new UriPatternProxy(new UriPattern(key, uriPatternId, pattern)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IUriPattern> other = (IDto<IUriPattern>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IUriPattern> o) {
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
   * Added by AddGeneratedKeyProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: false</li>
   * <li>Property is defined in the data-access object UriPattern</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger uriPatternId
   */
  public java.math.BigInteger getUriPatternId() {
    return dto.getUriPatternId();
  }

  /**
   * <p>
   * a regular expression that identifies a set of URIs
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object UriPattern</li>
   * </ul>
   * </p>
   * @return a java.lang.String pattern
   */
  public java.lang.String getPattern() {
    return dto.getPattern();
  }

  /**
   * <p>
   * Set the pattern.
   * </p>
   * <p>
   * a regular expression that identifies a set of URIs
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object UriPattern</li>
   * </ul>
   * </p>
   * @param pattern the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter pattern is null
   */
  public void setPattern(java.lang.String pattern) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setPattern(pattern);
  }

  /**
   * 
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsUriPattern object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object UriPattern</li>
   * </ul>
   * </p>
   * @return a org.phoenixbioinformatics.api.bs.api.BsAccessType pattern
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsAccessType> getAccessTypes() throws java.sql.SQLException {
    BsAccessTypesCollectionBuilder builder = new BsAccessTypesCollectionBuilder();
    return builder.getCollection(dto.getAccessTypes());
  }

  /**
   * <p>
   * Set the accessType.
   * </p>
   * 
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object UriPattern</li>
   * </ul>
   * </p>
   * @param pattern the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setAccessType(java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsAccessType> pattern) 
      throws com.poesys.db.dto.DtoStatusException{
    AccessTypesCollectionBuilder builder = new AccessTypesCollectionBuilder();
      dto.setAccessType(builder.getCollection(pattern));
  }

  /**
   * <p>
   * Collection of association class objects (not the associated objects)
   * </p>
   * <p>
   * Added by AddAssociationClassCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsUriPattern object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object UriPattern</li>
   * </ul>
   * </p>
   * @return a org.phoenixbioinformatics.api.bs.api.BsAccessRule pattern
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsAccessRule> getAccessRule() throws java.sql.SQLException {
    BsAccessRuleCollectionBuilder builder = new BsAccessRuleCollectionBuilder();
    return builder.getCollection(dto.getAccessRule());
  }

  /**
   * <p>
   * Set the accessRule.
   * </p>
   * <p>
   * Collection of association class objects (not the associated objects)
   * </p>
   * <p>
   * Added by AddAssociationClassCollectionProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object UriPattern</li>
   * </ul>
   * </p>
   * @param pattern the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter pattern is null
   */
  public void setAccessRule(java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsAccessRule> pattern) 
      throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException {
    AccessRuleCollectionBuilder builder = new AccessRuleCollectionBuilder();
      dto.setAccessRule(builder.getCollection(pattern));
  }

  /**
   * Add a AccessType object to the accessTypes collection.
   *
   * @param object the object to add to the collection
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public void addAccessTypesAccessType(org.phoenixbioinformatics.api.bs.api.BsAccessType object) throws java.sql.SQLException {
    dto.addAccessTypesAccessType(object.toDto());
  }

  /**
   * Add a AccessRule object to the accessRule collection.
   *
   * @param object the object to add to the collection
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public void addAccessRuleAccessRule(org.phoenixbioinformatics.api.bs.api.BsAccessRule object) throws java.sql.SQLException {
    dto.addAccessRuleAccessRule(object.toDto());
  }
}
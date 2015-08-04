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


import org.phoenixbioinformatics.api.db.api.IAccessType;
import org.phoenixbioinformatics.api.db.api.AccessTypeProxy;
import org.phoenixbioinformatics.api.db.api.AccessType;


/**
 * <p>
 * A business layer data-transfer object (DTO) for the AccessType. This class
 * is an abstract class that contains AndroMDA generated code; change nothing
 * in this class. Instead, override any methods in the concrete subclass
 * generated in the same package. AndroMDA will overwrite this class each time
 * you run it but will never overwrite the concrete subclass.
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
public abstract class AbstractBsAccessType 
    extends AbstractDto<org.phoenixbioinformatics.api.db.api.IAccessType> {

  /**
   * A Collection builder helper class for building a business-layer Collection 
   * of BsUriPattern objects from a Collection uriPatterns of data-access-layer 
   * org.phoenixbioinformatics.api.db.api.IUriPattern objects
   */
  private class BsUriPatternsCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.phoenixbioinformatics.api.db.api.IUriPattern, org.phoenixbioinformatics.api.bs.api.BsUriPattern> {
    @Override
    public org.phoenixbioinformatics.api.bs.api.BsUriPattern get(org.phoenixbioinformatics.api.db.api.IUriPattern dto) {
      return new org.phoenixbioinformatics.api.bs.api.BsUriPattern(dto);
    }
  }

  /**
   * A Collection builder helper class for building a data-access-layer Collection 
   * of UriPattern objects from an input Collection uriPatterns of 
   * business-layer BsUriPattern objects
   */
  private class UriPatternsCollectionBuilder 
      extends com.poesys.bs.dto.CollectionBuilder<org.phoenixbioinformatics.api.bs.api.BsUriPattern, org.phoenixbioinformatics.api.db.api.IUriPattern> {
    @Override
    public org.phoenixbioinformatics.api.db.api.IUriPattern get(org.phoenixbioinformatics.api.bs.api.BsUriPattern dto) {
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
   * Create a BsAccessType object from a AccessType object.
   * 
   * @param dto the data-access layer AccessType DTO
   * @throws DelegateException when there is a problem creating the AccessType
   */
  public AbstractBsAccessType(IAccessType dto) throws DelegateException {
    super(dto);
  }

  /**
   * Create a AccessType from new data.
   *
   * @param key the primary key of the AccessType
   * @param accessTypeId primary key attribute
   * @param name the name of the access type
   */
  public AbstractBsAccessType(IPrimaryKey key, java.math.BigInteger accessTypeId, java.lang.String name) {
    super(new AccessTypeProxy(new AccessType(key, accessTypeId, name)));
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object arg0) {
    // Unchecked cast here
    IDto<IAccessType> other = (IDto<IAccessType>)arg0;
    return dto.equals(other.toDto());
  }

  @Override
  public int hashCode() {
    return dto.hashCode();
  }

  public int compareTo(IDto<IAccessType> o) {
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
   * <li>Property is defined in the data-access object AccessType</li>
   * </ul>
   * </p>
   * @return a java.math.BigInteger accessTypeId
   */
  public java.math.BigInteger getAccessTypeId() {
    return dto.getAccessTypeId();
  }

  /**
   * <p>
   * the name of the access type
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties as data member
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object AccessType</li>
   * </ul>
   * </p>
   * @return a java.lang.String name
   */
  public java.lang.String getName() {
    return dto.getName();
  }

  /**
   * <p>
   * Set the name.
   * </p>
   * <p>
   * the name of the access type
   * </p>
   * <p>
   * Added by AddLocalAttributeProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object AccessType</li>
   * </ul>
   * </p>
   * @param name the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter name is null
   */
  public void setName(java.lang.String name) 
      throws com.poesys.db.dto.DtoStatusException , com.poesys.db.InvalidParametersException {
    dto.setName(name);
  }

  /**
   * <p>
   * the set of URI patterns
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties as data member
   * </p>
   * <p>
   * This property loads lazily on demand the first time you call this method,
   * not when you instantiate the BsAccessType object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object AccessType</li>
   * </ul>
   * </p>
   * @return a org.phoenixbioinformatics.api.bs.api.BsUriPattern name
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsUriPattern> getUriPatterns() throws java.sql.SQLException {
    BsUriPatternsCollectionBuilder builder = new BsUriPatternsCollectionBuilder();
    return builder.getCollection(dto.getUriPatterns());
  }

  /**
   * <p>
   * Set the uriPattern.
   * </p>
   * <p>
   * the set of URI patterns
   * </p>
   * <p>
   * Added by TransformToProperty + AddToManyAssociationCollectionProperties
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object AccessType</li>
   * </ul>
   * </p>
   * @param name the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   */
  public void setUriPattern(java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsUriPattern> name) 
      throws com.poesys.db.dto.DtoStatusException{
    UriPatternsCollectionBuilder builder = new UriPatternsCollectionBuilder();
      dto.setUriPattern(builder.getCollection(name));
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
   * not when you instantiate the BsAccessType object.
   * </p>
   * <p>
   * <ul>
   * <li>Property is read/write: true</li>
   * <li>Property is defined in the data-access object AccessType</li>
   * </ul>
   * </p>
   * @return a org.phoenixbioinformatics.api.bs.api.BsAccessRule name
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
   * <li>Property is defined in the data-access object AccessType</li>
   * </ul>
   * </p>
   * @param name the associated business object
   * @throws com.poesys.db.dto.DtoStatusException when the system can't set
   *                 the data-access status to CHANGED
   * @throws com.poesys.db.InvalidParametersException when the property is
   *                 required but the input parameter name is null
   */
  public void setAccessRule(java.util.Collection<org.phoenixbioinformatics.api.bs.api.BsAccessRule> name) 
      throws com.poesys.db.dto.DtoStatusException, com.poesys.db.InvalidParametersException {
    AccessRuleCollectionBuilder builder = new AccessRuleCollectionBuilder();
      dto.setAccessRule(builder.getCollection(name));
  }

  /**
   * Add a UriPattern object to the uriPatterns collection.
   *
   * @param object the object to add to the collection
   * @throws java.sql.SQLException when the method can't get a SQL connection to 
   *                               load the property lazily
   */
  public void addUriPatternsUriPattern(org.phoenixbioinformatics.api.bs.api.BsUriPattern object) throws java.sql.SQLException {
    dto.addUriPatternsUriPattern(object.toDto());
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
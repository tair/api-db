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
 * SubscriptionDescription. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * A collection of descriptive texts to display for a particular kind of
 * subscription; a partner may have any number of such texts to display in
 * different named contexts
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractSubscriptionDescriptionProxy extends AbstractLazyLoadingDtoProxy implements ISubscriptionDescription {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  // Lazy-loading query setter strategy nested classes for single-object associations
  


  /**
   * Read-Object setter for de-serializing nested items list
   *
   * Source: AddToManyChildCollectionProperties
   *
   * @see org.phoenixbioinformatics.api.db.api.sql.QuerySubscriptionDescriptionItem
   */
  private class ReadItemsSetter 
      extends com.poesys.db.dto.AbstractListReadSetter<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem> {
    private static final long serialVersionUID = 1L;

    /**
     * Create a ReadItemsSetter object to read the items list.
     */
    public ReadItemsSetter() {
      super("org.phoenixbioinformatics.api.db.api", 2147483647);
    }

    @Override
    protected String getClassName() {
      return org.phoenixbioinformatics.api.db.api.SubscriptionDescriptionItem.class.getName();
    }

    @Override
    protected java.util.List<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem> getObjectList() {
      java.util.List<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem> items =  ((org.phoenixbioinformatics.api.db.api.SubscriptionDescription)dto).getItems();
      return items;
    }

    @Override
    protected java.util.List<com.poesys.db.pk.IPrimaryKey> getPrimaryKeys() {
      return ((org.phoenixbioinformatics.api.db.api.SubscriptionDescription)dto).itemsKeys;
    }

    @Override
    protected com.poesys.db.dao.query.IKeyQuerySql<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem> getSql() {
      return new org.phoenixbioinformatics.api.db.api.sql.QuerySubscriptionDescriptionItem();
    }

    @Override
    protected void set(java.util.List<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem> list) {
      ((org.phoenixbioinformatics.api.db.api.SubscriptionDescription)dto).items = list;
    }
  }

  /**
   * Add a org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem object to the Items collection. The method
   * loads the collection if it is not already in memory.
   *
   * add method #1 (collection property)
   *
   * Source: AddToManyChildCollectionProperties
   * 
   * @param object the org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem object to add to the collection
   */
  public void addItemsSubscriptionDescriptionItem(org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem object) {
    ((SubscriptionDescription)dto).addItemsSubscriptionDescriptionItem(object);
  }

  /**
   * Create a SubscriptionDescriptionProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractSubscriptionDescriptionProxy(SubscriptionDescription dto) {
    super(dto);

    // Setter arrays
    readObjectSetters = new java.util.concurrent.CopyOnWriteArrayList<com.poesys.db.dto.ISet>();
    readObjectSetters.add(new ReadItemsSetter());
  }

  @Override
  public boolean equals(Object obj) {
    AbstractSubscriptionDescriptionProxy otherProxy = (AbstractSubscriptionDescriptionProxy)obj;
    return ((SubscriptionDescription)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((SubscriptionDescription)dto).hashCode();
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
    return ((SubscriptionDescription)dto).getPartnerId();
  }

  /**
   * Get an object of java.lang.String
   *
   * Source: AddExplicitSubKeyProperties + addNaturalSubkeyOnClass
   * Lazy: false
   * 
   * @return a java.lang.String
   */
  public java.lang.String getHeader() {
    return ((SubscriptionDescription)dto).getHeader();
  }

  /**
   * Get an object of java.lang.String
   *
   * Source: AddLocalAttributeProperties
   * Lazy: false
   * 
   * @return a java.lang.String
   */
  public java.lang.String getDescriptionType() {
    return ((SubscriptionDescription)dto).getDescriptionType();
  }

  public void setDescriptionType(java.lang.String descriptionType)
      throws com.poesys.db.InvalidParametersException {
    ((SubscriptionDescription)dto).setDescriptionType(descriptionType);
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
    return ((SubscriptionDescription)dto).getPartner();
  }

  public void setPartner(org.phoenixbioinformatics.api.db.api.IPartner partner)
      throws com.poesys.db.InvalidParametersException {
    ((SubscriptionDescription)dto).setPartner(partner);
  }

  /**
   * Get a list of org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem
   *
   * Source: AddToManyChildCollectionProperties
   * Lazy: false
   * 
   * @return a java.util.List<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem>
   */
  public java.util.List<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem> getItems() {
    return ((SubscriptionDescription)dto).getItems();
  }

  public void setItems(java.util.List<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem> items)
      throws com.poesys.db.InvalidParametersException {
    ((SubscriptionDescription)dto).setItems(items);
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((SubscriptionDescription)dto).markChildrenDeleted();
  }
}
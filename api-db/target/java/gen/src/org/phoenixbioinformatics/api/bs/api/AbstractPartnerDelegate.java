/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelegate.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.bs.delegate.AbstractDataDelegate;
import com.poesys.bs.delegate.DelegateException;
import com.poesys.db.connection.IConnectionFactory.DBMS;
import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.dao.update.IUpdateSql;
import com.poesys.db.dao.delete.IDeleteSql;
import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.dao.query.IQuerySql;


/**
 * <p>
 * A business delegate that provides an application programming interface for
 * Partner objects and their dependents. You should not modify this class;
 * instead, override or add methods in the class PartnerDelegate, which
 * specializes this class.
 * </p>
 * <p>
 * a system that comprises a unit for subscription, authentication, and
 * authorization
 * </p>
 * @see PartnerDelegate
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractPartnerDelegate
    extends AbstractDataDelegate<BsPartner, org.phoenixbioinformatics.api.db.api.IPartner, com.poesys.db.pk.NaturalPrimaryKey> {
  /**
   * Create an AbstractPartnerDelegate object by supplying the database
   * subsystem in the database.properties file.
   * 
   * @param subsystem the database subsystem to use in database.properties
   */
  public AbstractPartnerDelegate(String subsystem) {
    super(subsystem, 2147483647);
  }

  /**
   * Create an AbstractPartnerDelegate object by supplying the database
   * subsystem in the database.properties file and a specific DBMS, usually
   * IConnectionFactory.DBMS.JNDI.
   * 
   * @param subsystem the database subsystem to use in database.properties
   * @param dbms the DBMS to use (usually IConnectionFactory.DBMS.JNDI)
   */
  public AbstractPartnerDelegate(String subsystem, DBMS dbms) {
    super(subsystem, dbms, 2147483647);
  }

  @Override
  protected String getClassName() {
    return org.phoenixbioinformatics.api.db.api.Partner.class.getName();
  }

  @Override
  protected IInsertSql<org.phoenixbioinformatics.api.db.api.IPartner> getInsertSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.InsertPartner();
  }

  @Override
  protected IDeleteSql<org.phoenixbioinformatics.api.db.api.IPartner> getDeleteSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.DeletePartner();
  }

  @Override
  protected IUpdateSql<org.phoenixbioinformatics.api.db.api.IPartner> getUpdateSql() {
    return new org.phoenixbioinformatics.api.db.api.sql.UpdatePartner();
  }

  @Override
  protected IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IPartner> getQueryByKeySql() {
    return new org.phoenixbioinformatics.api.db.api.sql.QueryPartner();
  }

  @Override
  protected IQuerySql<org.phoenixbioinformatics.api.db.api.IPartner> getQueryListSql() {
    // Query-All method not required
    return new org.phoenixbioinformatics.api.db.api.sql.QueryAllPartner();
  }

  @Override
  protected org.phoenixbioinformatics.api.bs.api.BsPartner wrapData(org.phoenixbioinformatics.api.db.api.IPartner dto) {
    return new org.phoenixbioinformatics.api.bs.api.BsPartner(dto);
  }

  /**
   * <p>
   * Create a new Partner with data fields.
   * </p>
   * <p>
   * The Partner class has a natural key; this method creates the primary
   * key from the appropriate input properties.
   * </p>
   * 
   * @param partnerId 
   * @param name the name of the partner system
   * @param logoUri a URI that returns a logo for the partner
   * @param termOfServiceUri a URI that returns an array of subscription terms for the partner
   * @return the new Partner object
   * @throws DelegateException when there is a problem generating the key or
   *             creating the object
   */
  public org.phoenixbioinformatics.api.bs.api.BsPartner createPartner(java.lang.String partnerId, java.lang.String name, java.lang.String logoUri, java.lang.String termOfServiceUri)
      throws DelegateException {
    com.poesys.db.pk.NaturalPrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("partnerId", partnerId));
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.Partner");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a data-access DTO proxy (supports lazy loading).
    org.phoenixbioinformatics.api.db.api.IPartner dto =
      new org.phoenixbioinformatics.api.db.api.PartnerProxy(new org.phoenixbioinformatics.api.db.api.Partner(key, partnerId, name, logoUri, termOfServiceUri));

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsPartner(dto);
  }

  /**
   * Create a new PartnerPattern child of Partner with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param sourceUri the source URI that the user requests; this is a regular expression that
identifies a set of potential URIs in a complete match scenario; this is the
original URI that comes into the proxy server
   * @param targetUri the URI that replaces the complete match on the source URI; this is the URI that
identifies the partner server (the proxied URI for the proxy server)
   * @return a new PartnerPattern business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsPartnerPattern createPartnerPattern(org.phoenixbioinformatics.api.bs.api.BsPartner parent, java.lang.String partnerId, java.lang.String sourceUri, java.lang.String targetUri) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("sourceUri", sourceUri));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.PartnerPattern");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.PartnerPattern");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access PartnerPattern DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.IPartnerPattern dto =
      new org.phoenixbioinformatics.api.db.api.PartnerPattern(key, partnerId, sourceUri, targetUri);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsPartnerPattern(dto);
  }
  /**
   * Create a new SubscriptionTerm child of Partner with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param period the period of time for which a subscription allows access to a partner system
   * @param price the price for a subscription for this term
   * @param groupDiscountPercentage the discount for this term for a group subscription expressed as a decimal
number with 2 significant digits
   * @param description text describing the term suitable for display in the user interface, such as
"Annual ($199 USD)" for a 365-day term priced at $199
   * @return a new SubscriptionTerm business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsSubscriptionTerm createSubscriptionTerm(org.phoenixbioinformatics.api.bs.api.BsPartner parent, java.lang.String partnerId, java.lang.Integer period, java.lang.Double price, java.lang.Double groupDiscountPercentage, java.lang.String description) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.IntegerColumnValue("period", period));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.SubscriptionTerm");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.SubscriptionTerm");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access SubscriptionTerm DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.ISubscriptionTerm dto =
      new org.phoenixbioinformatics.api.db.api.SubscriptionTerm(key, partnerId, period, price, groupDiscountPercentage, description);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsSubscriptionTerm(dto);
  }
  /**
   * Create a new SubscriptionDescriptionItem child of Partner with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param descriptionType composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param itemNo the number that identifies the description item within the description
   * @param text the text to display for the type of context
   * @return a new SubscriptionDescriptionItem business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsSubscriptionDescriptionItem createSubscriptionDescriptionItem(org.phoenixbioinformatics.api.bs.api.BsPartner parent, java.lang.String descriptionType, java.lang.String partnerId, java.math.BigInteger itemNo, java.lang.String text) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.BigIntegerColumnValue("itemNo", itemNo));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.SubscriptionDescriptionItem");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.SubscriptionDescriptionItem");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access SubscriptionDescriptionItem DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem dto =
      new org.phoenixbioinformatics.api.db.api.SubscriptionDescriptionItem(key, descriptionType, partnerId, itemNo, text);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsSubscriptionDescriptionItem(dto);
  }
  /**
   * Create a new SubscriptionDescription child of Partner with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param descriptionType the type of description:
Default
Individual
Institution
Commercial
   * @param header the header text for the section display
   * @return a new SubscriptionDescription business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsSubscriptionDescription createSubscriptionDescription(org.phoenixbioinformatics.api.bs.api.BsPartner parent, java.lang.String partnerId, java.lang.String descriptionType, java.lang.String header) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("descriptionType", descriptionType));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.SubscriptionDescription");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.SubscriptionDescription");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access SubscriptionDescription DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.ISubscriptionDescription dto =
      new org.phoenixbioinformatics.api.db.api.SubscriptionDescription(key, partnerId, descriptionType, header);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsSubscriptionDescription(dto);
  }
  /**
   * Create a new IpCount child of Partner with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param ip the IP address being tracked (IPv4 or IPv6)
   * @param count the count of page views by the IP address since initialization
   * @return a new IpCount business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsIpCount createIpCount(org.phoenixbioinformatics.api.bs.api.BsPartner parent, java.lang.String partnerId, java.lang.String ip, java.lang.Integer count) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.StringColumnValue("ip", ip));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.IpCount");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.IpCount");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access IpCount DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.IIpCount dto =
      new org.phoenixbioinformatics.api.db.api.IpCount(key, partnerId, ip, count);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsIpCount(dto);
  }
  /**
   * Create a new LimitValue child of Partner with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param value the count at which the limit applies
   * @return a new LimitValue business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsLimitValue createLimitValue(org.phoenixbioinformatics.api.bs.api.BsPartner parent, java.lang.String partnerId, java.lang.Integer value) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.IntegerColumnValue("value", value));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.LimitValue");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.LimitValue");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access LimitValue DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.ILimitValue dto =
      new org.phoenixbioinformatics.api.db.api.LimitValue(key, partnerId, value);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsLimitValue(dto);
  }
  /**
   * Create a new AccessRule association class child of Partner with 
   * an association key. This class links the input objects.
   * 
   * @param accessTypesObject associated AccessType object (part of the key)
   * @param partnerObject associated Partner object (part of the key)
   * @param uriPatternsObject associated UriPattern object (part of the key)
   * @param accessTypeId Attribute that is part of the association key
   * @param uriPatternId Attribute that is part of the association key
   * @param partnerId foreign key used as primary key in association class
   * @param partner 
   * @return a new AccessRule business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsAccessRule createAccessRule(org.phoenixbioinformatics.api.bs.api.BsAccessType accessTypesObject, org.phoenixbioinformatics.api.bs.api.BsPartner partnerObject, org.phoenixbioinformatics.api.bs.api.BsUriPattern uriPatternsObject, java.math.BigInteger accessTypeId, java.math.BigInteger uriPatternId, java.lang.String partnerId, org.phoenixbioinformatics.api.db.api.IPartner partner) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.AssociationPrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.pk.IPrimaryKey> list =
        new java.util.ArrayList<com.poesys.db.pk.IPrimaryKey>();
      list.add(accessTypesObject.getPrimaryKey());
      list.add(partnerObject.getPrimaryKey());
      list.add(uriPatternsObject.getPrimaryKey());
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createAssociationKey(list, "org.phoenixbioinformatics.api.db.api.AccessRule");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create an association-key child data-access AccessRule DTO proxy (supports lazy loading).
    org.phoenixbioinformatics.api.db.api.IAccessRule dto =
      new org.phoenixbioinformatics.api.db.api.AccessRuleProxy(new org.phoenixbioinformatics.api.db.api.AccessRule(key, accessTypesObject.toDto(), partnerObject.toDto(), uriPatternsObject.toDto(), accessTypeId, uriPatternId, partnerId, partner));

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsAccessRule(dto);
  }
  /**
   * Create a new SubscriptionTransaction child of Partner with a composite key.
   * 
   * @param parent the parent of the child object to create
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param transactionNo the identifying transaction number within the subscription that uniquely
identifies the transaction along with the subscription key
   * @param transactionDate the date and time of the transaction
   * @param startDate at the time of the transaction, the date at which the subscription commences
   * @param endDate at the time of the transaction, the date at which the subscription ends
   * @param transactionType the kind of transaction: Initial, Renewal, Refund
   * @param activationCodeId foreign key used by setter to query associated object
   * @return a new SubscriptionTransaction business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsSubscriptionTransaction createSubscriptionTransaction(org.phoenixbioinformatics.api.bs.api.BsPartner parent, java.lang.String partnerId, java.math.BigInteger partyId, java.math.BigInteger transactionNo, java.sql.Timestamp transactionDate, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.lang.String transactionType, java.util.UUID activationCodeId) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.CompositePrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.col.AbstractColumnValue> list =
        new java.util.ArrayList<com.poesys.db.col.AbstractColumnValue>();
      list.add(new com.poesys.db.col.BigIntegerColumnValue("transactionNo", transactionNo));
	  com.poesys.db.pk.IPrimaryKey subKey = 
	    com.poesys.db.pk.PrimaryKeyFactory.createNaturalKey(list, "org.phoenixbioinformatics.api.db.api.SubscriptionTransaction");
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createCompositeKey(parent.getPrimaryKey(), 
                                                              subKey,
                                                              "org.phoenixbioinformatics.api.db.api.SubscriptionTransaction");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create a composite-key child data-access SubscriptionTransaction DTO for direct access, no proxy required.
    org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction dto =
      new org.phoenixbioinformatics.api.db.api.SubscriptionTransaction(key, partnerId, partyId, transactionNo, transactionDate, startDate, endDate, transactionType, activationCodeId);

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsSubscriptionTransaction(dto);
  }
  /**
   * Create a new Subscription association class child of Partner with 
   * an association key. This class links the input objects.
   * 
   * @param subscribedPartnersObject associated Partner object (part of the key)
   * @param subscribersObject associated Party object (part of the key)
   * @param partnerId Attribute that is part of the association key
   * @param partyId Attribute that is part of the association key
   * @param startDate the date and time at which the subscription commences; if this is in the future,
the subscription is not yet in effect
   * @param endDate the date and time at which the subscription ends
   * @param subscriptionId an alternate single-number identifier for the subscription
   * @return a new Subscription business layer DTO
   * @throws DelegateException when a parameter causes a problem
   */
  public org.phoenixbioinformatics.api.bs.api.BsSubscription createSubscription(org.phoenixbioinformatics.api.bs.api.BsPartner subscribedPartnersObject, org.phoenixbioinformatics.api.bs.api.BsParty subscribersObject, java.lang.String partnerId, java.math.BigInteger partyId, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.math.BigInteger subscriptionId) throws DelegateException {
    // Create the key.
    com.poesys.db.pk.AssociationPrimaryKey key = null;
    try {
      java.util.ArrayList<com.poesys.db.pk.IPrimaryKey> list =
        new java.util.ArrayList<com.poesys.db.pk.IPrimaryKey>();
      list.add(subscribedPartnersObject.getPrimaryKey());
      list.add(subscribersObject.getPrimaryKey());
      key = 
        com.poesys.db.pk.PrimaryKeyFactory.createAssociationKey(list, "org.phoenixbioinformatics.api.db.api.Subscription");
    } catch (com.poesys.db.InvalidParametersException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    } catch (com.poesys.db.DuplicateKeyNameException e) {
      Object[] args = e.getParameters().toArray();
      String message = com.poesys.db.Message.getMessage(e.getMessage(), args);
      throw new DelegateException(message, e);
    }

    // Create an association-key child data-access Subscription DTO proxy (supports lazy loading).
    org.phoenixbioinformatics.api.db.api.ISubscription dto =
      new org.phoenixbioinformatics.api.db.api.SubscriptionProxy(new org.phoenixbioinformatics.api.db.api.Subscription(key, subscribedPartnersObject.toDto(), subscribersObject.toDto(), partnerId, partyId, startDate, endDate, subscriptionId));

    // Create the business DTO.
    return new org.phoenixbioinformatics.api.bs.api.BsSubscription(dto);
  }

  @Override
  public void truncateTable(String tableName) throws DelegateException {
    java.sql.Connection c = getConnection();
    com.poesys.db.dao.ddl.ISql sql = null;
    com.poesys.db.dao.ddl.IExecuteSql executive = null;

    // First truncate any child tables.
    sql = new com.poesys.db.dao.ddl.TruncateTableSql("PartnerPattern");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "PartnerPattern", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("SubscriptionTerm");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "SubscriptionTerm", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("SubscriptionDescriptionItem");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "SubscriptionDescriptionItem", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("SubscriptionDescription");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "SubscriptionDescription", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("IpCount");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "IpCount", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("LimitValue");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "LimitValue", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("AccessRule");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "AccessRule", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("SubscriptionTransaction");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "SubscriptionTransaction", e);
    }

    sql = new com.poesys.db.dao.ddl.TruncateTableSql("Subscription");
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "Subscription", e);
    }

    // Now truncate the current table.
    sql = new com.poesys.db.dao.ddl.TruncateTableSql(tableName);
    executive = new com.poesys.db.dao.ddl.ExecuteSql(sql);
    try {
      executive.execute(c);
    } catch (java.sql.SQLException e) {
      throw new DelegateException(e.getMessage() + ": " + "Partner", e);
    }
  }
}

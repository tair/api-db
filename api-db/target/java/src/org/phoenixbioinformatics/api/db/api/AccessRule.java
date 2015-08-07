/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the AccessRule. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A rule that links a set of URIs to a specific access type for a specific partner
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>AssociationKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class AccessRule extends AbstractAccessRule {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a AccessRule as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public AccessRule() {
    super(); 
  }

  /**
   * <p>
   * Create a AccessRule. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the AccessRule
   * @param accessTypesObject wraps an associated IAccessType object
   * @param partnerObject wraps an associated IPartner object
   * @param uriPatternsObject wraps an associated IUriPattern object
   * @param accessTypeId Attribute that is part of the association key
   * @param uriPatternId Attribute that is part of the association key
   * @param partnerId foreign key used as primary key in association class
   * @param partner 
   */
  public AccessRule(IPrimaryKey key, org.phoenixbioinformatics.api.db.api.IAccessType accessTypesObject, org.phoenixbioinformatics.api.db.api.IPartner partnerObject, org.phoenixbioinformatics.api.db.api.IUriPattern uriPatternsObject, java.math.BigInteger accessTypeId, java.math.BigInteger uriPatternId, java.lang.String partnerId, org.phoenixbioinformatics.api.db.api.IPartner partner) {
    super(key, accessTypesObject, partnerObject, uriPatternsObject, accessTypeId, uriPatternId, partnerId, partner); 
  }
}
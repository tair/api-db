/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the AccessRule. This class
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
public class BsAccessRule extends org.phoenixbioinformatics.api.bs.api.AbstractBsAccessRule {
  /**
   * Create a BsAccessRule object from a AccessRule object.
   * 
   * @param dto the data-access layer AccessRule DTO
   * @throws DelegateException when there is a problem creating the AccessRule
   */
  public BsAccessRule(org.phoenixbioinformatics.api.db.api.IAccessRule dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsAccessRule. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the AccessRule
   * @param accessTypesObject ${key.paramTag}
   * @param partnerObject ${key.paramTag}
   * @param uriPatternsObject ${key.paramTag}
   * @param accessTypeId Attribute that is part of the association key
   * @param uriPatternId Attribute that is part of the association key
   * @param partnerId foreign key used as primary key in association class
   * @param partner 
   */
  public BsAccessRule(IPrimaryKey key, org.phoenixbioinformatics.api.db.api.IAccessType accessTypesObject, org.phoenixbioinformatics.api.db.api.IPartner partnerObject, org.phoenixbioinformatics.api.db.api.IUriPattern uriPatternsObject, java.math.BigInteger accessTypeId, java.math.BigInteger uriPatternId, java.math.BigInteger partnerId, org.phoenixbioinformatics.api.db.api.IPartner partner) {
    super(key, accessTypesObject, partnerObject, uriPatternsObject, accessTypeId, uriPatternId, partnerId, partner); 
  }
}
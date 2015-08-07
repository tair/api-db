/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Subscription. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An agreement by a party to take and pay for access to a partner system; a
 * relationship between a party and a partner system
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
public class BsSubscription extends org.phoenixbioinformatics.api.bs.api.AbstractBsSubscription {
  /**
   * Create a BsSubscription object from a Subscription object.
   * 
   * @param dto the data-access layer Subscription DTO
   * @throws DelegateException when there is a problem creating the Subscription
   */
  public BsSubscription(org.phoenixbioinformatics.api.db.api.ISubscription dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsSubscription. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Subscription
   * @param subscribedPartnersObject ${key.paramTag}
   * @param subscribersObject ${key.paramTag}
   * @param partnerId Attribute that is part of the association key
   * @param partyId Attribute that is part of the association key
   * @param startDate the date and time at which the subscription commences; if this is in the future,
the subscription is not yet in effect
   * @param endDate the date and time at which the subscription ends
   * @param subscriptionId an alternate single-number identifier for the subscription
   */
  public BsSubscription(IPrimaryKey key, org.phoenixbioinformatics.api.db.api.IPartner subscribedPartnersObject, org.phoenixbioinformatics.api.db.api.IParty subscribersObject, java.lang.String partnerId, java.math.BigInteger partyId, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.math.BigInteger subscriptionId) {
    super(key, subscribedPartnersObject, subscribersObject, partnerId, partyId, startDate, endDate, subscriptionId); 
  }
}
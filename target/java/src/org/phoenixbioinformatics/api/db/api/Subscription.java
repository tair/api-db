/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Subscription. This class
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
public class Subscription extends AbstractSubscription {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Subscription as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Subscription() {
    super(); 
  }

  /**
   * <p>
   * Create a Subscription. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Subscription
   * @param partnersObject wraps an associated IPartner object
   * @param subscribersObject wraps an associated IParty object
   * @param partnerId Attribute that is part of the association key
   * @param partyId Attribute that is part of the association key
   * @param startDate the date and time at which the subscription commences; if this is in the future,
the subscription is not yet in effect
   * @param endDate the date and time at which the subscription ends
   * @param subscriptionId an alternate single-number identifier for the subscription
   */
  public Subscription(IPrimaryKey key, org.phoenixbioinformatics.api.db.api.IPartner partnersObject, org.phoenixbioinformatics.api.db.api.IParty subscribersObject, java.math.BigInteger partnerId, java.math.BigInteger partyId, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.lang.Long subscriptionId) {
    super(key, partnersObject, subscribersObject, partnerId, partyId, startDate, endDate, subscriptionId); 
  }
}
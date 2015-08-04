/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the SubscriptionTransaction. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A specific transaction related to the subscription; provides the transactional
 * history for the subscription
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>CompositeKey</li>
 *     <li>Persistent</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsSubscriptionTransaction extends org.phoenixbioinformatics.api.bs.api.AbstractBsSubscriptionTransaction {
  /**
   * Create a BsSubscriptionTransaction object from a SubscriptionTransaction object.
   * 
   * @param dto the data-access layer SubscriptionTransaction DTO
   * @throws DelegateException when there is a problem creating the SubscriptionTransaction
   */
  public BsSubscriptionTransaction(org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsSubscriptionTransaction. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the SubscriptionTransaction
   * @param partnerId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param transactionNo the identifying transaction number within the subscription that uniquely
identifies the transaction along with the subscription key
   * @param transactionDate the date and time of the transaction
   * @param startDate at the time of the transaction, the date at which the subscription commences
   * @param endDate at the time of the transaction, the date at which the subscription ends
   * @param transactionType the kind of transaction: Initial, Renewal, Refund
   * @param activationCodeId foreign key used by setter to query associated object
   */
  public BsSubscriptionTransaction(IPrimaryKey key, java.math.BigInteger partnerId, java.math.BigInteger partyId, java.math.BigInteger transactionNo, java.sql.Timestamp transactionDate, java.sql.Timestamp startDate, java.sql.Timestamp endDate, java.lang.String transactionType, java.util.UUID activationCodeId) {
    super(key, partnerId, partyId, transactionNo, transactionDate, startDate, endDate, transactionType, activationCodeId); 
  }
}
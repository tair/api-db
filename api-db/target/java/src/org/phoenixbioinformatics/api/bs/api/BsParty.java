/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Party. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * An abstract entity that is either a person or an organization
 * </p>
 * <p>
 * Stereotypes:
 * </p>
 * <ul>
 *     <li>Persistent</li>
 *     <li>SequenceKey</li>
 * </ul>
 * 
 * @author Poesys/DB Cartridge
 */
public class BsParty extends org.phoenixbioinformatics.api.bs.api.AbstractBsParty {
  /**
   * Create a BsParty object from a Party object.
   * 
   * @param dto the data-access layer Party DTO
   * @throws DelegateException when there is a problem creating the Party
   */
  public BsParty(org.phoenixbioinformatics.api.db.api.IParty dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsParty. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Party
   * @param partyId primary key attribute
   * @param name the name by which the party is known
   * @param partyType the kind of Party this is:
User
   * @param display 
   * @param countryId foreign key used by setter to query associated object
   */
  public BsParty(IPrimaryKey key, java.math.BigInteger partyId, java.lang.String name, java.lang.String partyType, java.lang.Boolean display, java.math.BigInteger countryId) {
    super(key, partyId, name, partyType, display, countryId); 
  }
}
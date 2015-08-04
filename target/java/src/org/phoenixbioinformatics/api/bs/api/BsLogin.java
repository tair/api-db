/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the Login. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * the username and password that correspond to a party and partner; the system
 * verifies the identity of the party by comparison of the password given the
 * username; note that the name changed from "User" because that was an Oracle
 * keyword
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
public class BsLogin extends org.phoenixbioinformatics.api.bs.api.AbstractBsLogin {
  /**
   * Create a BsLogin object from a Login object.
   * 
   * @param dto the data-access layer Login DTO
   * @throws DelegateException when there is a problem creating the Login
   */
  public BsLogin(org.phoenixbioinformatics.api.db.api.ILogin dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsLogin. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the Login
   * @param partyId composite super-key attribute that uniquely identifies child combined with child sub-key and any other parent super-keys
   * @param username the unique, case-insensitive username for a party
   * @param password the password that authenticates the user/party
   * @param email the party's email address
   * @param institution the name of the organization to which the party belongs, such as a company or
university name
   * @param userIdentifier a partner-specific identifier for the user, represented as a string (such as the
TAIR community id); used by the partner to identify the user
   * @param partnerId foreign key used by setter to query associated object
   */
  public BsLogin(IPrimaryKey key, java.math.BigInteger partyId, java.lang.String username, java.lang.String password, java.lang.String email, java.lang.String institution, java.lang.String userIdentifier, java.math.BigInteger partnerId) {
    super(key, partyId, username, password, email, institution, userIdentifier, partnerId); 
  }
}
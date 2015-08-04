/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the Login. This class
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
public class Login extends AbstractLogin {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a Login as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public Login() {
    super(); 
  }

  /**
   * <p>
   * Create a Login. This constructor calls the abstract superclass 
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
  public Login(IPrimaryKey key, java.math.BigInteger partyId, java.lang.String username, java.lang.String password, java.lang.String email, java.lang.String institution, java.lang.String userIdentifier, java.math.BigInteger partnerId) {
    super(key, partyId, username, password, email, institution, userIdentifier, partnerId); 
  }
}
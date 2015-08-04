/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the AccessType. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * A particular kind of access to authorize
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
public class AccessType extends AbstractAccessType {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a AccessType as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public AccessType() {
    super(); 
  }

  /**
   * <p>
   * Create a AccessType. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the AccessType
   * @param accessTypeId primary key attribute
   * @param name the name of the access type
   */
  public AccessType(IPrimaryKey key, java.math.BigInteger accessTypeId, java.lang.String name) {
    super(key, accessTypeId, name); 
  }
}
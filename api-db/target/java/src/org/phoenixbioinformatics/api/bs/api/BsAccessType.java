/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the AccessType. This class
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
public class BsAccessType extends org.phoenixbioinformatics.api.bs.api.AbstractBsAccessType {
  /**
   * Create a BsAccessType object from a AccessType object.
   * 
   * @param dto the data-access layer AccessType DTO
   * @throws DelegateException when there is a problem creating the AccessType
   */
  public BsAccessType(org.phoenixbioinformatics.api.db.api.IAccessType dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsAccessType. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the AccessType
   * @param accessTypeId primary key attribute
   * @param name the name of the access type
   */
  public BsAccessType(IPrimaryKey key, java.math.BigInteger accessTypeId, java.lang.String name) {
    super(key, accessTypeId, name); 
  }
}
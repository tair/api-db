/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: BsDto.vsl

package org.phoenixbioinformatics.api.bs.api;


import com.poesys.db.pk.IPrimaryKey;
import com.poesys.bs.delegate.DelegateException;


/**
 * <p>
 * A business layer data-transfer object for the ApiKey. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * <p>
 * Provides a set of API keys for use in authenticating callers of the API; only
 * authenticated callers may call the API
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
public class BsApiKey extends org.phoenixbioinformatics.api.bs.api.AbstractBsApiKey {
  /**
   * Create a BsApiKey object from a ApiKey object.
   * 
   * @param dto the data-access layer ApiKey DTO
   * @throws DelegateException when there is a problem creating the ApiKey
   */
  public BsApiKey(org.phoenixbioinformatics.api.db.api.IApiKey dto) throws DelegateException {
    super(dto);
  }

  /**
   * <p>
   * Create a BsApiKey. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ApiKey
   * @param apiKeyId primary key attribute
   * @param apiKey the API key token
   */
  public BsApiKey(IPrimaryKey key, java.math.BigInteger apiKeyId, java.lang.String apiKey) {
    super(key, apiKeyId, apiKey); 
  }
}
/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DbDto.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A data-access layer data-transfer object for the ApiKey. This class
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
public class ApiKey extends AbstractApiKey {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;

  /**
   * <p>
   * Create a ApiKey as a new object. This constructor calls the abstract 
   * superclass constructor.
   * </p>
   *
   */
  public ApiKey() {
    super(); 
  }

  /**
   * <p>
   * Create a ApiKey. This constructor calls the abstract superclass 
   * constructor.
   * </p>
   *
   * @param key the primary key of the ApiKey
   * @param apiKeyId primary key attribute
   * @param apiKey the API key token
   */
  public ApiKey(IPrimaryKey key, java.math.BigInteger apiKeyId, java.lang.String apiKey) {
    super(key, apiKeyId, apiKey); 
  }
}
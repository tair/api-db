/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDbDtoProxy.vsl

package org.phoenixbioinformatics.api.db.api;


import com.poesys.db.dto.AbstractLazyLoadingDtoProxy;


/**
 * <p>
 * A data-access layer data-transfer object (DTO) lazy-loading proxy for the 
 * ApiKey. This class is an abstract class that contains AndroMDA 
 * generated code; change nothing in this class. Instead, override any methods 
 * in the concrete subclass generated in the same package. AndroMDA will 
 * overwrite this class each time you run it but will never overwrite the concrete subclass.
 * </p>
 * <p>
 * Provides a set of API keys for use in authenticating callers of the API; only
 * authenticated callers may call the API
 * </p>
 *
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractApiKeyProxy extends AbstractLazyLoadingDtoProxy implements IApiKey {
  /** Default serial version UID for the Serializable DTO */
  private static final long serialVersionUID = 1L;
  
  /**
   * Create a ApiKeyProxy. The concrete subclass must call this constructor.
   *
   * @param dto the DTO to proxy
   */
  public AbstractApiKeyProxy(ApiKey dto) {
    super(dto);

  }

  @Override
  public boolean equals(Object obj) {
    AbstractApiKeyProxy otherProxy = (AbstractApiKeyProxy)obj;
    return ((ApiKey)dto).equals(otherProxy.dto);
  }

  @Override
  public int hashCode() {
    return ((ApiKey)dto).hashCode();
  }

  // Local properties (attributes, associations, and association classes)

  /**
   * Get an object of java.math.BigInteger
   *
   * Source: AddGeneratedKeyProperties
   * Lazy: false
   * 
   * @return a java.math.BigInteger
   */
  public java.math.BigInteger getApiKeyId() {
    return ((ApiKey)dto).getApiKeyId();
  }

  /**
   * Get an object of java.lang.String
   *
   * Source: AddLocalAttributeProperties
   * Lazy: false
   * 
   * @return a java.lang.String
   */
  public java.lang.String getApiKey() {
    return ((ApiKey)dto).getApiKey();
  }

  public void setApiKey(java.lang.String apiKey)
      throws com.poesys.db.InvalidParametersException {
    ((ApiKey)dto).setApiKey(apiKey);
  }

  public void markChildrenDeleted() throws com.poesys.db.dto.DtoStatusException {
  	((ApiKey)dto).markChildrenDeleted();
  }
}
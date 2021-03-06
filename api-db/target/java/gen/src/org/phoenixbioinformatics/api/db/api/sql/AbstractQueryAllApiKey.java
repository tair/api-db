/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAll.vsl

package org.phoenixbioinformatics.api.db.api.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.phoenixbioinformatics.api.db.api.ApiFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query for all the 
 * ApiKey objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllApiKey implements IQuerySql<org.phoenixbioinformatics.api.db.api.IApiKey> {
  /** SQL query statement for ApiKey */
  private static final String SQL =
    "SELECT apiKeyId, apiKey FROM ApiKey";

  public org.phoenixbioinformatics.api.db.api.IApiKey getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      ApiFactory.getApiKeyPrimaryKey(rs, "");
      
    return ApiFactory.getApiKeyData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return ApiFactory.getApiKeyPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}
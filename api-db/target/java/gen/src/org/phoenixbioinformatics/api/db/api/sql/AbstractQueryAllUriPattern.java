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
 * UriPattern objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllUriPattern implements IQuerySql<org.phoenixbioinformatics.api.db.api.IUriPattern> {
  /** SQL query statement for UriPattern */
  private static final String SQL =
    "SELECT uriPatternId, pattern FROM UriPattern";

  public org.phoenixbioinformatics.api.db.api.IUriPattern getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      ApiFactory.getUriPatternPrimaryKey(rs, "");
      
    return ApiFactory.getUriPatternData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return ApiFactory.getUriPatternPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}
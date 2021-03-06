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
 * PageView objects in the database; use with caution
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAllPageView implements IQuerySql<org.phoenixbioinformatics.api.db.api.IPageView> {
  /** SQL query statement for PageView */
  private static final String SQL =
    "SELECT pageViewId, pageViewDate, uri, ip, sessionId, partyId FROM PageView";

  public org.phoenixbioinformatics.api.db.api.IPageView getData(ResultSet rs) throws SQLException {
    IPrimaryKey key = 
      ApiFactory.getPageViewPrimaryKey(rs, "");
      
    return ApiFactory.getPageViewData(key, rs);
  }
  
  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return ApiFactory.getPageViewPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}
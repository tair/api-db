/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQuery.vsl

package org.phoenixbioinformatics.api.db.api.sql;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.dao.query.IKeyQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL key query for the 
 * Party. This SQL specification contains a SQL statement that queries
 * a single Party object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryParty implements IKeyQuerySql<org.phoenixbioinformatics.api.db.api.IParty> {
  /** SQL query statement for Party */
  private static final String SQL =
    "SELECT partyId, name, partyType FROM Party WHERE ";

  public org.phoenixbioinformatics.api.db.api.IParty getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getPartyData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}
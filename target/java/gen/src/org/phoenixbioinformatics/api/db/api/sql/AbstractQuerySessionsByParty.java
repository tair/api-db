/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedOneToManyObjects.vsl

package org.phoenixbioinformatics.api.db.api.sql;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.ConstraintViolationException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IParameterizedQuerySql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * <p>
 * A query Command pattern object that implements a SQL query of a collection of 
 * PageView objects using the primary key of an associated 
 * Party object through the association Sessions. This
 * is a many-to-one association from PageView to Party.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * PageView objects from the database using the foreign key type
 * Party.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQuerySessionsByParty 
    implements IParameterizedQuerySql<org.phoenixbioinformatics.api.db.api.IPageView, org.phoenixbioinformatics.api.db.api.IParty> {
  /** SQL query statement for PageView */
  private static final String SQL =
    "SELECT PageView.pageViewId, PageView.pageViewDate, PageView.uri, PageView.ip, PageView.sessionId, PageView.partyId FROM PageView WHERE PageView.partyId = ?";

  public void bindParameters(PreparedStatement stmt, org.phoenixbioinformatics.api.db.api.IParty parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.phoenixbioinformatics.api.db.api.IParty parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.phoenixbioinformatics.api.db.api.IPageView getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getPageViewData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getPageViewPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}
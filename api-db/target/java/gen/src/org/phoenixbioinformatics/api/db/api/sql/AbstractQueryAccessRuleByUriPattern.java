/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedLinks.vsl

package org.phoenixbioinformatics.api.db.api.sql;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.poesys.db.ConstraintViolationException;
import com.poesys.db.InvalidParametersException;
import com.poesys.db.dao.query.IParameterizedQuerySql;
import com.poesys.db.pk.IPrimaryKey;

import org.phoenixbioinformatics.api.db.api.ApiFactory;


/**
 * <p>
 * A query Command pattern object that implements a SQL query of a collection of 
 * AccessRule objects using the primary key of the associated
 * class UriPattern. These objects are the linking objects from the SQL 
 * table AccessRule rather than the objects associated through
 * the link (AccessType), which have a separate representation.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryAccessRuleByUriPattern 
    implements IParameterizedQuerySql<org.phoenixbioinformatics.api.db.api.IAccessRule, org.phoenixbioinformatics.api.db.api.IUriPattern> {
  /** SQL query statement for AccessRule */
  private static final String SQL =
    "SELECT accessTypeId, uriPatternId, partnerId FROM AccessRule WHERE uriPatternId = ?";

  public void bindParameters(PreparedStatement stmt, org.phoenixbioinformatics.api.db.api.IUriPattern parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.phoenixbioinformatics.api.db.api.IUriPattern parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.phoenixbioinformatics.api.db.api.IAccessRule getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return ApiFactory.getAccessRuleData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return ApiFactory.getAccessRulePrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}
/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractQueryAssociatedManyToManyObjects.vsl


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
 * Party objects using the primary key of an associated 
 * Partner object through the association Subscribers using the 
 * association class Subscription. This association is a many-to-many 
 * association from Party to Partner.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * Party objects from the database table Party by
 * joining to the database table Subscription and using the 
 * primary key from Partner to query the collection.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQuerySubscribersByPartner 
    implements IParameterizedQuerySql<org.phoenixbioinformatics.api.db.api.IParty, org.phoenixbioinformatics.api.db.api.IPartner> {
  /** SQL query statement for Party */
  private static final String SQL =
    "SELECT a.partyId, a.name, a.partyType, a.display, a.countryId FROM Party a JOIN Subscription b ON a.partyId = b.partyId WHERE b.partnerId = ?";

  public void bindParameters(PreparedStatement stmt, org.phoenixbioinformatics.api.db.api.IPartner parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.phoenixbioinformatics.api.db.api.IPartner parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.phoenixbioinformatics.api.db.api.IParty getData(ResultSet rs) 
      throws SQLException, ConstraintViolationException {
    IPrimaryKey key = 
      org.phoenixbioinformatics.api.db.api.ApiFactory.getPartyPrimaryKey(rs, "");
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getPartyData(key, rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getPartyPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}
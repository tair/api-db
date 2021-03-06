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
 * SubscriptionDescriptionItem objects using the primary key of an associated 
 * SubscriptionDescription object through the association Items. This
 * is a many-to-one association from SubscriptionDescriptionItem to SubscriptionDescription.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * SubscriptionDescriptionItem objects from the database using the foreign key type
 * SubscriptionDescription.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQueryItemsBySubscriptionDescription 
    implements IParameterizedQuerySql<org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem, org.phoenixbioinformatics.api.db.api.ISubscriptionDescription> {
  /** SQL query statement for SubscriptionDescriptionItem */
  private static final String SQL =
    "SELECT SubscriptionDescriptionItem.descriptionType, SubscriptionDescriptionItem.partnerId, SubscriptionDescriptionItem.itemNo, SubscriptionDescriptionItem.text FROM SubscriptionDescriptionItem WHERE SubscriptionDescriptionItem.descriptionType = ? AND SubscriptionDescriptionItem.partnerId = ?";

  public void bindParameters(PreparedStatement stmt, org.phoenixbioinformatics.api.db.api.ISubscriptionDescription parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.phoenixbioinformatics.api.db.api.ISubscriptionDescription parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.phoenixbioinformatics.api.db.api.ISubscriptionDescriptionItem getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getSubscriptionDescriptionItemData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getSubscriptionDescriptionItemPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}
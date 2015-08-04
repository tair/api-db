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
 * SubscriptionDescription. This SQL specification contains a SQL statement that queries
 * a single SubscriptionDescription object from the database using the primary key.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQuerySubscriptionDescription implements IKeyQuerySql<org.phoenixbioinformatics.api.db.api.ISubscriptionDescription> {
  /** SQL query statement for SubscriptionDescription */
  private static final String SQL =
    "SELECT partnerId, header, descriptionType FROM SubscriptionDescription WHERE ";

  public org.phoenixbioinformatics.api.db.api.ISubscriptionDescription getData(IPrimaryKey key, ResultSet rs) throws SQLException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getSubscriptionDescriptionData(key, rs);
  }

  public String getSql(IPrimaryKey key) {
    return SQL + key.getSqlWhereExpression("");
  }
}
/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractUpdate.vsl

package org.phoenixbioinformatics.api.db.api.sql;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.update.IUpdateSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for updating a Subscription with read/write properties
 * 
 * @author Robert J. Muller
 */
public class AbstractUpdateSubscription implements IUpdateSql<org.phoenixbioinformatics.api.db.api.ISubscription> {
  /** SQL UPDATE statement for Subscription */
  private static final String SQL =
    "UPDATE Subscription SET startDate = ?, endDate = ?, subscriptionId = ? WHERE ";

  @Override
  public String getSql(IPrimaryKey key) {
    StringBuilder builder = new StringBuilder(SQL);
    builder.append(key.getSqlWhereExpression(""));
    return builder.toString();
  }

  @Override
  public int setParams(PreparedStatement stmt, int index, org.phoenixbioinformatics.api.db.api.ISubscription object)
      throws SQLException {
    stmt.setTimestamp(index, object.getStartDate());
    index++;
    stmt.setTimestamp(index, object.getEndDate());
    index++;
    stmt.setBigDecimal(index, object.getSubscriptionId() == null ? null : new java.math.BigDecimal(object.getSubscriptionId()));
    index++;
    // sets primary key in where clause
    index = object.getPrimaryKey().setParams(stmt, index);
    return index;
  }
}

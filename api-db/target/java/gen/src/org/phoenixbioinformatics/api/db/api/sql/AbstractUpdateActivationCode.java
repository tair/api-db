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
 * SQL statement specification for updating a ActivationCode with read/write properties
 * 
 * @author Robert J. Muller
 */
public class AbstractUpdateActivationCode implements IUpdateSql<org.phoenixbioinformatics.api.db.api.IActivationCode> {
  /** SQL UPDATE statement for ActivationCode */
  private static final String SQL =
    "UPDATE ActivationCode SET period = ?, purchaseDate = ?, partnerId = ? WHERE ";

  @Override
  public String getSql(IPrimaryKey key) {
    StringBuilder builder = new StringBuilder(SQL);
    builder.append(key.getSqlWhereExpression(""));
    return builder.toString();
  }

  @Override
  public int setParams(PreparedStatement stmt, int index, org.phoenixbioinformatics.api.db.api.IActivationCode object)
      throws SQLException {
    stmt.setInt(index, object.getPeriod());
    index++;
    stmt.setTimestamp(index, object.getPurchaseDate());
    index++;
    // sets key params for required partner object
    index = object.getPartner().getPrimaryKey().setParams(stmt, index);
    // sets primary key in where clause
    index = object.getPrimaryKey().setParams(stmt, index);
    return index;
  }
}

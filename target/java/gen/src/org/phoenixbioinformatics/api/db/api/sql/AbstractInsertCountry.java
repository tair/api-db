/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractInsert.vsl

package org.phoenixbioinformatics.api.db.api.sql;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.poesys.db.dao.insert.IInsertSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for inserting a Country
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertCountry implements IInsertSql<org.phoenixbioinformatics.api.db.api.ICountry> {
  private static final String SQL =
    "INSERT INTO Country (countryId, name) VALUES (?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.phoenixbioinformatics.api.db.api.ICountry object)
      throws SQLException {
    stmt.setString(index, object.getName());
    index++;
  }
}

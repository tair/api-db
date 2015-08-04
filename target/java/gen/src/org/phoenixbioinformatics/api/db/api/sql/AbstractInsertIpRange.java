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
 * SQL statement specification for inserting a IpRange
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertIpRange implements IInsertSql<org.phoenixbioinformatics.api.db.api.IIpRange> {
  private static final String SQL =
    "INSERT INTO IpRange (partyId, startIp, endIp) VALUES (?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.phoenixbioinformatics.api.db.api.IIpRange object)
      throws SQLException {
    stmt.setString(index, object.getEnd());
    index++;
  }
}
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
 * SQL statement specification for inserting a PartnerPattern
 * 
 * @author Robert J. Muller
 */
public class AbstractInsertPartnerPattern implements IInsertSql<org.phoenixbioinformatics.api.db.api.IPartnerPattern> {
  private static final String SQL =
    "INSERT INTO PartnerPattern (partnerId, sourceUri, targetUri) VALUES (?,?,?)";

  public String getSql(IPrimaryKey key) {
    return SQL;
  }

  public void setParams(PreparedStatement stmt, int index, org.phoenixbioinformatics.api.db.api.IPartnerPattern object)
      throws SQLException {
    stmt.setString(index, object.getTargetUri());
    index++;
  }
}

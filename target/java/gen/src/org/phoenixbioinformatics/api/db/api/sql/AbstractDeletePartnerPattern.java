/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Generated by AndroMDA Poesys/DB cartridge: DO NOT EDIT DIRECTLY.
// Template: AbstractDelete.vsl

package org.phoenixbioinformatics.api.db.api.sql;



import com.poesys.db.dao.delete.AbstractDeleteSql;
import com.poesys.db.pk.IPrimaryKey;


/**
 * SQL statement specification for deleting a PartnerPattern
 * 
 * @author Robert J. Muller
 */
public class AbstractDeletePartnerPattern extends AbstractDeleteSql<org.phoenixbioinformatics.api.db.api.IPartnerPattern> {
  private static final String SQL =
    "DELETE FROM PartnerPattern WHERE ";

  public String getSql(IPrimaryKey key) {
    return super.getSql(key, SQL);
  }
}
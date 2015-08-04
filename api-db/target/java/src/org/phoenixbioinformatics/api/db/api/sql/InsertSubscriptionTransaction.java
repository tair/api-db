/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: Insert.vsl

package org.phoenixbioinformatics.api.db.api.sql;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;


/**
 * <p>
 * An insert of a SubscriptionTransaction. This class is the concrete subclass
 * of the generated abstract class AbstractInsertSubscriptionTransaction.
 * </p>
 * <p>
 * Make any changes to insert behavior by overriding methods here rather than
 * changing the abstract superclass; AndroMDA will overwrite that class when you
 * run it but will never overwrite this concrete subclass.
 * </p>
 * ${dto.getDocumentation}
 * 
 * @author Poesys/DB Cartridge
 */
public class InsertSubscriptionTransaction extends
    AbstractInsertSubscriptionTransaction {
  private static Logger logger = Logger.getLogger(InsertSubscriptionTransaction.class);
  @Override
  public void setParams(PreparedStatement stmt,
                        int index,
                        org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction object)
      throws SQLException {
    logger.debug("Key parameters set: " + object.getPrimaryKey().getValueList());
    stmt.setTimestamp(index, object.getTransactionDate());
    index++;
    stmt.setTimestamp(index, object.getStartDate());
    index++;
    stmt.setTimestamp(index, object.getEndDate());
    index++;
    stmt.setString(index, object.getTransactionType());
    index++;
    // Address a generation bug, should test for null for this column
    logger.debug("SQL parameter index at " + index);
    if (object.getActivationCodeId() != null) {
      logger.debug("Setting activation code SQL parameter to " + object.getActivationCodeId().toString());
      stmt.setString(index, object.getActivationCodeId().toString());
    } else {
      logger.debug("Setting activation code parameter to null");
      stmt.setString(index, null);
    }
    index++;
  }
}
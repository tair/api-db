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
 * SubscriptionTransaction objects using the primary key of an associated 
 * Subscription object through the association SubscriptionTransactions. This
 * is a many-to-one association from SubscriptionTransaction to Subscription.
 * </p>
 * <p>
 * This SQL specification contains a SQL statement that queries a collection of
 * SubscriptionTransaction objects from the database using the foreign key type
 * Subscription.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public abstract class AbstractQuerySubscriptionTransactionsBySubscription 
    implements IParameterizedQuerySql<org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction, org.phoenixbioinformatics.api.db.api.ISubscription> {
  /** SQL query statement for SubscriptionTransaction */
  private static final String SQL =
    "SELECT SubscriptionTransaction.partnerId, SubscriptionTransaction.partyId, SubscriptionTransaction.transactionNo, SubscriptionTransaction.transactionDate, SubscriptionTransaction.startDate, SubscriptionTransaction.endDate, SubscriptionTransaction.transactionType, SubscriptionTransaction.activationCodeId FROM SubscriptionTransaction WHERE SubscriptionTransaction.partnerId = ? AND SubscriptionTransaction.partyId = ?";

  public void bindParameters(PreparedStatement stmt, org.phoenixbioinformatics.api.db.api.ISubscription parameters)
      throws SQLException {
    // Set the parameters starting with the first parameter.
    parameters.getPrimaryKey().setParams(stmt, 1);
  }

  public String getParameterValues(org.phoenixbioinformatics.api.db.api.ISubscription parameters) {
    // Create the output string with the key parameters.
    return parameters.getPrimaryKey().getValueList();
  }

  public org.phoenixbioinformatics.api.db.api.ISubscriptionTransaction getData(ResultSet rs) throws SQLException,
      ConstraintViolationException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getSubscriptionTransactionData(getPrimaryKey(rs), rs);
  }

  public IPrimaryKey getPrimaryKey(ResultSet rs) throws SQLException,
      InvalidParametersException {
    return org.phoenixbioinformatics.api.db.api.ApiFactory.getSubscriptionTransactionPrimaryKey(rs, "");
  }

  public String getSql() {
    return SQL;
  }
}
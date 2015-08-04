/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: QueryAssociatedOneToManyObjects.vsl

package org.phoenixbioinformatics.api.db.api.sql;

/**
 * <p>
 * A query of a collection of AccessRule objects using the primary key of an
 * associated Partner object. This class is the concrete subclass of the
 * generated abstract class AbstractQueryAccessRulesBy${query.foriegnTypeName}.
 * </p>
 * <p>
 * Make any changes to query behavior by overriding methods here rather than
 * changing the abstract superclass; AndroMDA will overwrite that class when you
 * run it but will never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class QueryAccessRulesByPartner extends
    AbstractQueryAccessRulesByPartner {
  /**
   * SQL query statement for AccessRule--overrides generated code which has an
   * extra select-list column "AccessRule.partner"
   */
  private static final String SQL =
    "SELECT AccessRule.accessTypeId, AccessRule.uriPatternId, AccessRule.partnerId FROM AccessRule WHERE AccessRule.partnerId = ?";

  @Override
  public String getSql() {
    return SQL;
  }

}
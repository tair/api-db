/**
 * Copyright 2011 Carnegie Institution for Science. All rights reserved.
 */
// Template: DelegateTest.vsl

package org.phoenixbioinformatics.api.bs.api;

import java.math.BigInteger;

import org.phoenixbioinformatics.api.db.api.ApiFactory;

import com.poesys.db.pk.IPrimaryKey;
import com.poesys.db.pk.SequencePrimaryKey;


/**
 * <p>
 * A test class for the PageViewDelegate class. This class
 * is the concrete subclass of the generated abstract class. Make any changes
 * to DTO behavior by overriding methods here rather than changing the abstract
 * superclass; AndroMDA will overwrite that class when you run it but will
 * never overwrite this concrete subclass.
 * </p>
 * 
 * @author Poesys/DB Cartridge
 */
public class PageViewDelegateTest extends org.phoenixbioinformatics.api.bs.api.AbstractPageViewDelegateTest {


  @Override
  protected java.util.List<org.phoenixbioinformatics.api.bs.api.BsParty> createPartyApiParty(int count)
      throws com.poesys.bs.delegate.DelegateException, 
             com.poesys.db.InvalidParametersException, 
             com.poesys.db.dto.DtoStatusException {
    // Return an array containing the default party #1.
    java.util.List<org.phoenixbioinformatics.api.bs.api.BsParty> objects =
      new java.util.concurrent.CopyOnWriteArrayList<org.phoenixbioinformatics.api.bs.api.BsParty>();

    IPrimaryKey key = ApiFactory.getPartyPrimaryKey(BigInteger.ONE);
    BsParty defaultParty =
      ApiDelegateFactory.getPartyDelegate().getObject((SequencePrimaryKey)key);

    for (int i = 0; i < count; i++) {
      objects.add(defaultParty);
    }

    return objects;
  }

  @Override
  public void testTruncateTable() {
    // Truncate usually is hard; super.testTruncateTable() if desired
  }

  @Override
  public void testGetAllObjects() {
    // Too many objects to get, super.testGetAllObjects() if desired
  }
  
  @Override
  protected String getSubsystem() {
    // return explicit subsystem name
    return "org.phoenixbioinformatics.api.db.api";
    // use super.getSubsystem() to get default subsystem name if needed
  }
}
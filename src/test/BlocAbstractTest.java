package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import enumerations.TRESOR;
import enumerations.TYPE;

import service.BlocService;

public abstract class BlocAbstractTest {

	protected BlocService bs;
	
	protected BlocAbstractTest() {
		this.bs = null;
	}
	
	protected BlocService getBloc() {
		return this.bs;
	}
	
	protected void setBloc(BlocService bs) {
		this.bs = bs;
	}
	
	@After
	public void afterTest() {
		this.bs = null;
	}
	
	@Before
	public abstract void beforeTest();
	
	@Test
	public void testPostInit() {
		// cond initiale
		
		//operation
		getBloc().init(TYPE.MURBRIQUE, TRESOR.BOMBUP);
		//oracle
		Assert.assertTrue(getBloc().getType() == TYPE.MURBRIQUE);
		Assert.assertTrue(getBloc().getTresor() == TRESOR.BOMBUP);
	}
}

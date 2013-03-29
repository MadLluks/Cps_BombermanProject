package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import service.BlocService;
import service.TRESOR;
import service.TYPE;

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
		getBloc().init(TYPE.MURBRIQUE, TRESOR.DETONATOR);
		//oracle
		Assert.assertTrue(getBloc().getType() == TYPE.MURBRIQUE);
		Assert.assertTrue(getBloc().getTresor() == TRESOR.DETONATOR);
	}
}

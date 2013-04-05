package test;

import implementation.Bombe;

import org.junit.Before;

import contract.BombeContract;

public class BombeTest1 extends BombeAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setBombe(new BombeContract(new Bombe()));
	}

}

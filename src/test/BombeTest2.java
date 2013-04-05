package test;

import implementation.BombeBugs;

import org.junit.Before;

import contract.BombeContract;

public class BombeTest2 extends BombeAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setBombe(new BombeContract(new BombeBugs()));
	}

}

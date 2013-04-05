package test;

import implementation.BlocBugs;

import org.junit.Before;

import contract.BlocContract;

public class BlocTest2 extends BlocAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setBloc(new BlocContract(new BlocBugs()));
	}

}

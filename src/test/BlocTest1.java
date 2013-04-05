package test;

import implementation.Bloc;

import org.junit.Before;

import contract.BlocContract;

public class BlocTest1 extends BlocAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setBloc(new BlocContract(new Bloc()));
	}

}

package test;

import implementation.Bloc;

import org.junit.Before;

public class BlocTest1 extends BlocAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setBloc(new Bloc());
	}

}

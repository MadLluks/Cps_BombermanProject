package test;

import implementation.BlocBugs;

import org.junit.Before;

public class BlocTest2 extends BlocAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setBloc(new BlocBugs());
	}

}

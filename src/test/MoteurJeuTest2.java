package test;

import implementation.MoteurJeuBugs;

import org.junit.Before;

public class MoteurJeuTest2 extends MoteurJeuAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setMoteurJeu(new MoteurJeuBugs());
	}

}

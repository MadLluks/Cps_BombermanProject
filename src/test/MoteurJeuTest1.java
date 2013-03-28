package test;

import implementation.MoteurJeu;

import org.junit.Before;

public class MoteurJeuTest1 extends MoteurJeuAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setMoteurJeu(new MoteurJeu());
	}

}

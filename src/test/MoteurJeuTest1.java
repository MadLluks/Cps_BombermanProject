package test;

import org.junit.Before;

public class MoteurJeuTest1 extends AbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setMoteurJeu(new MoteurJeu());
	}

}

package test;

import implementation.MoteurJeu;

import org.junit.Before;

import contract.MoteurJeuContract;

public class MoteurJeuTest1 extends MoteurJeuAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setMoteurJeu(new MoteurJeuContract(new MoteurJeu()));
	}

}

package test;

import implementation.MoteurJeuBugs;

import org.junit.Before;

import contract.MoteurJeuContract;

public class MoteurJeuTest2 extends MoteurJeuAbstractTest {

	@Override
	@Before
	public void beforeTest() {
		super.setMoteurJeu(new MoteurJeuContract(new MoteurJeuBugs()));
	}

}

package test;

import service.MoteurJeuService;

public abstract class AbstractTest {
	
	protected MoteurJeuService mjs;
	
	protected MoteurJeuService getMoteurJeu() {
		return this.mjs;
	}
	
	protected void setMoteurJeu(MoteurJeuService mjs) {
		this.mjs = mjs;
	}
	
	@Before
	public abstract void beforeTest();

}

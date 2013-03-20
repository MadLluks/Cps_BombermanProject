package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import service.MoteurJeuService;

public abstract class AbstractTest {
	
	protected MoteurJeuService mjs;
	
	protected AbstractTest() {
		this.mjs = null;
	}
	
	protected MoteurJeuService getMoteurJeu() {
		return this.mjs;
	}
	
	protected void setMoteurJeu(MoteurJeuService mjs) {
		this.mjs = mjs;
	}
	
	@After
	public void afterTest() {
		this.mjs = null;
	}
	
	@Before
	public abstract void beforeTest();
	
	@Test
	public void testPreInit1() {
		try {
			getMoteurJeu().init(10);
		} catch (Exception e) {
			System.err.println("Message d'erreur relevé !!");
		}
	}
	
	@Test
	public void testPreInit2() {
		try {
			getMoteurJeu().init(-2);
			System.err.println("Pas de message d'erreur !!!");
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testPostInit() {
		//cond initiale
		
		//operation
		getMoteurJeu().init(5);

		//oracle
		Assert.assertTrue(getMoteurJeu().getMaxPasJeu() == 5);
		Assert.assertTrue(getMoteurJeu().getPasJeuCourant() == 0);
	}
	
	@Test
	public void testInvariant() {
		//cond initiale
		getMoteurJeu().init(5);
		getMoteurJeu().pasJeu(MoteurJeuService.Commande.RIEN);
		//operation
		try {
			getMoteurJeu().pasJeu(MoteurJeuService.Commande.RIEN);
		} catch (Exception e) {
			
		}
		//oracle
		Assert.assertTrue("pasJeu négatif", getMoteurJeu().getPasJeuCourant() >= 0);
		Assert.assertTrue("pasJeu supérieur à maxPasJeu", getMoteurJeu().getPasJeuCourant() <= getMoteurJeu().getMaxPasJeu());
	}

}

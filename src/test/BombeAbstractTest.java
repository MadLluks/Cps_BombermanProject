package test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import service.BombeService;

public abstract class BombeAbstractTest {

	protected BombeService bs;
	
	protected BombeAbstractTest() {
		this.bs = null;
	}
	
	protected BombeService getBombe() {
		return this.bs;
	}
	
	protected void setBombe(BombeService bs) {
		this.bs = bs;
	}
	
	@After
	public void afterTest() {
		this.bs = null;
	}
	
	@Before
	public abstract void beforeTest();
	
	@Test
	public void testPreInit1() {
		try {
			getBombe().init(1, 3, 5, 6);
		} catch (Exception e) {
			System.err.println("message d'erreur relevé !!!");
		}
	}
	
	@Test
	public void testPreInit2() {
		try {
			getBombe().init(1, 3, 5, 12);
			System.err.println("message d'erreur non relevé !!!");
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testPreDiminuerCompteARebours1() {
			getBombe().init(1, 3, 5, 6);
		try {
			getBombe().diminuerCompteARebours();
		} catch (Exception e) {
			System.err.println("message d'erreur relevé !!!");
		}
	}
	
	@Test
	public void testPreDiminuerCompteARebours2() {
			getBombe().init(1, 3, 5, 0);
		try {
			getBombe().diminuerCompteARebours();
			System.err.println("message d'erreur non relevé !!!");
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testPostInit() {
		// cond initiale
		
		// operation
		getBombe().init(1, 3, 5, 6);
		
		// oracle
		Assert.assertTrue("mauvais numéro", getBombe().getNumero() == 1);
		Assert.assertTrue("mauvais abscisse", getBombe().getX() == 3);
		Assert.assertTrue("mauvaise ordonnée", getBombe().getY() == 5);
		Assert.assertTrue("mauvaise amplitude", getBombe().getAmplitude() == 6);
		Assert.assertTrue("mauvais compte à rebours", getBombe().getCompteARebours() == 10);
	}
	
	@Test
	public void testPostDiminuerCompteARebours() {
		// cond initiale
		getBombe().init(1, 3, 5, 6);
		
		// operation
		getBombe().diminuerCompteARebours();
		
		// oracle
		Assert.assertTrue("mauvais numéro", getBombe().getNumero() == 1);
		Assert.assertTrue("mauvais abscisse", getBombe().getX() == 3);
		Assert.assertTrue("mauvaise ordonnée", getBombe().getY() == 5);
		Assert.assertTrue("mauvaise amplitude", getBombe().getAmplitude() == 6);
		Assert.assertTrue("compte à rebours non décrémenté", getBombe().getCompteARebours() == 9);
	}
	
	@Test
	public void testInvariant1() {
		// cond initiale
		getBombe().init(1, 3, 5, 6);
		
		// operation
		getBombe().diminuerCompteARebours();
		
		// oracle
		Assert.assertTrue("compteARebours négatif", getBombe().getCompteARebours() >= 0);
		Assert.assertTrue("compteARebours sup à 10", getBombe().getCompteARebours() <= 10);
	}
	
	@Test
	public void testInvariant2_A() {
		// cond initiale
		getBombe().init(1, 3, 5, 6);
		getBombe().diminuerCompteARebours();
		getBombe().diminuerCompteARebours();
		getBombe().diminuerCompteARebours();
		getBombe().diminuerCompteARebours();
		getBombe().diminuerCompteARebours();
		getBombe().diminuerCompteARebours();
		getBombe().diminuerCompteARebours();
		getBombe().diminuerCompteARebours();
		getBombe().diminuerCompteARebours();
		
		// operation
		getBombe().diminuerCompteARebours();
		
		// oracle
		Assert.assertTrue("compteARebours non nul", getBombe().vaExploser() == true);
	}
	
	@Test
	public void testInvariant2_B() {
		// cond initiale
		getBombe().init(1, 3, 5, 6);
		
		// operation
		getBombe().diminuerCompteARebours();
		
		// oracle
		Assert.assertTrue("compteARebours nul", getBombe().vaExploser() == false);
	}
}

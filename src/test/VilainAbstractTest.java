package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import enumerations.TYPE;

import service.VilainService;

public abstract class VilainAbstractTest {

	protected VilainService vs;
	
	protected VilainAbstractTest(){
		this.vs = null;
	}
	
	protected void deplacer(TYPE murNord, TYPE murSud, TYPE murOuest, TYPE murEst){
		
	}
	@After
	public void afterTest() {
		this.vs =null;
	}
	
	@Before
	public abstract void beforeTest();
	
	@Test
	public void testPostInit() {
		try {
			
		} catch (Exception e) {
			System.err.println("Message d'erreur relevé");
		}
		
	}
}

package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import enumerations.TRESOR;
import enumerations.TYPE;

import service.TerrainService;

public abstract class TerrainAbstractTest {

	protected TerrainService ts;
	
	protected TerrainAbstractTest() {
		this.ts = null;
	}
	
	protected TerrainService getTerrain() {
		return this.ts;
	}
	
	protected void setTerrain(TerrainService ts) {
		this.ts = ts;
	}
	
	@After
	public void afterTest() {
		this.ts = null;
	}
	
	@Before
	public abstract void beforeTest();
	
	@Test
	public void testPreInit1() {
		try {
			getTerrain().init(3, 5);
		} catch (Exception e) {
			System.err.println("Message d'erreur relevé");
		}
	}
	
	@Test
	public void testPreInit2() {
		try {
			getTerrain().init(-2, 5);
			System.err.println("pas de message d'erreur !!!");
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testGetBloc1() {
		// cond initiale
		getTerrain().init(3, 5);
		//operation
		try {
			getTerrain().getBloc(2, 2);
		} catch (Exception e) {
			System.err.println("Message d'erreur relevé");
		}
	}
	
	@Test
	public void testGetBloc2() {
		// cond initiale
		getTerrain().init(3, 5);
		//operation
		try {
			getTerrain().getBloc(4, 5);
			System.err.println("pas de message d'erreur");
		} catch (Exception e) {
		}
	}
	
	@Test
	public void testPostInit() {
		// cond initiale
		
		//operation
		getTerrain().init(3, 5);
		//oracle
		Assert.assertTrue(getTerrain().getNombreColonnes() == 3);
		Assert.assertTrue(getTerrain().getNombreLignes() == 5);
		Assert.assertTrue(getTerrain().getBloc(3, 5) != null);
		Assert.assertTrue(getTerrain().getBloc(3, 5).getType() == TYPE.VIDE);
		Assert.assertTrue(getTerrain().getBloc(3, 5).getTresor() == TRESOR.RIEN);
	}
}

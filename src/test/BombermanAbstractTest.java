package test;

import static org.junit.Assert.*;

import org.junit.Test;

import enumerations.SANTE;
import service.BombermanService;

public abstract class BombermanAbstractTest {

	protected BombermanService bs;
	
	protected BombermanAbstractTest(){
		this.bs = null;
	}

	protected void setBomberman(BombermanService bs) {
		this.bs = bs;
	}
	
	protected BombermanService getBomberman() {
		return this.bs;
	}
	
	
	@Test
	protected void testPostInit(){
		//condition initiale
		
		//opérations
		getBomberman().init(1, 1);
		
		//oracle
		assertTrue(getBomberman().getX() == 1);
		assertTrue(getBomberman().getY() == 1);
		assertTrue(getBomberman().getSante() == SANTE.VIVANT);
		assertTrue(getBomberman().getForceVitale() == 3);
		assertTrue(getBomberman().getNbrBombe() == 1);
		assertTrue(getBomberman().getNbrBombeMax() == 1);
		assertTrue(!getBomberman().canOverPassWall());
		assertTrue(!getBomberman().canOverPassBomb());
		assertTrue(!getBomberman().isInvicible());
	}
}


package decorator;

import enumerations.SANTE;
import enumerations.TRESOR;
import service.BombermanService;

public class BombermanDecorator implements BombermanService {

	protected BombermanService delegates;
	
	protected BombermanService getDelegates(){
		return this.delegates;
	}
	
	protected void setDelegates(BombermanService service){
		this.delegates = service;
	}
	
	public int getX() {
		return this.delegates.getX();
	}

	public int getY() {
		return this.delegates.getY();
	}

	public SANTE getSante() {
		return this.delegates.getSante();
	}

	public int getForceVitale() {
		return this.delegates.getForceVitale();
	}

	public int getNbrBombe() {
		return this.delegates.getNbrBombe();
	}

	public int getNbrBombeMax() {
		return this.delegates.getNbrBombeMax();
	}

	public boolean canOverPassWall() {
		return this.delegates.canOverPassWall();
	}

	public boolean canOverPassBomb() {
		return this.delegates.canOverPassBomb();
	}

	public boolean isInvicible() {
		return this.delegates.isInvicible();
	}

	public void init(int x, int y) {
		
	}

	public void monter() {
		
	}

	public void descendre() {
		
	}

	public void gauche() {
		
	}

	public void droite() {
		
	}

	public void addPowerUp(TRESOR powerUp) {

	}

	public void meurt() {
		
	}

	public void bombeCreee(int num) {
		
	}

	public void bombeExplosee(int num) {
		
	}

}

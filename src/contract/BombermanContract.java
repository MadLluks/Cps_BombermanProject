package contract;

import decorator.BombermanDecorator;
import enumerations.SANTE;
import enumerations.TRESOR;
import service.BombermanService;

public class BombermanContract extends BombermanDecorator {

	public BombermanContract(BombermanService bs){
		super.setDelegates(bs);
	}

	public void checkInvariants(){
		if(!(super.getForceVitale() >= 3)){
			try{
				throw new Exception("ForceVitale trop faible");
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		if(!(super.getForceVitale() <= 11)){
			try {
				throw new Exception("ForceVitale trop élevée");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getX() <= 1)){
			try {
				throw new Exception("X négatif");
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		if(!(super.getY() <= 1)){
			try {
				throw new Exception("Y négatif");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void init(int x, int y){
		//pre-condition
		if(!(x > 0)){
			try{
				throw new Exception("x doit être positif");
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		if(!(y > 0)) {
			try {
				throw new Exception("y doit être positif");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		//pre-check invariants
		checkInvariants();

		//opérations
		super.init(x, y);

		//post-check invariants
		checkInvariants();

		//post-conditions
		if(!(super.getX() == x)){
			try {
				throw new Exception("Coordonnée x incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if(!(super.getY() == y)){
			try {
				throw new Exception("Coordonnée y incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getSante() == SANTE.VIVANT)){
			try {
				throw new Exception("Le hero n'est pas vivant");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if(!(super.getForceVitale() == 3)){
			try {
				throw new Exception("ForceVitale incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if(!(super.getNbrBombe() == 1)){
			try {
				throw new Exception("Nombre de bombe incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if(!(super.getNbrBombeMax() == 1)){
			try {
				throw new Exception("Nombre de bombe max incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassWall())){
			try {
				throw new Exception("Le hero peux passer à travers les murs !!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassBomb())){
			try {
				throw new Exception("Le hero peut passer à travers les bombes !!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.isInvicible())){
			try {
				throw new Exception("Le hero est invincible");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void monter(){
		//pre-conditions
		if(!(super.getSante() == SANTE.VIVANT)){
			try {
				throw new Exception("Le hero n'est pas vivant");
			} catch (Exception e){
				e.printStackTrace();
			}
		}

		//pre-check invariants
		checkInvariants();

		int x_atPre = super.getX();
		int y_atPre = super.getY();
		SANTE sante_atPre = super.getSante();
		int forcevitale_atPre = super.getForceVitale();
		int nbrBombe_atPre = super.getNbrBombe();
		int nbrBombeMax_atPre = super.getNbrBombeMax();
		boolean passWall_atPre = super.canOverPassWall();
		boolean passBombe_atPre = super.canOverPassBomb();
		boolean invincible_atPre = super.isInvicible();
		//opérations
		super.monter();

		//post-check invariants
		checkInvariants();

		//post-conditions
		if(!(super.getX() == x_atPre)) {
			try {
				throw new Exception("X incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getY() == y_atPre + 1)) {
			try {
				throw new Exception("Y non incrémenté");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getSante() == sante_atPre)) {
			try {
				throw new Exception("Sante incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getForceVitale() == forcevitale_atPre)) {
			try {
				throw new Exception("ForceVitale incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getNbrBombe() == nbrBombe_atPre)) {
			try {
				throw new Exception("Le nombre de bombe du hero est incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getNbrBombeMax() == nbrBombeMax_atPre)) {
			try {
				throw new Exception("Le nombre de bombe max est incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassWall() == passWall_atPre)) {
			try {
				throw new Exception("Le hero peut passer à travers les murs");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassBomb() == passBombe_atPre)) {
			try {
				throw new Exception("Le hero peut passer à traver les bombes");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.isInvicible() == invincible_atPre)) {
			try {
				throw new Exception("Le hero est invincible");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void descendre(){
		//pre-conditions
		if(!(super.getSante() == SANTE.VIVANT)){
			try {
				throw new Exception("Le hero n'est pas vivant");
			} catch (Exception e){
				e.printStackTrace();
			}
		}

		//pre-check invariants
		checkInvariants();

		int x_atPre = super.getX();
		int y_atPre = super.getY();
		SANTE sante_atPre = super.getSante();
		int forcevitale_atPre = super.getForceVitale();
		int nbrBombe_atPre = super.getNbrBombe();
		int nbrBombeMax_atPre = super.getNbrBombeMax();
		boolean passWall_atPre = super.canOverPassWall();
		boolean passBombe_atPre = super.canOverPassBomb();
		boolean invincible_atPre = super.isInvicible();
		//opérations
		super.descendre();

		//post-check invariants
		checkInvariants();

		//post-conditions
		if(!(super.getX() == x_atPre)) {
			try {
				throw new Exception("X incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getY() == y_atPre - 1)) {
			try {
				throw new Exception("Y non décrémenté");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getSante() == sante_atPre)) {
			try {
				throw new Exception("Sante incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getForceVitale() == forcevitale_atPre)) {
			try {
				throw new Exception("ForceVitale incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getNbrBombe() == nbrBombe_atPre)) {
			try {
				throw new Exception("Le nombre de bombe du hero est incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getNbrBombeMax() == nbrBombeMax_atPre)) {
			try {
				throw new Exception("Le nombre de bombe max est incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassWall() == passWall_atPre)) {
			try {
				throw new Exception("Le hero peut passer à travers les murs");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassBomb() == passBombe_atPre)) {
			try {
				throw new Exception("Le hero peut passer à traver les bombes");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.isInvicible() == invincible_atPre)) {
			try {
				throw new Exception("Le hero est invincible");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void gauche(){
		//pre-conditions
		if(!(super.getSante() == SANTE.VIVANT)){
			try {
				throw new Exception("Le hero n'est pas vivant");
			} catch (Exception e){
				e.printStackTrace();
			}
		}

		//pre-check invariants
		checkInvariants();

		int x_atPre = super.getX();
		int y_atPre = super.getY();
		SANTE sante_atPre = super.getSante();
		int forcevitale_atPre = super.getForceVitale();
		int nbrBombe_atPre = super.getNbrBombe();
		int nbrBombeMax_atPre = super.getNbrBombeMax();
		boolean passWall_atPre = super.canOverPassWall();
		boolean passBombe_atPre = super.canOverPassBomb();
		boolean invincible_atPre = super.isInvicible();
		//opérations
		super.gauche();

		//post-check invariants
		checkInvariants();

		//post-conditions
		if(!(super.getX() == x_atPre - 1)) {
			try {
				throw new Exception("X non décrémenté");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getY() == y_atPre)) {
			try {
				throw new Exception("Y incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getSante() == sante_atPre)) {
			try {
				throw new Exception("Sante incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getForceVitale() == forcevitale_atPre)) {
			try {
				throw new Exception("ForceVitale incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getNbrBombe() == nbrBombe_atPre)) {
			try {
				throw new Exception("Le nombre de bombe du hero est incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getNbrBombeMax() == nbrBombeMax_atPre)) {
			try {
				throw new Exception("Le nombre de bombe max est incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassWall() == passWall_atPre)) {
			try {
				throw new Exception("Le hero peut passer à travers les murs");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassBomb() == passBombe_atPre)) {
			try {
				throw new Exception("Le hero peut passer à traver les bombes");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.isInvicible() == invincible_atPre)) {
			try {
				throw new Exception("Le hero est invincible");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void droite(){
		//pre-conditions
		if(!(super.getSante() == SANTE.VIVANT)){
			try {
				throw new Exception("Le hero n'est pas vivant");
			} catch (Exception e){
				e.printStackTrace();
			}
		}

		//pre-check invariants
		checkInvariants();

		int x_atPre = super.getX();
		int y_atPre = super.getY();
		SANTE sante_atPre = super.getSante();
		int forcevitale_atPre = super.getForceVitale();
		int nbrBombe_atPre = super.getNbrBombe();
		int nbrBombeMax_atPre = super.getNbrBombeMax();
		boolean passWall_atPre = super.canOverPassWall();
		boolean passBombe_atPre = super.canOverPassBomb();
		boolean invincible_atPre = super.isInvicible();
		//opérations
		super.droite();

		//post-check invariants
		checkInvariants();

		//post-conditions
		if(!(super.getX() == x_atPre + 1)) {
			try {
				throw new Exception("X non incrémenté");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getY() == y_atPre)) {
			try {
				throw new Exception("Y incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getSante() == sante_atPre)) {
			try {
				throw new Exception("Sante incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getForceVitale() == forcevitale_atPre)) {
			try {
				throw new Exception("ForceVitale incorrecte");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getNbrBombe() == nbrBombe_atPre)) {
			try {
				throw new Exception("Le nombre de bombe du hero est incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.getNbrBombeMax() == nbrBombeMax_atPre)) {
			try {
				throw new Exception("Le nombre de bombe max est incorrect");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassWall() == passWall_atPre)) {
			try {
				throw new Exception("Le hero peut passer à travers les murs");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.canOverPassBomb() == passBombe_atPre)) {
			try {
				throw new Exception("Le hero peut passer à traver les bombes");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!(super.isInvicible() == invincible_atPre)) {
			try {
				throw new Exception("Le hero est invincible");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void addPowerUp(TRESOR powerup){
		//non testable
	}

	public void meurt() {
		//pre-condition
		if(!(super.getSante() == SANTE.VIVANT)){
			try {
				throw new Exception("Le hero n'est pas vivant !!!");
			} catch (Exception e){ 
				e.printStackTrace();
			}
		}
		
		//pre-check invariant
		checkInvariants();
		
		//opérations
		super.init(1, 1);
		super.meurt();
		
		//post-check invariant
		checkInvariants();
		
		//post-conditions
		if(!(super.getSante() == SANTE.MORT)){
			try {
				throw new Exception("Le hero n'est pas mort !");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void bombeCreee (int num) {
		//non testable
	}

	public void bombeExplosee(int num) {
		//non testable
	}
}

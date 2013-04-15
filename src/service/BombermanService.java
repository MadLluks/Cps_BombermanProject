package service;

import enumerations.SANTE;
import enumerations.TRESOR;

public interface BombermanService {

	// [Observateurs]
	public int getX();
	public int getY();
	public SANTE getSante();
	public int getForceVitale(); // Fire-Up

	public int getNbrBombe();
	public int getNbrBombeMax(); // Bomb-Up
	public boolean canOverPassWall(); // Wall-Pass
	public boolean canOverPassBomb(); // Bomb-Pass
	public boolean isInvicible(); // FireSuit


	// [invariants]
	// 3 <= getForceVitale() <= 11
	// 1 <= getX()
	// 1 <= getY()

	// [init]
	// \pre x > 0
	// \pre y > 0
	// \post getX() = x
	// \post getY() = y
	// \post getSante() = SANTE.VIVANT
	// \post getForceVitale() = 3
	// \post getNbrBombe() = 1
	// \post getNbrBombeMax() = 1
	// \post canOverPassWall() = false
	// \post canOverPassBomb() = false
	// \post isInvicible() = false
	public void init(int x, int y);	

	// [operateurs]

	// \pre getSante() = SANTE.VIVANT
	// \post getX() = getX()@pre
	// \post getY() = getY()@pre + 1
	// \post getSante() = getSante()@pre
	// \post getForceVitale() = getForceVitale()@pre
	// \post getNbrBombe() = getNbrBombe()@pre
	// \post getNbrBombeMax() = getNbrBombeMax()@pre
	// \post canOverPassWall() = canOverPassWall()@pre
	// \post canOverPassBomb() = canOverPassBomb()@pre
	// \post isInvicible() = isInvicible()@pre
	public void monter();

	// [operateurs]

	// \pre getSante() = SANTE.VIVANT
	// \post getX() = getX()@pre
	// \post getY() = getY()@pre - 1
	// \post getSante() = getSante()@pre
	// \post getForceVitale() = getForceVitale()@pre
	// \post getNbrBombe() = getNbrBombe()@pre
	// \post getNbrBombeMax() = getNbrBombeMax()@pre
	// \post canOverPassWall() = canOverPassWall()@pre
	// \post canOverPassBomb() = canOverPassBomb()@pre
	// \post isInvicible() = isInvicible()@pre
	public void descendre();

	// [operateurs]

	// \pre getSante() = SANTE.VIVANT
	// \post getX() = getX()@pre - 1
	// \post getY() = getY()@pre
	// \post getSante() = getSante()@pre
	// \post getForceVitale() = getForceVitale()@pre
	// \post getNbrBombe() = getNbrBombe()@pre
	// \post getNbrBombeMax() = getNbrBombeMax()@pre
	// \post canOverPassWall() = canOverPassWall()@pre
	// \post canOverPassBomb() = canOverPassBomb()@pre
	// \post isInvicible() = isInvicible()@pre
	public void gauche();

	// [operateurs]

	// \pre getSante() = SANTE.VIVANT
	// \post getX() = getX()@pre + 1
	// \post getY() = getY()@pre
	// \post getSante() = getSante()@pre
	// \post getForceVitale() = getForceVitale()@pre
	// \post getNbrBombe() = getNbrBombe()@pre
	// \post getNbrBombeMax() = getNbrBombeMax()@pre
	// \post canOverPassWall() = canOverPassWall()@pre
	// \post canOverPassBomb() = canOverPassBomb()@pre
	// \post isInvicible() = isInvicible()@pre
	public void droite();

	// Traite les Power-Up rencontrés
	public void addPowerUp(TRESOR powerUp);

	// \pre getSante() = SANTE.VIVANT
	// \post getSante() = SANTE.MORT
	public void meurt();

	// le bomberman vient de créer une bombe avec un numéro
	public void bombeCreee(int num);

	// la bombe numéro num vient d'exploser. S'il la contient, il la retire de se liste
	public void bombeExplosee(int num);
}

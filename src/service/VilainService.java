package service;

import enumerations.TYPE;
import enumerations.TYPE_VILAIN;

public interface VilainService {

	// const
	public TYPE_VILAIN getType();
	public int getX();
	public int getY();
	
	// invariants
	
	// \post getType() = type
	// \post getX() = x
	// \post getY() = y
	public void init(TYPE_VILAIN type, int x, int y);
	
	// déplace aléatoirement le vilain en fonction des murs qui l'entourent
	// \pre Il existe m app {murNord, murSud, murOuest, murEst} tq m = VIDE
	// \post if getX() = getX()@pre then getY() = getY()@pre +/- 1
	// \post if getY() = getY()@pre then getX() = getX()@pre +/- 1
	public void deplacer(TYPE murNord, TYPE murSud, TYPE murOuest, TYPE murEst);
}

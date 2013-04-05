package service;

public interface VilainService {

	// const
	TYPE_VILAIN getType();
	int getX();
	int getY();
	
	// invariants
	
	// \post getType() = type
	// \post getX() = x
	// \post getY() = y
	void init(TYPE_VILAIN type, int x, int y);
	
	// d�place al�atoirement le vilain en fonction des murs qui l'entourent
	// \pre Il existe m app {murNord, murSud, murOuest, murEst} tq m = VIDE
	// \post if getX() = getX()@pre then getY() = getY()@pre +/- 1
	// \post if getY() = getY()@pre then getX() = getX()@pre +/- 1
	void deplacer(TYPE murNord, TYPE murSud, TYPE murOuest, TYPE murEst);
}

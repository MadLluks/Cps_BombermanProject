package service;

import enumerations.COMMANDE;

public interface MoteurJeuService {

	// [Observateurs]
	// const
	int getMaxPasJeu();	
	int getPasJeuCourant();

	// [invariants]
	// 0 <= getPasjeuCourrant(M) <= getMaxPasJeu(M)
	
	// [init]
	// \pre init(m) require m>=0
	// \post getMaxPasJeu(init(m)) = m
	// \post getPasJeuCourrant(init(m)) = 0
	void init(int m);

	// [operateurs]
	
	// \pre pasJeu(M, cmd) require getPasJeuCourant(M) <= getMaxPasJeu(M)
	// \post getPasjeuCourrant(pasJeu(M, cmd)) = getPasjeuCourrant(M)+1
	void pasJeu(COMMANDE cmd);
}

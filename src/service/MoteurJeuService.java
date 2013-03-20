package service;

public interface MoteurJeuService {
	
	enum Commande {RIEN, HAUT, GAUCHE, DROITE, BAS, BOMBE};
	
	// const
	int getMaxPasJeu();	
	int getPasJeuCourant();

	// [invariants]
	// 0 <= getPasjeuCourrant(M) <= getMaxPasJeu(M)
	
	// \pre init(m) require m>=0
	// \post getMaxPasJeu(init(m)) = m
	// \post getPasJeuCourrant(init(m)) = 0;
	void init(int m);
	
	// \pre pasJeu(M, cmd) require getPasJeuCourant(M) <= getMaxPasJeu(M)
	// \post getPasjeuCourrant(pasJeu(M, cmd)) = getPasjeuCourrant(M)+1
	void pasJeu(Commande cmd);
}

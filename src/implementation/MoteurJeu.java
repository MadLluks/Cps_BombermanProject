package implementation;

import enumerations.COMMANDE;
import service.MoteurJeuService;

public class MoteurJeu implements MoteurJeuService {
	private int maxPasJeu;
	private int pasJeuCourant;
	
	public MoteurJeu() {
	}

	@Override
	public int getMaxPasJeu() {
		return this.maxPasJeu;
	}

	@Override
	public int getPasJeuCourant() {
		return this.pasJeuCourant;
	}

	@Override
	public void init(int m) {
		this.maxPasJeu = m;
		this.pasJeuCourant = 0;
	}

	@Override
	public void pasJeu(COMMANDE cmd) {
		this.pasJeuCourant++;
	}
}

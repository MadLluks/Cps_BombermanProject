package implementation;

import service.MoteurJeuService;

public class MoteurJeuBugs implements MoteurJeuService {
	private int maxPasJeu;
	private int pasJeuCourant;
	
	public MoteurJeuBugs() {
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
	public void pasJeu(Commande cmd) {
		// TODO Auto-generated method stub
		
	}
}

package decorator;

import enumerations.COMMANDE;
import service.MoteurJeuService;

public class MoteurJeuDecorator implements MoteurJeuService {
	
	protected MoteurJeuService delegates;
	
	protected MoteurJeuService getDelegates() {
		return this.delegates;
	}
	
	protected void setDelegates(MoteurJeuService mjs) {
		this.delegates = mjs;
	}

	@Override
	public int getMaxPasJeu() {
		return this.getDelegates().getMaxPasJeu();
	}

	@Override
	public int getPasJeuCourant() {
		return this.getDelegates().getPasJeuCourant();
	}

	@Override
	public void init(int m) {
		this.getDelegates().init(m);
	}

	@Override
	public void pasJeu(COMMANDE cmd) {
		this.getDelegates().pasJeu(cmd);
	}

}

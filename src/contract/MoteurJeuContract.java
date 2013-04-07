package contract;

import service.MoteurJeuService;
import decorator.MoteurJeuDecorator;
import enumerations.COMMANDE;

public class MoteurJeuContract extends MoteurJeuDecorator {
	
	public MoteurJeuContract(MoteurJeuService mjs) {
		super.setDelegates(mjs);
	}

	public void checkInvariants() {
		// 0 <= getPasjeuCourrant(M) <= getMaxPasJeu(M)
		if (!(getDelegates().getPasJeuCourant() >= 0)) {
			try {
				throw new Exception("pasJeuCourrant négatif");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getDelegates().getPasJeuCourant() <= getDelegates().getMaxPasJeu())) {
			try {
				throw new Exception("pasJeuCourrant supérieur à  maxPasJeu");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Override
	public int getMaxPasJeu() {
		return super.getMaxPasJeu();
	}

	@Override
	public int getPasJeuCourant() {
		return super.getPasJeuCourant();
	}

	@Override
	public void init(int m) {
		// pre cond
		if (!(m>=0)) {
			try {
				throw new Exception("m doit être positif");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//pre check
		checkInvariants();
		//ope
		super.init(m);
		//post check
		checkInvariants();
		//post cond
		// \post getMaxPasJeu(init(m)) = m
		if (!(super.getMaxPasJeu() == m)) {
			try {
				throw new Exception("erreur affectation maxPasJeu");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// \post getPasJeuCourrant(init(m)) = 0;
		if (!(super.getPasJeuCourant() == 0)) {
			try {
				throw new Exception("pasJeuCourrant non initialisé à  0");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void pasJeu(COMMANDE cmd) {
		// pre cond
		// \pre pasJeu(M, cmd) require getPasJeuCourant(M) <= getMaxPasJeu(M)
		if (!(super.getPasJeuCourant() <= super.getMaxPasJeu())) {
			try {
				throw new Exception("tour supplémentaire interdit");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//pre check
		checkInvariants();
		
		int pasJeuCourrant_atPre = super.getPasJeuCourant();
		//ope
		super.pasJeu(cmd);
		//post check
		checkInvariants();
		//post cond
		// \post getPasjeuCourrant(pasJeu(M, cmd)) = getPasjeuCourrant(M)+1
		if (!(super.getPasJeuCourant() == pasJeuCourrant_atPre +1)) {
			try {
				throw new Exception("pasJeuCourrant non incrémenté de 1");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

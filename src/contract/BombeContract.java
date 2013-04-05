package contract;

import decorator.BombeDecorator;
import service.BombeService;

public class BombeContract extends BombeDecorator {

	public BombeContract(BombeService bs) {
		super.setDelegate(bs);
	}
	
	public void checkInvariants() {
		if (!(getCompteARebours() >= 0)) {
			try {
				throw new Exception("compteARebours négatif");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getCompteARebours() <= 10)) {
			try {
				throw new Exception("compteARebours > 10");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(vaExploser() == (getCompteARebours() == 0))) {
			try {
				throw new Exception("wrong definition of vaExploser");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public int getNumero() {
		return super.getNumero();
	}

	@Override
	public int getX() {
		return super.getX();
	}

	@Override
	public int getY() {
		return super.getY();
	}

	@Override
	public int getAmplitude() {
		return super.getAmplitude();
	}

	@Override
	public int getCompteARebours() {
		return super.getCompteARebours();
	}

	@Override
	public boolean vaExploser() {
		return super.vaExploser();
	}

	@Override
	public void init(int num, int x, int y, int amplitude) {
		// pre cond
		if (!(amplitude >= 3)) {
			try {
				throw new Exception("amplitude < 3");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(amplitude <= 10)) {
			try {
				throw new Exception("amplitude > 10");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//ope
		super.init(num, x, y, amplitude);
		
		//post inv
		checkInvariants();
		
		//post cond
		if (!(getNumero() == num)) {
			try {
				throw new Exception("wrong number assigned");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getX() == x)) {
			try {
				throw new Exception("wrong abscisse assigned");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getY() == y)) {
			try {
				throw new Exception("wrong ordonnée assigned");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getAmplitude() == amplitude)) {
			try {
				throw new Exception("wrong amplitude assigned");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getCompteARebours() == 10)) {
			try {
				throw new Exception("wrong initialization of compteARebours");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void diminuerCompteARebours() {
		// pre cond
		if (!(getCompteARebours() != 0)) {
			try {
				throw new Exception("impossible de diminuer, au min !!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// pre inv
		checkInvariants();
		
		// capture
		int num_atPre = getNumero();
		int x_atPre = getX();
		int y_atPre = getY();
		int amplitude_atPre = getAmplitude();
		int compteARebours_atPre = getCompteARebours();
		
		// ope
		getDelegates().diminuerCompteARebours();
		
		// pre inv
		checkInvariants();
		
		// post cond
		if (!(getNumero() == num_atPre)) {
			try {
				throw new Exception("num change");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getX() == x_atPre)) {
			try {
				throw new Exception("abscisse change");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getY() == y_atPre)) {
			try {
				throw new Exception("ordonnée change");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getAmplitude() == amplitude_atPre)) {
			try {
				throw new Exception("amplitude change");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(getCompteARebours() == compteARebours_atPre - 1)) {
			try {
				throw new Exception("wrong new compteARebours");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

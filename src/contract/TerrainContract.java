package contract;

import service.BlocService;
import service.TerrainService;
import decorator.TerrainDecorator;
import enumerations.TRESOR;
import enumerations.TYPE;

public class TerrainContract extends TerrainDecorator {
	
	public TerrainContract(TerrainService ts) {
		super.setDelegates(ts);
	}
	
	public void checkInvariants() {
	}
	
	@Override
	public int getNombreColonnes() {
		return super.getNombreColonnes();
	}

	@Override
	public int getNombreLignes() {
		return super.getNombreLignes();
	}

	@Override
	public BlocService getBloc(int x, int y) {
		// Pre cond
		if (!(x >= 1)) {
			try {
				throw new Exception("x doit être supérieur à 1");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(x <= getNombreColonnes())) {
			try {
				throw new Exception("x doit être inférieur ou égal au nombre de colonnes");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(y >= 1)) {
			try {
				throw new Exception("y doit être supérieur à 1");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (!(y <= getNombreLignes())) {
			try {
				throw new Exception("y doit être inférieur ou égal au nombre de lignes");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Pre inv
		// capture
		// ope
		BlocService bloc = super.getBloc(x, y);
		// Post inv
		// Post cond
		
		return bloc;
	}

	@Override
	public void init(int x, int y) {
		// Pre cond
		// \pre x >= 1
		if (!(x >= 1)) {
			try {
				throw new Exception("x doit être supérieur à 1");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// \pre y >= 1
		if (!(y >= 1)) {
			try {
				throw new Exception("y doit être supérieur à 1");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Pre inv
		// capture
		// ope
		super.init(x, y);
		// Post inv
		
		// Post cond
		// \post getNombreColonne() = x
		if (!(x == getNombreColonnes())) {
			try {
				throw new Exception("le nombre de colonnes doit être égal à x");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// \post getNombreLigne() = y
		if (!(y == getNombreLignes())) {
			try {
				throw new Exception("le nombre de lignes doit être égal à y");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// \post getBloc(x, y) != NULL
		if (!(super.getBloc(x, y) != null)) {
			try {
				throw new Exception("Pas de bloc à la limite du terrain");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// \post Bloc:getType(getBloc(x, y)) = TYPE.VIDE
		if (!(super.getBloc(x, y).getType() == TYPE.VIDE)) {
			try {
				throw new Exception("le dernier bloc n'est pas de type vide");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// \post Bloc:getTresor(getBloc(x, y)) = TRESOR.RIEN
		if (!(super.getBloc(x, y).getTresor() == TRESOR.RIEN)) {
			try {
				throw new Exception("le dernier bloc contient un trésor");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

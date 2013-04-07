package service;

public interface TerrainService {

	// [Observateurs]
	// const
	public int getNombreColonnes();
	// const
	public int getNombreLignes();
	// \pre 1 <= x <= getNombreColonnes()
	// \pre 1 <= y <= getNombreLignes()
	public BlocService getBloc(int x, int y);
	
	// [invariants]
	
	// [init]
	// \pre x >= 1
	// \pre y >= 1
	// \post getNombreColonne() = x
	// \post getNombreLigne() = y
	// \post getBloc(x, y) != NULL
	// \post Bloc:getType(getBloc(x, y)) = TYPE.VIDE
	// \post Bloc:getTresor(getBloc(x, y)) = TRESOR.RIEN
	public void init(int x, int y);

	// [operateurs]
	
}

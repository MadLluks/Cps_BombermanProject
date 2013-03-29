package implementation;

import service.BlocService;
import service.TRESOR;
import service.TYPE;
import service.TerrainService;

public class Terrain implements TerrainService {

	private int nombreColonnes;
	private int nombreLignes;
	private BlocService[][] terrain;
	
	@Override
	public int getNombreColonnes() {
		return this.nombreColonnes;
	}

	@Override
	public int getNombreLignes() {
		return this.nombreLignes;
	}

	@Override
	public BlocService getBloc(int x, int y) {
		return this.terrain[x-1][y-1];
	}

	@Override
	public void init(int x, int y) {
		this.nombreColonnes = x;
		this.nombreLignes = y;
		this.terrain = new BlocService[x][y];
		for (int i = 0; i<x; i++) {
			for (int j = 0; j<y; j++) {
				BlocService bs = new Bloc();
				bs.init(TYPE.VIDE, TRESOR.RIEN);
				this.terrain[i][j] = bs;
			}
		}
	}

}

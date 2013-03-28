package decorator;

import service.BlocService;
import service.TerrainService;

public class TerrainDecorator implements TerrainService {

	/* DP */
	protected TerrainService delegates;

	protected TerrainService getDelegates() {
		return this.delegates;
	}
	
	protected void setDelegates(TerrainService ts) {
		this.delegates = ts;
	}
	/* Fin DP */
	
	@Override
	public int getNombreColonnes() {
		return this.getDelegates().getNombreColonnes();
	}

	@Override
	public int getNombreLignes() {
		return this.getDelegates().getNombreLignes();
	}

	@Override
	public BlocService getBloc(int x, int y) {
		return this.getDelegates().getBloc(x, y);
	}

	@Override
	public void init(int x, int y) {
		this.getDelegates().init(x, y);
	}

}

package implementation;

import service.BlocService;
import service.TRESOR;
import service.TYPE;

public class BlocBugs implements BlocService {

	private TYPE type;
	private TRESOR tresor;
	
	@Override
	public TYPE getType() {
		return this.type;
	}

	@Override
	public TRESOR getTresor() {
		return this.tresor;
	}

	@Override
	public void init(TYPE type, TRESOR tresor) {
		this.type = TYPE.VIDE;
		this.tresor = TRESOR.BOMB_KICK;
	}

}

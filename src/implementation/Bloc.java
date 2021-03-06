package implementation;

import enumerations.TRESOR;
import enumerations.TYPE;
import service.BlocService;

public class Bloc implements BlocService {

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
		this.type = type;
		this.tresor = tresor;
	}

}

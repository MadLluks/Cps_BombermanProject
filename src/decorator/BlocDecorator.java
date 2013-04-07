package decorator;

import enumerations.TRESOR;
import enumerations.TYPE;
import service.BlocService;

public class BlocDecorator implements BlocService{
	
	protected BlocService delegates;
	
	protected BlocService getDelegates() {
		return this.delegates;
	}
	
	protected void setDelegate(BlocService service){
		this.delegates = service;
	}
	
	/*public int getX() {
		return this.delegates.getX();
	}

	public int getY() {
		return this.delegates.getY();
	}*/

	public TYPE getType() {
		return this.delegates.getType();
	}

	public TRESOR getTresor() {
		return this.delegates.getTresor();
	}

	public void init(/*int x, int y, */TYPE type, TRESOR tresor) {
		this.delegates.init(/*x, y, */type, tresor);
	}

}

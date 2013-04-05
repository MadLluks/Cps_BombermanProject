package decorator;

import service.BombeService;

public class BombeDecorator implements BombeService {

	protected BombeService delegates;
	
	protected BombeService getDelegates() {
		return this.delegates;
	}
	
	protected void setDelegate(BombeService service){
		this.delegates = service;
	}
	
	@Override
	public int getNumero() {
		return getDelegates().getNumero();
	}

	@Override
	public int getX() {
		return getDelegates().getX();
	}

	@Override
	public int getY() {
		return getDelegates().getY();
	}

	@Override
	public int getAmplitude() {
		return getDelegates().getAmplitude();
	}

	@Override
	public int getCompteARebours() {
		return getDelegates().getCompteARebours();
	}

	@Override
	public boolean vaExploser() {
		return getDelegates().vaExploser();
	}

	@Override
	public void init(int num, int x, int y, int amplitude) {
		getDelegates().init(num, x, y, amplitude);
	}

	@Override
	public void diminuerCompteARebours() {
		getDelegates().diminuerCompteARebours();
	}

}

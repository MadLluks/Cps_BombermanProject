package implementation;

import service.BombeService;

public class Bombe implements BombeService {
	
	private int numero;
	private int x;
	private int y;
	private int amplitude;
	private int compteARebours;

	@Override
	public int getNumero() {
		return this.numero;
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getY() {
		return this.y;
	}

	@Override
	public int getAmplitude() {
		return this.amplitude;
	}

	@Override
	public int getCompteARebours() {
		return this.compteARebours;
	}

	@Override
	public boolean vaExploser() {
		return (this.compteARebours == 0);
	}

	@Override
	public void init(int num, int x, int y, int amplitude) {
		this.numero = num;
		this.x = x;
		this.y = y;
		this.amplitude = amplitude;
		this.compteARebours = 10;
	}

	@Override
	public void diminuerCompteARebours() {
		this.compteARebours--;
	}
}

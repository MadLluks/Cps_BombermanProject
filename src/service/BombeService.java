package service;

public interface BombeService {

	// [Observateurs]
	// const
	int getNumero();
	// const
	int getX();
	// const
	int getY();
	// const
	int getAmplitude();
	int getCompteARebours();
	boolean vaExploser();
	
	// [invariants]
	// 0 <= getCompteARebours(B) <= 10
	// vaExploser(B) = (getCompteARebours(B) = 0)
	
	// [init]
	// \pre 3 <= amplitude <= 11
	// \post getNumero() = num
	// \post getX() = x
	// \post getY() = y
	// \post getAmplitude() = amplitude
	// \post getCompteARebours() = 10
	void init(int num, int x, int y, int amplitude);

	// [operateurs]
	
	// \pre getCompteARebours() != 0 
	// \post getNumero() = getNumero()@pre
	// \post getX() = getX()@pre
	// \post getY() = getY()@pre
	// \post getAmplitude() = getAmplitude()@pre
	// \post getCompteARebours() = getCompteARebours()@pre - 1
	void diminuerCompteARebours();
}

package service;

public interface BlocService {

	// [const]
	//int getX();
	//int getY();
	TYPE getType();
	TRESOR getTresor();

	// [invariants]
	// getX(B) >= 0
	// getY(B) >= 0
	
	// \pre init(m)
	//		require x >= 0, y >= 0
	// \post getX(init(x, y, type, tresor)) = x
	// \post getY(init(x, y, type, tresor)) = y
	// \post getType(init(x, y, type, tresor)) = type
	// \post getTresor(init(x, y, type, tresor)) = tresor
	void init(/*int x, int y, */TYPE type, TRESOR tresor);
	
}

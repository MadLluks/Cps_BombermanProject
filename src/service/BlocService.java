package service;

public interface BlocService {

	// [const]
	TYPE getType();
	TRESOR getTresor();
	
	// [invariants]
	
	// \pre init(m)
	// \post getType() = type
	// \post getTresor() = tresor
	void init(TYPE type, TRESOR tresor);
	
}

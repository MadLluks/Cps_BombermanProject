package service;

import enumerations.TRESOR;
import enumerations.TYPE;

public interface BlocService {

	// [Observateurs]
	// const
	TYPE getType();
	TRESOR getTresor();
	
	// [invariants]
	
	// [init]
	// \pre init(m)
	// \post getType() = type
	// \post getTresor() = tresor
	void init(TYPE type, TRESOR tresor);

	// [operateurs]
	
}

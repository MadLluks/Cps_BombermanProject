package contract;

import service.BlocService;
import service.TRESOR;
import service.TYPE;
import decorator.BlocDecorator;

public class BlocContract extends BlocDecorator {

	public BlocContract(BlocService service) {
		super.setDelegate(service);
	}
	
	public void checkInvariants() {
		// getX(B) >= 0
		if( !(this.getDelegates().getX() >= 0) ) {
			try { throw new Exception("coordonnée X négative"); }
			catch (Exception e) { e.printStackTrace(); }
		}
		// getY(B) >= 0
		if( !(this.getDelegates().getY() >= 0) ) {
			try { throw new Exception("coordonnée Y négative"); }
			catch (Exception e) { e.printStackTrace(); }
		}
	}
	
	public int getX() {
		return super.getX();
	}
	
	public int gety() {
		return super.getY();
	}
	
	public TYPE getType() {
		return super.getType();
	}
	
	public TRESOR getTresor() {
		return super.getTresor();
	}
	
	public void init(int x, int y, TYPE type, TRESOR tresor) {
		// pre cond
		if( !( x >= 0) ){
			try { throw new Exception(""); }
			catch (Exception e) { e.printStackTrace(); }
		}
		if( !( y >= 0) ){
			try { throw new Exception(""); }
			catch (Exception e) { e.printStackTrace(); }
		}
		// pre check
		checkInvariants();
		// ope
		super.init(x, y, type, tresor);
		// post check
		checkInvariants();
		// post cond
		// \post getX(init(x, y, type, tresor)) = x
		
		// \post getY(init(x, y, type, tresor)) = y
		// \post getType(init(x, y, type, tresor)) = type
		// \post getTresor(init(x, y, type, tresor)) = tresor
	}
}

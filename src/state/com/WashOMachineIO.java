package state.com;

public class WashOMachineIO {

	boolean doorOpen = false;
	int tablets = 0;
	
	public WashOMachineIO (int tablets) {
		//validate for above 0 or set to out of tbaeltsstate
		this.tablets = tablets;
		
	}
	
	
	
}

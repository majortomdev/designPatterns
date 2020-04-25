package state.com;

public class ReadyState implements State {

	@Override
	public void insertCash() {
		System.out.println("im in Ready states insertCash()");
		
	}

	@Override
	public void pressGo() {
		System.out.println("im in Ready states pressGo()");
		
	}

	@Override
	public void openDoor() {
		System.out.println("im in Ready states openDoor()");
		
	}

	@Override
	public void refillTabs() {
		System.out.println("im in Ready states refillTabs()");
		
	}

	
}

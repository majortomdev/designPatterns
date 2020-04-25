package state.com;

public class WashingState implements State {

	@Override
	public void insertCash() {
		System.out.println("im in washing states insertCash()");
		
	}

	@Override
	public void pressGo() {
		System.out.println("im in washing states pressGo()");
		
	}

	@Override
	public void openDoor() {
		System.out.println("im in washing states openDoor()");
		
	}

	@Override
	public void refillTabs() {
		System.out.println("im in washing states refillTabs");
		
	}

}

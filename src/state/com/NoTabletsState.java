package state.com;

public class NoTabletsState implements State {
	@Override
	public void insertCash() {
		System.out.println("im in NoTabletStates insertCash()");
		
	}

	@Override
	public void pressGo() {
		System.out.println("im in NoTabletStates pressGo()");
		
	}

	@Override
	public void openDoor() {
		System.out.println("im in NoTabletStates openDoor()");
		
	}

	@Override
	public void refillTabs() {
		System.out.println("im in NoTabletStates refillTabs");
		
	}
}

package state.com;

public class MoneyInState implements State {

	@Override
	public void insertCash() {
		System.out.println("im in MoneyIN states insertCash()");
		
	}

	@Override
	public void pressGo() {
		System.out.println("im in MoneyIN states pressGo()");
		
	}

	@Override
	public void openDoor() {
		System.out.println("im in MoneyIN states openDoor()");
		
	}

	@Override
	public void refillTabs() {
		System.out.println("im in MoneyIN states refillTabs()");
		
	}

}

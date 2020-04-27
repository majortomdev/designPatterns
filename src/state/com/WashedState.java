package state.com;

public class WashedState implements State {
	WashOMachineIO washingMachine;
	public WashedState (WashOMachineIO washo) {
		washingMachine = washo;
	}

	@Override
	public void insertCash() {
		System.out.print("....Machine in Wash Cycle...unable to accept money");
		
	}

	@Override
	public void pressGo() {
		System.out.print("....already finished washing...");
		
	}

	@Override
	public void closeDoor() {
		System.out.print("im in washing states openDoor()");
		
	}

	@Override
	public void refillTabs(int tabs) {
		System.out.print("im in washing states refillTabs");
		
	}

}

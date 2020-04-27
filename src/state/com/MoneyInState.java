package state.com;

public class MoneyInState implements State {

	WashOMachineIO washingMachine;
	public MoneyInState (WashOMachineIO washo) {
		washingMachine = washo;
	}
	@Override
	public void insertCash() {
		System.out.print("...You've already stuck in your coins..");
		
	}

	@Override
	public void pressGo() {
		System.out.print("The Machine starts to purr.....");
		washingMachine.doorOpen= false;
		washingMachine.setState(washingMachine.getWashedState());
		//washingMachine.setState(washingMachine.getReadyState());
	}

	@Override
	public void closeDoor() {
		System.out.print("...door locked till wash over...");
		
	}

	@Override
	public void refillTabs(int tabs) {
		System.out.print("im in MoneyIN states refillTabs()");
		
	}

}

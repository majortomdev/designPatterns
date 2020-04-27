package state.com;

public class NoTabletsState implements State {
	WashOMachineIO washingMachine;
	public NoTabletsState (WashOMachineIO washo) {
		washingMachine = washo;
	}
	@Override
	public void insertCash() {
		System.out.print("...no point in putting in cash until there are tablets in machine...");
		
	}
	@Override
	public void pressGo() {
		System.out.print("....nothing happens, especially not when machine needs tablets....");
		
	}
	@Override
	public void closeDoor() {
		System.out.print("...no Tablets....");
		
	}

	@Override
	public void refillTabs(int refills) {
		
		washingMachine.tablets =+refills;
		
	}
}

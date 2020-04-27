package state.com;

public class ReadyState implements State {
	
	WashOMachineIO washingMachine;// no need to instantiate as this will just be my reference to concrete objects
	//of this type-> this is PARAMOUNT in the state pattern for switching states in my programme object class
	public ReadyState (WashOMachineIO washo) {
		washingMachine = washo;
	}

	@Override
	public void insertCash() {
		System.out.print("Cash has been inserted.....");
		washingMachine.doorOpen=true;
		washingMachine.setState(washingMachine.getMoneyInState());
	}

	@Override
	public void pressGo() {
		System.out.print("....nothing happens in this world without money......");
		
	}

	@Override
	public void closeDoor() {
		System.out.print("....door is kept open....waiting on coins...");
		
	}

	@Override
	public void refillTabs(int tabs) {
		washingMachine.tablets =+tabs;
		
	}

	
}

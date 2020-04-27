package state.com;

public class WashOMachineIO {

	boolean doorOpen = false;
	int tablets = 0;
	State readyState;
	State moneyInState;
	State washingState;
	State noTabletsState;
	State state;
	
	
	public WashOMachineIO (int tablets) {
		//validate for above 0 or set to out of tabletstate
		this.tablets = tablets;
		readyState = new ReadyState(this);
		moneyInState = new MoneyInState(this);
		washingState = new WashedState(this);
		noTabletsState = new NoTabletsState(this);
		if(this.tablets == 0) {
			state = noTabletsState;
		}else {
			state = readyState;
			//doorOpen= true;
		}
		
	}
	public void insertCash() {
		state.insertCash();
	}
	public void pressGo() {
		tablets--;
		if(tablets== 0) {
			state = noTabletsState;
		}
		state.pressGo();
	}
	public void openDoor() {
		state.openDoor();
	}
	public void refillTabs(int tabs) {
		state.refillTabs(tabs);
	}
	void setState(State st) {
		state= st;
	}
	public State getMoneyInState() {
		return moneyInState;
	}
	public State getWashedState() {
		return washingState;
	}
	public State getReadyState() {
		return readyState;
	}
	public State getNoTabletsStage() {
		return noTabletsState;
	}
	public String toString() {
		return "->   "+state.getClass().getName()+", Tablets: "+tablets+", DoorOpen: "+doorOpen+"\n";
	}
	
}

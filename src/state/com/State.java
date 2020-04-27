package state.com;

public interface State {
	
	public void insertCash();
	public void pressGo();
	public void closeDoor();
	public void refillTabs(int refills);

}

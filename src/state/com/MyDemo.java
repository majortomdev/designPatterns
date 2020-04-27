package state.com;

public class MyDemo {

	public static void main(String[] args) {
		WashOMachineIO washerman = new WashOMachineIO(2);
//		washerman.insertCash();
//		System.out.print(washerman);
		washerman.insertCash();
		washerman.pressGo();
		System.out.println(washerman);
	}

}

package strategy.com;

public class Pirate extends Player{

	@Override
	public void fight() {
		System.out.print(this.getClass().getSimpleName()+" attacks:    ");
		attackStr.launchAttack();
		
	}
	

	
}

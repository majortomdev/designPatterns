package strategy.com;

public abstract class Player {

	AttackStrategy attackStr;
	
	public abstract void fight();
	
	void setAttackType(AttackStrategy attack){
		this.attackStr= attack;
	}
	
}

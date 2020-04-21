package com.strategy.com;

public class Witch extends Player{

	@Override
	public void fight() {
		System.out.print(this.getClass().getSimpleName()+" attacks :   ");
		attackStr.launchAttack();
		
	}
	

	
}

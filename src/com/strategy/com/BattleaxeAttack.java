package com.strategy.com;

public class BattleaxeAttack implements AttackStrategy {
	
	@Override
	public void launchAttack() {
		System.out.println("XXX--CHOP--XXX.....attack with Battleaxe..");
	}
}

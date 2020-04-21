package com.strategy.com;

public class SwordAttack implements AttackStrategy {
	
	@Override
	public void launchAttack() {
		System.out.println("WHOOOOSHHHH.....attack with Sword..");
	}
}

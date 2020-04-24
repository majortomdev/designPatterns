package strategy.com;

public class BattleMAIN {

	public static void main(String[] args) {
		Player player1 = new Witch();
		player1.setAttackType(new BattleaxeAttack());
		player1.fight();
		Player player2 = new Barbarian();
		player2.setAttackType(new LaserGunAttack());
		player2.fight();
		player1.setAttackType(new LaserGunAttack());
		player1.fight();
		Player player3 = new Pirate();
		player3.setAttackType(new KnifeAttack());
		player3.fight();
		Player player4 = new Swordsman();
		player4.setAttackType(new SwordAttack());
		player4.fight();

	}

}

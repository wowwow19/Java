package chap07_3;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f instanceof Unit");
		}
		if (f instanceof Fightable) {
			System.out.println("f instanceof Fightable");
		}
		if (f instanceof Movable) {
			System.out.println("f instanceof Movable");
		}
		if (f instanceof Attackable) {
			System.out.println("f instanceof Attackable");
		}
		if (f instanceof Object) {
			System.out.println("f instanceof Object");
		}
	}
}

class Unit {
	int currentHp;
	int x;
	int y;
}

interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }
interface Fightable extends Movable, Attackable {}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.println("공격");
	}

	@Override
	public void attack(Unit u) {
		System.out.println("이동");
	}
	
}

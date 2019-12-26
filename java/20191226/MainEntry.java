package winter2019;

public class MainEntry {
	public static void main(String[] args) {
		Strategy strategy = new Strategy();
		strategy.doAttack();
		
		strategy.setWeapon(new Knife());
		strategy.doAttack();
		
		strategy.setWeapon(new Gun());
		strategy.doAttack();
		
		strategy.setWeapon(new Canon());
		strategy.doAttack();
		
	}
}

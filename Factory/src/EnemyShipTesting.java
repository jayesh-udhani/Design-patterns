import java.util.Scanner;

public class EnemyShipTesting {
	
	public static void main(String[] args) {
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip enemy = null;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship you wanna create? (U/R/B)");
		if(userInput.hasNext()) {
			String typeOfShip = userInput.next();
			enemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if(enemy != null) {
			doStuffEnemy(enemy);
		}
		else
			System.out.println("Enter a U, R or B next time.");
			
	}
	
	public static void doStuffEnemy(EnemyShip enemyShip) {
		if(enemyShip == null)
			return;
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}

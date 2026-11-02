package skillbuilders;

public class GameChar {

	public static void main(String[] args) 
	{
		//create 
		GameCharacter player1 = new GameCharacter("hero", 100);
		GameCharacter player2 = new GameCharacter("villain", 85);
		
		player1.attack();
		player2.takeDamage(20);
		
		System.out.println(player1.getStatus());
		System.out.println(player2.getStatus());

	}

}

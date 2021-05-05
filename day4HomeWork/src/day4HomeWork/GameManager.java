package day4HomeWork;

public class GameManager implements GameManagement {

	public void sell(Player player, Game game) {
		
		System.out.println(game.getName() + " was sold to the " + player.getFirstName() + " " + player.getLastName() +" player.");
	}
}

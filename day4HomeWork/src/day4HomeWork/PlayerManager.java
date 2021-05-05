package day4HomeWork;

public class PlayerManager {

	private ControlManager controlManager;

	public PlayerManager(ControlManager controlManager) {
		
		this.controlManager = controlManager;
	}
	
	public void add(Player player) {
		if(controlManager.control(player) == true) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " was added as a player.");
		}
		else {
			System.out.println("Please check your identification number.");
		}
	}
	
	public void delete(Player player) {
		if(controlManager.control(player) == true) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " deleted");
		}
		else {
			System.out.println("Please check your identification number.");
		}
	}
	
	public void update(Player player, String newIdentificationNumber, String newFirstName, String newLastName, int newBirthYear) {
		if(controlManager.control(player) == true && newIdentificationNumber.length() == 11 && 
				newFirstName.length() >= 3 && 
				newLastName.length() >= 2 &&
				newBirthYear > 1950) {
			
		player.setIdentificationNumber(newIdentificationNumber);
		player.setFirstName(newFirstName);
		player.setLastName(newLastName);
		player.setBirthYear(newBirthYear);
		
		System.out.println("Player information has been updated as follows: " + 
		player.getIdentificationNumber() + 
		" " +
		player.getFirstName() + 
		" " +
		player.getLastName() + 
		" " +
		player.getBirthYear());
		}
		else {
			System.out.println("Please check your identification number or your new information.");
		}
	}
}

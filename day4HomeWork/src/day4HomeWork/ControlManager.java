package day4HomeWork;

public class ControlManager implements ControlManagement {

	@Override
	public boolean control(Player player) {
		
	if(player.getIdentificationNumber().length() == 11 && 
			player.getFirstName().length() >= 3 && 
			player.getLastName().length() >= 2 && 
			player.getBirthYear() >= 1950) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " is a real person.");	
		return true;
	}
	else {
		System.out.println("Identification Number is invalid.");
		return false;
	}
		
	}
}

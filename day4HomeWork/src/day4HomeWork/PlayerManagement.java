package day4HomeWork;

public interface PlayerManagement {

	void add(Player player);
	void delete(Player player);
	void update(Player player, String newIdentificationNumber, String newFirstName, String newLastName, String newBirthYear);
}
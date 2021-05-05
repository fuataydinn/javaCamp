package day4HomeWork;

public class CampaignManager implements CampaignManagement {

	
	
	public void doCampaign(Game game, double campaignPercentage) {
		
		double newPrice =  game.getPrice() - (game.getPrice() * campaignPercentage / 100);
		System.out.println("The campaign has started. " + game.getName() + " price: " + newPrice);
	}
	
	public void deleteCampaign(Game game) {
		
		System.out.println("The campaign period is over. Game price: " + game.getPrice());
	}
	
	public void updateCampaign(Game game, double oldCampaignPercentage, double newCampaignPercentage) {
		
		System.out.println("The campaign discount percentage has been increased from " + oldCampaignPercentage +  "% to " + newCampaignPercentage + "%.");
		double oldPrice = game.getPrice() - (game.getPrice() * oldCampaignPercentage / 100);
		double newPrice = game.getPrice() - (game.getPrice() * newCampaignPercentage / 100);
		System.out.println("the game price went down from " + oldPrice + " to " + newPrice + "." );
	}
	
}

package day4HomeWork;

public interface CampaignManagement {

	void doCampaign(Game game, double campaignPercentage);
	void deleteCampaign(Game game);
	void updateCampaign(Game game, double oldCampaignPercentage, double newCampaignPercentage);
}
package Core;

import Business.Abstracts.IGmailService;
import Entities.Concretes.User;
import GmailApi.GmailApi;

public class GmailManagerAdapter implements IGmailService{

	@Override
	public boolean checkGmail(User user) {
		 GmailApi api = new GmailApi();
         return api.checkGmailApi(user);
	}

}

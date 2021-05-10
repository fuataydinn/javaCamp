package Business.Concertes;

import Business.Abstracts.IGmailService;
import Business.Abstracts.IUserService;
import Business.Abstracts.IValidationService;
import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class UserManager implements IUserService {
	
	private IValidationService validationService;
	private IUserDao userDao;
	private IGmailService gmailService;
	
	
	public UserManager(IValidationService validationService, IUserDao userDao) {
		this.validationService = validationService;
		this.userDao = userDao;
	}

	@Override
	public void Register(User user) {
		if(validationService.validate(user)) {
			userDao.register(user);
		}
		
	}

	@Override
	public void Login(String mail, String password) {
		if (validationService.login(mail, password)) {
			System.out.println("Sisteme giriþ yapýldý :"+mail);
		}
		else {
			System.out.println("Yanlýþ kullanýcý bilgisi,sisteme giriþ yapýlamadý");
		}
		
	}

}

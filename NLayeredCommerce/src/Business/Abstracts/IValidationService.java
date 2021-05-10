package Business.Abstracts;

import Entities.Concretes.User;

public interface IValidationService {
	
	boolean validate(User user);
	boolean login(String mail,String password);

}

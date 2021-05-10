package Business.Abstracts;

import Entities.Concretes.User;

public interface IUserService {

	void Register(User user);
	void Login(String mail,String password);

}

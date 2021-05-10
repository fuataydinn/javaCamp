package DataAccess.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface IUserDao {
	void register(User user);
	void login(User user);
	List<User>getList();

}

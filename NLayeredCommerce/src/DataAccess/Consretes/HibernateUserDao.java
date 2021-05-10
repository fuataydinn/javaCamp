package DataAccess.Consretes;

import java.util.ArrayList;
import java.util.List;

import Business.Constants.Messages;
import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class HibernateUserDao implements IUserDao{
	
	public static List<User>userlist=new ArrayList<>();

	@Override
	public void register(User user) {
		System.out.println(" "+Messages.UserRegistered+" : "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void login(User user) {
		System.out.println(Messages.SuccessLogin+" : "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public List<User> getList() {
		
		return userlist;
	}

}

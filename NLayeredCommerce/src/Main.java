import java.time.LocalDate;

import Business.Abstracts.IUserService;
import Business.Concertes.UserManager;
import Business.Concertes.ValidationManager;
import Core.GmailManagerAdapter;
import DataAccess.Consretes.HibernateUserDao;
import Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("************************* Kayýt Ýþlemleri *********************************");
		
		IUserService userService=new UserManager(new ValidationManager(new HibernateUserDao(),new GmailManagerAdapter()),new HibernateUserDao());
		
		User user1=new User(1, "Fuat", "Aydýn", "fuat@gmail.com", "123", LocalDate.of(1994, 2, 3));
		
		User user2=new User(2, "Süleyman", "Karaca", "süleyman@gmail.com", "459898", LocalDate.of(1997, 2, 8));
		
		User user3=new User(3, "Eray ", "Onay", "eray@gmail.com", "11", LocalDate.of(1994, 8, 3));
		
		User user4=new User(4, "Ertuðrul", "Deðerli", "ertugrul@gmail.com", "8777514155", LocalDate.of(1994, 10, 3));
		
		 User[] users = {user1, user2, user3, user4};
	        for (User user : users) {
	            userService.Register(user);
		
		
	}
	        System.out.println("\n---------------------Login iþlemleri--------------------------------");
	        String mail1 = "fuat@gmail.com";
	        String password1 = "123";
	        userService.Login(mail1, password1);

	        String mail2 = "süleyman@gmail.com";
	        String password2 = "459898";
	        userService.Login(mail2, password2);

}
}

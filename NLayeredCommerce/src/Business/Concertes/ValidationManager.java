package Business.Concertes;



import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

import Business.Abstracts.IValidationService; 
import Business.Constants.Messages; 
import Core.GmailManagerAdapter;  
import DataAccess.Abstracts.IUserDao; 
import DataAccess.Consretes.HibernateUserDao;
import Entities.Concretes.User; 

public class ValidationManager implements IValidationService{
	private IUserDao dao;
	private GmailManagerAdapter adapter;
	
	public ValidationManager(IUserDao dao, GmailManagerAdapter adapter) {
		
		this.dao = dao;
		this.adapter = adapter;
	}

	@Override
	public boolean validate(User user) {
		if(rules(user)&isRegistered(user)) {
			System.out.println("Doðrulama maili gönderildi : "+user.getFirstName()+" "+user.getLastName());
			System.out.println("Kullanýcý doðrulama mailine onay verdi : " + user.getFirstName() + " " + user.getLastName());
            dao.getList().add(user);
            return true;
			}
		return false;
	}

	@Override
	public boolean login(String email, String password) {
		 for (User myUser : dao.getList()) {
	            if (myUser.getMail().equals(email) & myUser.getPassword().equals(password)) {
	                return true;
	}
	           
    }
		return false;
		 
    }
	 private boolean rules(User user) {
	        if (isGoogleMail(user) & isFirstName(user.getFirstName()) & isLastName(user.getLastName()) &
	                isPassword(user.getPassword()) & isEmailFormat(user.getMail())) {
	            return true;
	        }
	        return false;
	    }
	
	
	 private boolean isEmailFormat(String mail) {
	        String regex = "^(.+)@(.+)$";
	       Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(mail);
	        if (!matcher.matches()) {
	            System.out.println(Messages.ErrorEmailFormat + " : " + mail);
	            return false;
	        }
	        return true;
	    }
	 
	 private boolean isFirstName(String firstName) {
	        if (firstName.length() < 2) {
	            System.out.println(Messages.ErrorFirstName + " : " + firstName);
	            return false;
	        }
	        return true;
	    }
	 
	 private boolean isLastName(String lastName) {
	        if (lastName.length() < 2) {
	            System.out.println(Messages.ErrorLastName + " : " + lastName);
	            return false;
	        }
	        return true;
	    }
	 
	 private boolean isPassword(String password) {
	        if (password.length() < 6) {
	            System.out.println(Messages.ErrorPassword + " : " + password);
	            return false;
	        }
	        return true;
	    }
	 
	 private boolean isRegistered(User user) {

	        for (User myUser : dao.getList()) {
	            if (myUser.getMail().equals(user.getMail())) {
	                System.out.println(Messages.emailIsAlreadyRegistered + " : " + user.getMail());
	                return false;
	            }
	        }
	        return true;
	    }
	 
	 private boolean isGoogleMail(User user) {
	        if (adapter.checkGmail(user)) {
	            System.out.println("\nMail adresi geçerli :Google mail" + " > " + user.getMail());
	            return true;
	        }
	        System.out.println("\nMail adresi geçersiz :Google mail" + " > " + user.getMail());
	        return false;
	    }
}
	


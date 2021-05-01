
public class Instructor extends User {
	
	int id;
	
	public Instructor(String firtName,String lastName,String email,int id) {
		
		super(firtName, lastName, email);
		this.id=id;
		
	}
	
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		
		this.id=id;
	}
	
	

}

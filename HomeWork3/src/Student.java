
public class Student extends User{
	
	int studentId;
	
	public Student(String firstName,String lastName,String email,int studentId) {
		
		super(firstName,lastName,email);
		
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId=studentId;
		
	}
}

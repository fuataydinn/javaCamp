
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor=new Instructor("Engin","Demirog","engin@gmail.com",101);
		
		Student student=new Student("Fuat","Aydın","faydnn@gmail.com",102);
		
		UserManager userManager=new UserManager();
		
		InstructorManager instructorManager=new InstructorManager();
		
		StudentManager studentManager=new StudentManager();
		
		userManager.login(student);
		userManager.login(instructor);
		
		userManager.logOut(student);
		userManager.logOut(instructor);
		
		instructorManager.createCourse(instructor);
		studentManager.takeCourse(student);
				
		

	}

}

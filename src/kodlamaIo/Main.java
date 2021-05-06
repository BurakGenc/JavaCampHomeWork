package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.setId(1);
		student1.setFirsName("Burak");
		student1.setLastName("Genc");
		student1.setEmail("burakgenc@gmail.com");
		student1.setPassword("qwerty");
		
		
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setFirsName("Engin");
		instructor1.setLastName("DEmirog");
		instructor1.setEmail("enginhoca@gmail.com");
		instructor1.setPassword("zxcvbn");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.callTheRoll(student1);
		
		
		
		InstructorManager instructorManager=new InstructorManager();
		String course1="Java";
		String course2="C#";
		String course3="Pyhton";
		instructorManager.add(instructor1);
		instructorManager.addCourse(instructor1,course1);
		instructorManager.addCourse(instructor1,course2);
		instructorManager.addCourse(instructor1,course3);
		
		for (String a : instructor1.getCourses()) {
			System.out.println(a);
		}
		
	}

}

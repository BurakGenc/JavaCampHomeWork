package kodlamaIo;

public class InstructorManager extends UserManager {
	
	public void addHomework(Instructor instructor) {

		System.out.println(instructor.getFirsName() + " hoca yeni bir odev ekledi");

	}

	public void addCourse(Instructor instructor,String course) {
		
		int length = instructor.getCourses().length; // eski dizinin boyutu
		String [] newCourses ; 
		newCourses=new String[length+1];// eski dizi boyutundan 1 fazla  yeni dizi olusturduk
		
		
		//eski veriler yeni diziye aktariliyor
		for(int i =0 ; i<length;i++) {
			newCourses[i]=instructor.getCourses()[i];
		}
		
		//yeni kursumuz en sona ekleniyor
		newCourses[instructor.getCourses().length]=course;
		
		
		instructor.setCourses(newCourses);

		System.out.println(instructor.getFirsName() + " hoca  yeni bir kurs ekledi  :"+course);

	}

}

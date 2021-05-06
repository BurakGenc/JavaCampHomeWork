package kodlamaIo;

public class Instructor extends User{
	
	private String [] courses;
	
	

	public Instructor() {
		super();
		courses = new String[0];
	}

	public Instructor(String[] courses) {
		super();
		this.courses = courses;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	

}

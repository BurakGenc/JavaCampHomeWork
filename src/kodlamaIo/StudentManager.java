package kodlamaIo;

public class StudentManager extends UserManager{
	
	public void callTheRoll(Student student) {
		System.out.println("yoklama alindi derse donebilirsiniz :) ");
		int newRollCall = student.getRollCall()+1;
		student.setRollCall(newRollCall);
	}

}

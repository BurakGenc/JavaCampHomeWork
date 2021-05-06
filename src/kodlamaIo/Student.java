package kodlamaIo;

public class Student extends User {
	private int rollCall;  //yoklama 
	private double completeRate;  //bitirme yüzdesi
	
	
	
	public Student() {
		super();
		rollCall=0;
		completeRate=0;
				
	}

	
	public int getRollCall() {
		return rollCall;
	}
	public void setRollCall(int rollCall) {
		this.rollCall = rollCall;
	}
	public double getCompleteRate() {
		return completeRate;
	}
	public void setCompleteRate(double completeRate) {
		this.completeRate = completeRate;
	}
	
}

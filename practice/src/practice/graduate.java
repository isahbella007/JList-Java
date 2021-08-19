package practice;

public class graduate extends Student{
	graduate(String Name, int stuNo, int mid1, int mid2, int final1){
		super(Name, stuNo, mid1, mid2, final1);
	}
	
	public String computeGrade() {
		int result = (getMid1() + getMid2() + getFinalGrade())/3; 
		if(result >= 70) {
			return "Pass"; 
		}else {
			return "Fail"; 
		}
		
	}

}

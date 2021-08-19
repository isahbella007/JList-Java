package practice;

public class underGrad extends Student{
	public underGrad(String Name, int stuNo, int mid1, int mid2, int final1) {
		super(Name, stuNo, mid1, mid2, final1);
		// TODO Auto-generated constructor stub
	}
	public String computeGrade() {
		int average = (getMid1()+getMid2()+getFinalGrade())/3; 
		if(average > 70) {
			return "A";
		}
		else if(70>average && average > 60) {
			return "B"; 
		}else {
			return "F"; 
		}
	}

}

package practice;

public class Student extends Person{
	private int studentNo, mid1, mid2, finalGrade;

	public Student(String name, int studentNo, int mid1, int mid2, int finalGrade) {
		super(name);
		this.studentNo = studentNo;
		this.mid1 = mid1;
		this.mid2 = mid2;
		this.finalGrade = finalGrade;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public int getMid1() {
		return mid1;
	}

	public void setMid1(int mid1) {
		this.mid1 = mid1;
	}

	public int getMid2() {
		return mid2;
	}

	public void setMid2(int mid2) {
		this.mid2 = mid2;
	}

	public int getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}

	
	
	

}

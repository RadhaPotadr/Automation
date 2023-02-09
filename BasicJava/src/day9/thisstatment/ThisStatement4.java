package day9.thisstatment;

class Student102 {
	int rollno;//nsgv
	float fee;//nsgv
	Student102(int rollno) {//111---112
		this.rollno = rollno;	//111---112
	}
	Student102(int rollno, float fee) { // 112,6000
		this(rollno); //C.T. error
		this.fee = fee;		//6000
	}
	void display() {
		System.out.println(rollno + " " + fee);//111,0.0
	}
}
class ThisStatement4 {
	public static void main(String args[]) {
		Student102 s1 = new Student102(111); //obj1
		Student102 s2 = new Student102(112, 6000f);//obj2
		Student102 s3 = new Student102(113, 7000f);
		s1.display();
		s2.display();
		s3.display();
	}
}
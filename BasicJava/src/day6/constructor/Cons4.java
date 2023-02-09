package day6.constructor;

public class Cons4 {
	int roll;
	double salary;
	Cons4(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll + " " + salary);
	}
	public static void main(String args[]) {
		Cons4 c1 = new Cons4(101,250045.45);
		c1.display();
		Cons4 c2 = new Cons4(201,550045.45);		
		c2.display();
	}
}
/*with parameterize constructor we can initialize each object member with different values
Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * */
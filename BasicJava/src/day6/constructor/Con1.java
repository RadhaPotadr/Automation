package day6.constructor;

public class Con1 {

	
		int roll;
		double salary;
		Con1(int r,double s){
			roll=r;
			salary=s;
		}
		void display() {
			System.out.println(roll + " " + salary);
		}
		public static void main(String args[]) {
			Con1 c1 = new Con1(101,250045.45);
			c1.display();
			Con1 c2 = new Con1(211,2345555.99);		
			c2.display();
		}
	}

package day3.forloop;

public class Dowhile3 {

	public static void main(String args[]) {
		/* local variable Initialization */ 
		int n = 1, times = 5;
		/* do-while loops execution */
		do {
			System.out.println("Java do while loops:" + n);
			n++;
		} while (n <= times);//1<=0
		n=3;
		while(n<=times) {
			System.out.println("Java while loops:" + n);
			n++;
		}
	}

}

package day2.variables;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;
		//   0     2     3    3
		//   1     2     3
		System.out.println("a: "+a);// 
		System.out.println("b: "+b);// 
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;
	 //      -5    -7    -8   -8
	//       -6     -7    -8
		System.out.println("a: "+a);//  
		System.out.println("b: "+b);//  

		a = 21;
		b = --a + --a + --a + a + ++a + a++;

		System.out.println(a);// 
		System.out.println(b);// 

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);//
		System.out.println(b);//
	}
 }
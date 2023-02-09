package day5.homework;

public class Eight {

	public static void main(String[] args) {
		
		
		int a=19, b=15, c=17;
		if ((a>b)&&(a>c)) {
							System.out.println("a is greatest");
		}
			else if((b>a)&&(b>c)) {
				System.out.println("b is greatest");
	}
			else{
				System.out.println("c is greatest");
	}
		greatest(16,19,2);
}
	
	
	static void greatest(int p, int q,int r) {
		if ((p>q)&&(p>r)) {
			System.out.println("p is greatest");
}
else if((q>r)&&(q>p)) {
System.out.println("q is greatest");
}
else{
System.out.println("r is greatest");
}
	}
	}

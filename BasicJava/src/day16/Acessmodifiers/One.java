package day16.Acessmodifiers;
class Radha{
	private int a=10;
	public int d=11;
	protected int b=12;
	 int c =13;
 void print() {
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);
		System.out.println("value of c :"+c);
		System.out.println("value of d :"+d);
	}
}

public class One {

	public static void main(String[] args) {
		Radha obj1 = new Radha();
		//System.out.println("value of a :"+obj1.a); private
		System.out.println("value of b :"+obj1.b);
		System.out.println("value of c :"+obj1.c);
		System.out.println("value of d :"+obj1.d);
	}
}

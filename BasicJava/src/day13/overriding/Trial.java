package day13.overriding;

class A {
	int a=23;
	static char c1 ='a';
	A() {
		System.out.println("A class default constructor");
	}
	A(int f){
		this();
		System.out.println("A class constructor with int f parameter");
	}
	A(char b){
		System.out.println("A class constructor with char parameter");
	}
	void first() {
		System.out.println("A class - first menthod ");
		this.second();
	}
	void second() {
		this.first();
		System.out.println("A class - second menthod ");
	}
}

class B extends A {
	int a=56;
	static char c1 ='b';
	B() {
		this(19);
		System.out.println("B class default constructor");
	}
	B(int i){
		super(20);
		System.out.println("B class constructor with int parameter");
	}
	B(char a) {
		super('c');
		System.out.println("B class constructor with char parameter");
	}
	void third() {
		System.out.println("B class - third menthod ");
	}
	void second() {
		super.second();
		System.out.println("B class - second menthod ");
	}
}

public class Trial {
	public static void main(String[] args) {
		
		B obj1 = new B();
	obj1.first();
    obj1.second();
   obj1.third();
    
	}
}

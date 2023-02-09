package day11.blocks;

public class Blocks1 {
	/* static block or static initialization block or SIB */
	static {
		System.out.println("******** Running static-block1 of class Blocks1..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of Blocks1 class...");
		System.out.println("main() ends");
	}
}
//static block --> if we need to provide any information before main() dn we use this block
//non static block --> If we want to provide any information before object creation dn we use this
//global variables - static & nonstatic
	//methods - static & nonstatic with overloading, use this keyword for global variable
	//constructor with overloading and using this() to call another constructor
	//use final keyword for declaring some variable as constant
	// blocks - static & nonstatic 
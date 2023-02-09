package day12.inheritance;
class Company202 {
	void display() {
		System.out.println("I am company class display()...");
	}
}
class Employee202 extends Company202 {
	void display() {
		System.out.println("I am Employee class display()...");
		super.display();
	}
	void callme() {
		System.out.println("I am Employee class callme()...");
	}
}
public class Inheritance9 {
	public static void main(String[] args) {
		Employee202 e1=new Employee202();
		e1.display();
		e1.callme();
		System.out.println("****************************");
		Company202 c1=new Company202();
		c1.display();
		System.out.println("****************************");
		Company202 e2=new Employee202();
		e2.display();
		}
}



/*//parent class
class Company {
	//global variable
	//method with method overloading use of this keyword
	//constructor with overloading and use of this()
}
//child class of Company
class Employee extends Company {
	//global variable name as Company name variable
		//method with method overloading use of this & super keyword
		//constructor with overloading and use of this() & super()
}
public class Inheritance10 {

	public static void main(String[] args) {
	}
}*/
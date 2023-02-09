package day7.thiskeyword;

public class One {

	int empId=25;
	public static void main(String[] args) {
		int age=30;
		System.out.println("I am local age: "+age);
		One n1=new One();
		System.out.println("I am local empId"+n1.empId);
		n1.display();
		System.out.println("I am local empId"+n1.empId);
		
	}
	void display() {
		int empId=45;
		System.out.println("I am local empId"+empId);
		System.out.println("I am local empId"+this.empId);
		

	}

}

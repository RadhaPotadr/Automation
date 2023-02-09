package day26.practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

class employee{
	int id;
	String name;
	long salary;
	int age;
	employee(int id,String name,long salary,int age){
		this.id=id;
		this.name= name;
		this.salary=salary;
		this.age =age;
	}
}
public class Arraylist2 {

	public static void main(String[] args) {
		List<employee>emp=new ArrayList();
		employee e1=new employee (1,"radha",2500000,28);
		employee e2=new employee (2,"chaitali",2800000,36);
		employee e3=new employee (3,"shradha",1500000,27);
		employee e4=new employee (4,"anuja",1300000,32);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(new employee(5,"kiran",120000,29));
		System.out.println("employee details :"+emp);
		for(employee o1:emp) {
			System.out.println("employee details :"+o1.id+" "+o1.name+" "+o1.salary+" "+o1.age);
		}
	}

}

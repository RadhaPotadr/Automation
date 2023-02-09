package day15.interfaceabs;
interface India{
	int population =100000;
	void show();
}
interface Ireland{
	int population= 5000;
	void show();
}
abstract class Home{
 abstract void radha();
 abstract void ankur();
}
public class Trial extends Home implements India,Ireland {
	 public void show() {
		  System.out.println("welcome to  world which has Ireland and India");
	  } 
	 public void radha () {
		 System.out.println("radha is homing in India");
	 }
	 public void ankur() {
		 System.out.println("ankur is homing in Ireland");
	 }
	 public static void main(String[] args) {
			Trial obj1=new Trial();
			obj1.ankur();
			obj1.radha();
			obj1.show();
			System.out.println("population =" +India.population);
			System.out.println("*********************************************");
			India obj2 =new Trial();
			obj2.show();
			System.out.println("*********************************************");
			Maharashtra obj5 =new Maharashtra();
			obj5.show();
			obj5.print();
			System.out.println("population =" +India.population);
			System.out.println("*********************************************");
			Home obj3=new Trial();
			obj3.radha();
			obj3.ankur();
			System.out.println("*********************************************");
			Ireland obj4=new Trial();
			obj4.show();
			System.out.println("*********************************************");
			Dublin obj6=new Dublin();
			obj6.show();
			obj6.print();
			System.out.println("population =" +Ireland.population);
			System.out.println("*********************************************");
			Ireland obj7=new Dublin();
			obj7.show();
			India obj8=new Maharashtra();
			obj8.show();		
	 }
}
 class Dublin implements Ireland {
	  int population =2700;
	  public void show() {
		  System.out.println("welcome to Ireland");
	  }
      public void print() {
    	  System.out.println("welcome to Dublin");
      }
}
 class Maharashtra implements India{
	 int population =75000;
	 public void show() {
		 System.out.println("welcome to India");
	 }
	 public void print() {
   	  System.out.println("welcome to Maharashta");
     }
 }
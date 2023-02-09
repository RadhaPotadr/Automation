package day20.singleton;
class Radha{
	private Radha () {
		System.out.println("i am private cons");
	}
	
	static Radha obj1= new Radha ();
	public static Radha display () {
		return obj1;
	}
       void calling () {
    	  System.out.println("i am calling method");
      }
}
public class Trial {
	public static void main(String[] args) {
	Radha obj1= Radha.display();
	obj1.calling();
	Radha obj2= Radha.display();
	obj2.calling();
	}
}

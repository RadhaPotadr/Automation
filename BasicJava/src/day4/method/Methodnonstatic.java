package day4.method;

public class Methodnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodnonstatic m1 = new Methodnonstatic();
		//wont print only execute
		m1.areaofcircle(2.9f,3.14);
		m1.areaofrectangle(9.2f, 3.6f);
		//will print result but wont be reused
		System.out.println(m1.areaofcircle(2.9f,3.14));
		System.out.println(m1.areaofrectangle(9.2f, 3.6f));
		// will store result into variable and can be used in future
		double areaofc= m1.areaofcircle(2.3f, 3.14);
		System.out.println("area of circle is :" +areaofc);
		
		double areaofr= m1.areaofrectangle(2.1f,3.9f);
		System.out.println("area of rectangle is :" +areaofr);
		
		double totalarea=areaofc+areaofr;
		System.out.println("area of body is :" +totalarea);
				}
		double areaofcircle(float r, double pi) {
			double area= pi*r*r;
			return area;
			
		}
		double areaofrectangle(float a, float b) {
			double area= a*b;
			return area;
			
		}
}

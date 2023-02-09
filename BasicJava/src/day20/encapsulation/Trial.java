package day20.encapsulation;
class Radha{
	private char c1='a';
	private float f1= 4.5f;
	public char getC1() {
		return c1;
	}
	public void setC1(char c1) {
		this.c1 = c1;
	}
	public float getF1() {
		return f1;
	}
	public void setF1(float f1) {
		this.f1 = f1;
	}
	

	
}
public class Trial {
  public static void main(String args[]) {
	Radha obj1= new Radha();
	
	System.out.println(obj1.getC1());
	System.out.println(obj1.getF1());
	
	obj1.setC1('k');
	obj1.setF1(3.1467f);
	
	System.out.println(obj1.getC1());
	System.out.println(obj1.getF1());
  
  }
}

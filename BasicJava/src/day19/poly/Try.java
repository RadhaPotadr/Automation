package day19.poly;
interface nothing {
	void see();
	int a=10;		
	}
abstract class something{
	abstract void write();
	int a=9;
	static void eat() {
		System.out.println("eat method");
	}	
}
class Parent extends something implements nothing{
	int a=78;
	public void see() {
		int a=12;
		System.out.println("see method of interface nothing body given by parent");
	}
	void write() {
		System.out.println("write method of abstract someothing body given by parent");	
	}
	Parent(){
		System.out.println("parent cons");
	}
	Parent(int x, int y){
		 this();
		System.out.println("parent cons with x and y");
	}
	void multiply(int a,int b) {
		System.out.println(a);
		a=this.a;
		System.out.println(a);
		a=super.a;
		System.out.println(a);
		 int mul= a*b;
		 System.out.println("parent class");
		 System.out.println(mul);
		 System.out.println(this.a);
		 System.out.println(super.a);
		 System.out.println(a);
	 }	
	void display() {
		System.out.println("parent class display method");
	}
}
public class Try extends Parent {
	int num=10;
	Try(){
		this('h');
		System.out.println("try cons with no para");
	}
	Try(char c){
		System.out.println("try cons with char para");
	}
	Try(int a,int b){
          super(12,13);
		System.out.println("try cons with int para");
	}
static void addition(int a,int b) {
	int res=a+b;
	System.out.println(res);
	
}
static void addition(long b,int a) {
	long res2=a+b;
	System.out.println(res2);
	
}
 void multiply(int a,int b) {
	 int mul= a*b;
	 System.out.println("try class");
	 System.out.println(mul);
 }
 void print() {
	 System.out.println("try class ptint method"); 
 }
	public static void main(String[] args) {
	Try o1=new Try();
	o1.multiply(9, 8);
	o1.display();//virtual method
	Parent o2=new Parent();
	o2.multiply(6, 9);
	o2.display();
	Parent o3=new Try(1,8);
	o3.multiply(2, 4);//overriding
	o3.display();
	//o3.print; cant acess */
		//Try o1=new Try();
		//Try o2=new Try(2,5);
		//Try o3=new Try('r');
		Parent o4=new Parent();
		o4.multiply(3, 9);
	}
}

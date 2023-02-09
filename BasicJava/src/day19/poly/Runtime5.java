package day19.poly;

class Bike {
	int speedlimit = 90;
}
class Honda3 extends Bike {
	int speedlimit = 150;
}
public class Runtime5{
	public static void main(String args[]){  
	  Bike obj=new Honda3();
	  System.out.println(obj.speedlimit);
	}
}
// no poly as data / variables can't be overrided
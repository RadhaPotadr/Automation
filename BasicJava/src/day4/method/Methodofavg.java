package day4.method;

public class Methodofavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		avgnumbers (10,20,30,40);
		avgnumbers (50,60,70,80);
	}
	
	public static void avgnumbers(int a, int b , int c, int d) {
	int avg = (a+b+c+d)/4;
	System.out.println("avg of given numbers=" + avg);

}
}
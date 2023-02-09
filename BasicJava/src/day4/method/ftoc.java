package day4.method;

public class ftoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ftoc m1= new ftoc();
		
		m1.ftoc(39);
		System.out.println(m1.ftoc(39));
		
		double conversion = m1.ftoc(39);
		System.out.println("39 celsius is equal to " +conversion);
		
	}

	double ftoc (double c) {
		double f = (c*1.8 )+32;
		return f;
		
		}
}

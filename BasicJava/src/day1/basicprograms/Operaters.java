package day1.basicprograms;

public class Operaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =21;
		int num2=16;
		int res= num1+num2;
		System.out.println("addition of two numbers:"+ res);
		res= num1-num2;
		System.out.println("substion of two numbers:"+ res);
		res= num1*num2;
		System.out.println("multiplication of two numbers:"+ res);
		res= num1/num2;
		System.out.println("division of two numbers:"+ res);
		res= num1%num2;
		System.out.println("mod of two numbers:"+ res);
		boolean b1= (num1==num2);
		boolean b2= (num1> num2);
		boolean b3= (num1!=num2);
		boolean b4= (num1 <num2);
		System.out.println("b1:"+ (num1==num2));
		System.out.println("b2:"+ (num1>num2));
		System.out.println("b3:"+ (num1!=num2));
		System.out.println("b4:"+ (num1<num2));
		System.out.println("b1 && b2:"+ ((num1==num2)&&(num1>num2)));
		System.out.println("b1 && b3:"+ ((num1==num2)&&(num1!=num2)));
		System.out.println("b1 && b4:"+ ((num1==num2)&&(num1<num2)));
		System.out.println("b1 || b2:"+ ((num1==num2)||(num1>num2)));
		System.out.println("b1 || b3:"+ ((num1==num2)||(num1!=num2)));
		System.out.println("!(b1 || b2):"+ !((num1==num2)||(num1>num2)));
		System.out.println("!(b1 && b4):"+ !((num1==num2)&&(num1<num2)));
		System.out.println("b1 && b2:"+ (b1&&b2));
		System.out.println("b1 && b3:"+ (b1&&b3));
		System.out.println("b1 && b4:"+ (b1&&b4));
		System.out.println("b1 || b2:"+ (b1||b2));
		System.out.println("b1 || b3:"+ (b1||b3));
		System.out.println("!(b1 || b2):"+ !(b1||b2));
		System.out.println("!(b1 && b4):"+ !(b1&&b4));
	}

}

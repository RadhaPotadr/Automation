 package day2.variables;

public class Total {
		char C='a';
		static boolean L= false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=8;
		double B =2.9;
		System.out.println("A:"+A);
		System.out.println("B:"+B);
		System.out.println("L:"+L);
		Total O1= new Total();
		System.out.println("C:"+O1.C);
		O1.C='d';
		System.out.println("C:"+O1.C);
		Total O2= new Total();
		System.out.println("C:"+O2.C);
	}

}

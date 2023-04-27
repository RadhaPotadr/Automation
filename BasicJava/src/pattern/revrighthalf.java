package pattern;

public class revrighthalf {

	public static void main(String[] args) {
		int a=5;
		for(int i =0;i<=a;i++) {
			for(int j=a;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

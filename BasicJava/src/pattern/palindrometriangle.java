package pattern;

public class palindrometriangle {

	public static void main(String[] args) {
		int a=4;
		for(int i=a;i>=1;i--) {
			for(int j=i;j<=a;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=a;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
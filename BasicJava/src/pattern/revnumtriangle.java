package pattern;

public class revnumtriangle {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
	System.out.println();
	}
	}
}
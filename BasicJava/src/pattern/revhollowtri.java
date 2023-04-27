package pattern;

public class revhollowtri {

	public static void main(String[] args) {

		int n=5;
		for(int i=n;i>=1;i--) {
			for( int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i==n ||k==1|| k==(2*n-1) || i==k) {
					System.out.print("* ");	
				}
				else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
			}

		}


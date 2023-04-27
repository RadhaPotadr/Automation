package pattern;

public class pascals {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			int x = 1;
			for(int k=1;k<=i;k++) {
				System.out.print(x + " ");
                x = x * (i - k) / k;
            }
				/*if(k==1||i==k) {
					System.out.print("1 ");
				}
				else{ 
					System.out.print(i-1+" ");
				}
			}*/
			System.out.println();
		}
	}

}

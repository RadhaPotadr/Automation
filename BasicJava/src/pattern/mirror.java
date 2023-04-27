package pattern;

public class mirror {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<n;i++) {
			
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
	System.out.println();
		}
	for(int m=n;m>=1;m--) {
		
		for(int k=1;k<m;k++) {
			System.out.print(" ");
		}
		for(int j=m;j<=n;j++) {
			System.out.print(j+" ");
		}
System.out.println();
}
}}
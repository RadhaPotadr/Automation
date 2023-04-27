package pattern;

public class startriangle {

	public static void main(String[] args) {

int n=5;
for(int i=1;i<=n;i++) {
	for(int j=i;j<=n-1;j++) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print("* ");
	}
	System.out.println();

}
	}

}

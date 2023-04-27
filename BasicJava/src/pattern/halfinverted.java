package pattern;

public class halfinverted {

	public static void main(String[] args) {

for(int i=0;i<=5;i++) {
	for(int j=5;j>=i;j--) {
		System.out.print("* ");	
	}
	System.out.println();
}
for(int i=0;i<=5;i++) {
	for(int j=5;j>=i;j--) {
		System.out.print(j+" ");	
	}
	System.out.println();
}
for(int i=0;i<=5;i++) {
	for(int j=5;j>=i;j--) {
		System.out.print(i+" ");	
	}
	System.out.println();
}
	}

}

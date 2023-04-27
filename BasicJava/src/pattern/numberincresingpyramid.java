package pattern;

public class numberincresingpyramid {

	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=i;j++){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
	}

}

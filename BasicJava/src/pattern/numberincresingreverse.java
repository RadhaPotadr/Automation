package pattern;

public class numberincresingreverse {

	public static void main(String[] args) {
		
		int a=1;
		for(int i=0;i<=3;i++) {
			for(int j=3;j>=i;j--){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}

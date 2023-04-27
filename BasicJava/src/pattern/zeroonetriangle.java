package pattern;

public class zeroonetriangle {

	public static void main(String[] args) {
		int n=4;
		for (int i = 1; i <= n; i++) {
            //inner loop to handle number of columns
            for (int j = 1; j <= i; j++) {
                // if the sum of (i+j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else {
                    System.out.print(0 + " ");
                }
            }
 
            //printing new line for each row
            System.out.println();
        }

	}}

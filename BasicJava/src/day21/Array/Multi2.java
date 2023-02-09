package day21.Array;
public class Multi2 {
	public static void main(String[] args) {
		System.out.println("***********evenodd*********");
		int m[][]= {{1,2,3},{3,4,5},{0,6,7}};
		int evencount=0;
		int oddcount=0;
		int zero=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				if((m[i][j]%2==0)&&(m[i][j]!=0)) {
					evencount++;
				}
				else if((m[i][j]%2!=0)&&(m[i][j]!=0)){
					oddcount++;
				}
				else {
					zero++;
				}
			}
		}
		System.out.println(zero);
		System.out.println(evencount);
		System.out.println(oddcount);
		System.out.println("***********row/col addition*********");
		int n[][]= {{1,2,3},
					{3,4,5},
					{0,6,7}};
		int rowsum=0;
		int colsum=0;
		for(int i=0;i<n.length;i++) {
				for(int k=0;k<n[i].length;k++) {
					rowsum=rowsum+n[i][k];
					}
				System.out.println("row "+i+"has sum ="+rowsum);
				rowsum=0;
			}
			for(int j=0;j<n.length;j++) {
				for(int k=0;k<n[j].length;k++) {
					colsum=colsum+n[k][j];
				}
			    System.out.println("col "+j+"has sum ="+colsum);
				colsum=0;
			}
			System.out.println("***********lower triangular*********");
			int a[][]=new int[4][4];
			for(int i=0;i<a.length;i++) {
				for(int k=0;k<a[i].length;k++) {
					if(i>=k) {
						System.out.print("a ");	
					}
					else {
						System.out.print(a[i][k]+" ");	
					}	
					}System.out.println();
				}
			System.out.println("***********upper triangular*********");
			int b[][]=new int[4][4];
			for(int i=0;i<b.length;i++) {
				for(int k=0;k<b[i].length;k++) {
					if(i>k) {
						System.out.print(b[i][k]+" ");	
					}
					else {
						System.out.print("a ");	
					}	
					}System.out.println();
				}
			System.out.println("***********transpose*********");
			
			int x[][]= {{1,2,3},
						{3,4,5},
						{0,6,7}};
			int y[][]=new int[3][3];
			for(int i=0;i<x.length;i++) {
				for(int k=0;k<x[i].length;k++) {
					y[k][i]=x[i][k];
				}	
	} 
			for(int i=0;i<x.length;i++) {
		for(int k=0;k<x[i].length;k++) {
			System.out.print(y[i][k]+" ");
        }System.out.println();
}
	
	}
	
	
	
}
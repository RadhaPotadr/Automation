package day21.Array;
public class Multi {
	public static void main(String[] args) {
	int[][] one =new int [4][4];
	for(int i=0;i<one.length;i++) {
		for(int j=0;j<one[i].length;j++)
			if(i==j) {
			System.out.print(one[i][j] + 1 + " ");
			}
			else {
				System.out.print(one[i][j] + 0+ " ");
			}
		System.out.println();
	}
	System.out.println("********addition************");
	int two[][]={  {1,2,9},
			       {4,5,3},};
	int three[][]={{9,2,8},
			       {4,9,9},};
	for(int i=0;i<two.length;i++) {
		for(int j=0;j<two[i].length;j++){
			System.out.print(two[i][j]+three[i][j]+" ");	
		}	
		System.out.println();
		}
	System.out.println("***********sub*********");
	int p[][]= {{1,2,3},{4,5,6}};
	int q[][]= {{7,8,9},{10,11,12}};
	int r[][]=new int [p.length][p[0].length];
	for(int i=0;i<p.length;i++) {
		for(int j=0;j<p[i].length;j++) {
			r[i][j]=p[i][j]-q[i][j];
		}
	}
	for(int i=0;i<r.length;i++) {
		for(int j=0;j<r[i].length;j++) {
			System.out.print(r[i][j]+" ");
		}
			System.out.println();				
	}
	System.out.println("***********multi**********");
	int a[][]={ {1,2,3},{4,5,6}};
	int b[][]={ {7,8},{9,10},{11,12}};
	int sum=0;
	int res[][]=new int [a.length][b[0].length];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b[i].length;j++){
			for(int k=0;k<b.length;k++) {
				sum=sum+a[i][k]*b[k][j];
			}
				res[i][j]=sum;
				sum=0;
			}			
		}		
	for(int i=0;i<res.length;i++) {
		for(int j=0;j<res[i].length;j++) {
			System.out.print(res[i][j]+" ");
		}System.out.println();
	}
	int c[][]={ {1,2,3},{4,5,6}};
	int d[][]={ {7,8},{9,10},{11,12}};
    int k[][]=new int[c.length][d[0].length];
	//int k[][]= {{0,0},{0,0}};
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<d[i].length;j++) {
			for(int m=0;m<d.length;m++) {
				k[i][j]=k[i][j]+(c[i][m]*d[m][j]);
			}
		}
	}
	for(int i=0;i<k.length;i++) {
		for(int j=0;j<k[i].length;j++) {
			System.out.print(k[i][j]+" ");
		}System.out.println();
	}
	System.out.println("***********identity*********");
	
	int identity[][]= {{1,0,0},{0,1,0},{0,0,1}};
	boolean bl=true;
	for(int i=0;i<identity.length;i++) {
		for(int j=0;j<identity[i].length;j++) {
			if((i==j)&&(identity[i][j]!=1)) {
			    bl=false;
			    break;}
			if((i!=j)&&(identity[i][j]!=0)) {
				bl=false;
				break;}			
			}
		}
	if(bl==true) {
		System.out.println("it is identity metrix");
	}
	else{
		System.out.println("it is not identity metrix");
	}
	System.out.println("***********sparse*********");
	int ex[][]={ {1,2,9},
			     {4,0,6}};
	int u=1;
	for(int i=0;i<ex.length;i++) {
		for(int j=0;j<ex[i].length;j++) {
				if(ex[i][j]!=0) {
		System.out.print(u+" "+i+" "+j+" "+ex[i][j]);
					u++;
					System.out.println();
				}
		}
	}
	System.out.println("***********equallity*********");
	int x[][]= {{1,2,3},{3,4,5},{0,6,7}};
	int y[][]= {{1,2,3},{3,4,5},{5,6,7}};
	boolean z=true;
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length;j++) {
			if (x[i][j]==y[i][j]) {
				z=true;
			}
			else {
				//z=false;
				System.out.println("not equal");
				System.exit(0);
			}
		}
	}
	System.out.println("equal");
	}}






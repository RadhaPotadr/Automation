package prac;

public class pattern {

	public static void main(String[] args) {

for(int i=0;i<5;i++) {
	for(int j=0;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
System.out.println();
for(int i=0;i<=4;i++) {
	for(int j=4;j>=i;j--) {
		System.out.print("* ");
	}
	System.out.println();
	}
System.out.println();
for(int i=0;i<5;i++) {
	for(int j=0;j<=i;j++) {
		System.out.print(j+" ");
	}
	System.out.println();
}
System.out.println();
for(int i=0;i<=4;i++) {
	for(int j=4;j>=i;j--) {
		System.out.print(j+" ");
	}
	System.out.println();
	}
System.out.println();
for(int i=0;i<5;i++) {
	for(int j=0;j<=i;j++) {
		System.out.print(i+" ");
	}
	System.out.println();
}
System.out.println();
for(int i=0;i<=4;i++) {
	for(int j=4;j>=i;j--) {
		System.out.print(i+" ");
	}
	System.out.println();
	}
System.out.println();
for(char c1='a';c1<='e';c1++) {
	for(char c2='a';c2<=c1;c2++) {
		System.out.print(c2+" ");
	}
	System.out.println();
}
System.out.println();
for(char c1='a';c1<='e';c1++){
	for(char c2='e';c2>=c1;c2--) {
		System.out.print(c2+" ");
	}
	System.out.println();
	}
System.out.println();
int num=1;
for(int i=0;i<5;i++) {
	for(int j=0;j<=i;j++) {
		System.out.print(num+" ");
		num++;
	}
	System.out.println();
}
System.out.println();
int n=5;
for(int i=0;i<5;i++) {
	for(int j=0;j<=n-i;j++) {
		System.out.print("  ");
	}
	for(int k=0;k<=i;k++) {
		System.out.print("* ");
	}
	System.out.println();	
}
for(int i=0;i<5;i++) {
	for(int j=0;j<=n-i;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<=i;k++) {
		System.out.print("* ");
	}
	System.out.println();	
}
for(int i=0;i<5;i++) {
	for(int k=0;k<=i;k++) {
		System.out.print(" ");
	}for(int j=5;j>i;j--) {
		System.out.print(" *");
	}
	System.out.println();	
}
}
}

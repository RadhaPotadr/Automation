package day5.homework;

public class Multiples {

	//public static void main(String[] args) {
		/*int i,a=3 ;
		for(i=1;i<=10;i++) {
		int	multiple=a*i;
		//System.out.print(" "+multiple);
		}
        int j, b=300, count=0;
        for (j=1;j<=b;j++) {
        	int mul=j%4;
        	if(mul==0) {
        		System.out.print( "  "+j);
        		count++;
        	}
        }
        System.out.println();
        System.out.println(count);
	}

}*/
		int empId=25;
		public static void main(String[] args) {
			int age=30;
			System.out.println("I am local age: "+age);
			Multiples n1=new Multiples();
			n1.display();
		}
		void display() {
			int empId=45;
			System.out.println("I am local empId"+empId);
		}

	}

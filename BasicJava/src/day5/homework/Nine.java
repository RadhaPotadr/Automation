package day5.homework;

public class Nine {

	public static void main(String[] args) {
		positivenegative(7);
		positivenegative(-8);
		positivenegative(0);

	}
		static void positivenegative (int a) {
			if (a>0) {System.out.println("positive");
		}
			else if (a<0){System.out.println("negative");
			}
			else {System.out.println("zero");
			}
			}
}

package arrayhome;

public class Two {
	public static void main(String[] args) {
		int count=1;
		int frequency[]= {1,2,2,3,3,4,4,4};
		for(int i=0;i<frequency.length;i++) {
			for(int j=i+1;j<frequency.length;j++) {	
			if (frequency[j] == frequency[i]) {
				count++;
			}
			}System.out.println(frequency[i] + " has frequency :" +count);
			count=1;
		}
		
	}
}
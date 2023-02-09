package revision;

public class Duplicatestring {

	public static void main(String[] args) {
		String s= "i am radha living in ireland i am civil engineer and working in company";
			String splited []=s.split(" ");
		
		String result []= new String[splited.length];
		int count =0;
      for(int i=0;i<splited.length;i++) {
    	  for(int j=i+1;j<splited.length;j++) {
    		  if(splited[i].equals(splited[j])) {
    			  count++;
    			  result[j]="asdf";
    		  }
    		  
    	  }if(result[i]=="asdf") {
    		  System.out.println(splited [i]+" is duplicate");
    	  }
      }
	}
}

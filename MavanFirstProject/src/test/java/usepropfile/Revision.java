package usepropfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Revision {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis =new FileInputStream("D:\\Automation\\workspace\\MavanFirstProject\\Revision.properties");
Properties prop=new Properties();
prop.load(fis);
System.out.println(prop.getProperty("FirstName"));
FileOutputStream fos =new FileOutputStream("D:\\Automation\\workspace\\MavanFirstProject\\Revision.properties");
prop.setProperty("LastName", "Potdar");
prop.store(fos, "upadte");
}

}

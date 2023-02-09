package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autotesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement drop =driver.findElement(By.id("Skills"));
		Select skill = new Select(drop);
		System.out.println("select skills dropdown is multiple dropdown :"+skill.isMultiple());
		System.out.println("select skills dropdown has default status :"+skill.getFirstSelectedOption().getText());
		//System.out.println(drop.getText());
		List <WebElement> alloptions= skill.getOptions();
		System.out.println("number of options in dropdown : "+ alloptions.size());
		for(int i =1; i<alloptions.size();i++) {
			System.out.println("option number "+(i+1)+" is "+alloptions.get(i).getText());
		}
		//skill.selectByIndex(23);
		//System.out.println("select skills dropdown selected option is  :"+skill.getFirstSelectedOption().getText());
		//skill.selectByVisibleText("Systems Administration");
		//System.out.println("select skills dropdown selected option is  :"+skill.getFirstSelectedOption().getText());
		String expoptions="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
        String actualoptions="";
        for(int i =1; i<alloptions.size();i++) {
        	 if ((alloptions.size()-1)!=i) {
        	actualoptions=actualoptions+alloptions.get(i).getText()+", ";
        }
        	 else {
        		 actualoptions =actualoptions+alloptions.get(i).getText();
        	 }
        }
		System.out.println("actualoptions: "+actualoptions);
		System.out.println("expoptions: "+expoptions);
		System.out.println("status of all options : "+ actualoptions.equals(expoptions));

	}

}

package wbDDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class trial {
	String url;
	String Username;
	String pwd;
	String exptitle;
  @Test(priority=2)
  public void positive() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  FileInputStream fis=new FileInputStream("D:\\Automation\\workspace\\MavanFirstProject\\src\\test\\resources\\excel\\new.xlsx");
	  Workbook wb= new XSSFWorkbook(fis);
	  String sheetname=wb.getSheetName(0);
	  Sheet sh=wb.getSheet(sheetname);
	  int rowcount=sh.getLastRowNum();
	  for(int i=1;i<rowcount;i++) {
		  Row row=sh.getRow(i);
	  url=row.getCell(0).getStringCellValue();
	  Username =row.getCell(1).getStringCellValue();
	  pwd=row.getCell(2).getStringCellValue();
	  exptitle =row.getCell(3).getStringCellValue();
	  driver.get(url);
	  driver.findElement(By.id("username")).sendKeys(Username);
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
	  driver.findElement(By.id("loginButton")).click();
	  WebDriverWait wait = new WebDriverWait (driver,20);
	  
	  if(wait.until(ExpectedConditions.titleIs(exptitle))) {
		 System.out.println( driver.getTitle());
		 Cell cell1=row.createCell(4);
			cell1.setCellValue(driver.getTitle());
			Cell cell=row.createCell(5);
			cell.setCellValue("Passed");
			FileOutputStream fos=new FileOutputStream("D:\\Automation\\workspace\\MavanFirstProject\\src\\test\\resources\\excel\\new.xlsx");
			wb.write(fos);
			fos.close();
	  }
	  else {
		  Cell cell1=row.createCell(4);
			cell1.setCellValue(driver.getTitle());
			Cell cell=row.createCell(5);
			cell.setCellValue("failed");
			FileOutputStream fos=new FileOutputStream("D:\\Automation\\workspace\\MavanFirstProject\\src\\test\\resources\\excel\\new.xlsx");
			wb.write(fos);
			fos.close();
	  }
	  driver.close();}
  }
	  @Test(priority=1)
	  public void negative() throws IOException {
		  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\workspace\\seleniumlessons\\drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  FileInputStream fis=new FileInputStream("D:\\Automation\\workspace\\MavanFirstProject\\src\\test\\resources\\excel\\new.xlsx");
		  Workbook wb= new XSSFWorkbook(fis);
		  String sheetname=wb.getSheetName(0);
		  Sheet sh=wb.getSheet(sheetname);
		  int rowcount=sh.getLastRowNum();
			  Row row=sh.getRow(2);
		  url=row.getCell(0).getStringCellValue();
		  Username =row.getCell(1).getStringCellValue();
		  pwd=row.getCell(2).getStringCellValue();
		  exptitle =row.getCell(3).getStringCellValue();
		  driver.get(url);
		  driver.findElement(By.id("username")).sendKeys(Username);
		  driver.findElement(By.name("pwd")).sendKeys(pwd);
		  driver.findElement(By.id("loginButton")).click();
		  WebDriverWait wait = new WebDriverWait (driver,20);
		  
		  if(wait.until(ExpectedConditions.titleIs(exptitle))) {
			 System.out.println( driver.getTitle());
			 Cell cell1=row.createCell(4);
				cell1.setCellValue(driver.getTitle());
				Cell cell=row.createCell(5);
				cell.setCellValue("Passed");
				FileOutputStream fos=new FileOutputStream("D:\\Automation\\workspace\\MavanFirstProject\\src\\test\\resources\\excel\\new.xlsx");
				wb.write(fos);
				fos.close();
		  }
		  else {
			  Cell cell1=row.createCell(4);
				cell1.setCellValue(driver.getTitle());
				Cell cell=row.createCell(5);
				cell.setCellValue("failed");
				FileOutputStream fos=new FileOutputStream("D:\\Automation\\workspace\\MavanFirstProject\\src\\test\\resources\\excel\\new.xlsx");
				wb.write(fos);
				fos.close();
		  }
		  driver.close();
	  }
}

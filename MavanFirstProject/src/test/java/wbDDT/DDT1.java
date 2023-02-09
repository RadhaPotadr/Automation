package wbDDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DDT1 {
  @Test(priority=1)
  public void sheet() throws IOException {
	  FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\excel\\DDT.xlsx");
	  Workbook workbook = new XSSFWorkbook(fis);
	  System.out.println(workbook.getNumberOfSheets());
	  for(int i=0;i<workbook.getNumberOfSheets();i++) {
		  System.out.println(workbook.getSheetName(i));
	  } 
	  Sheet sheet =  workbook.getSheet("Sheet2");
	 // workbook.createSheet("Sheet3");
	  //workbook.removeSheetAt(3);
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\excel\\DDT.xlsx");
		workbook.write(fos);
		fos.flush();
		fos.close();
	  System.out.println("*******************************");
  }
  @Test(priority=2)
  public void row() throws IOException {
	  FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\excel\\DDT.xlsx");
	  Workbook workbook = new XSSFWorkbook(fis);
	  Sheet sheet =  workbook.getSheet("Sheet2");
	  System.out.println(sheet.getLastRowNum());
	 int rowcount=sheet.getLastRowNum(); 
	 //sheet.createRow(5);
	 Row row=sheet.getRow(rowcount);
	// sheet.removeRow(row);
	 FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\excel\\DDT.xlsx");
		workbook.write(fos);
		fos.flush();
		fos.close();
	 System.out.println(sheet.getLastRowNum());
	 System.out.println("*******************************");
  }
  @Test(priority=3)
  public void cell() throws IOException {
	  FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\excel\\DDT.xlsx");
	  Workbook workbook = new XSSFWorkbook(fis);
	  Sheet sheet =  workbook.getSheet("Sheet2");
	  Row row=sheet.getRow(4);
	  System.out.println(row.getLastCellNum());
	  for(int i=0;i<row.getLastCellNum();i++) {
		  System.out.println(row.getCell(i));
	  } 
	  Row row1=sheet.getRow(4);
	  Cell cell=row1.createCell(2);
		cell.setCellValue(2014);
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\excel\\DDT.xlsx");
		workbook.write(fos);
		fos.flush();
		fos.close();
	  
	  System.out.println("*******************************");
  }
  @Test(priority=4)
  public void value() throws IOException {
	  FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\excel\\DDT.xlsx");
	  Workbook workbook = new XSSFWorkbook(fis);
	  Sheet sheet =  workbook.getSheet("Sheet2");
	  Row row=sheet.getRow(4);
	  for(int i=0;i<row.getLastCellNum();i++) {
			//System.out.println("Cell data: "+row.getCell(i).getStringCellValue());				
			Cell cell=row.getCell(i);
			switch(cell.getCellType()) {				
				case(Cell.CELL_TYPE_STRING): 
					System.out.println("Cell Data: "+cell.getStringCellValue());
					break;
				case(Cell.CELL_TYPE_NUMERIC): 
					System.out.println("Cell Data: "+cell.getNumericCellValue());
					break;
				case(Cell.CELL_TYPE_BOOLEAN): 
					System.out.println("Cell Data: "+cell.getBooleanCellValue());
					break;
				default:
					System.out.println("Invalid cell details");
					break;
			}				
		}
}
  }  


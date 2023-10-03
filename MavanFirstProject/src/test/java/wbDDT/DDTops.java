 package wbDDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DDTops {
	/**
	 1. Excel file location with file name ---> FileInputStream
		1.1 Workbook ---> Define the excel type WorkBook ---> XSSFWorkbook
	2. Sheet name --> 						Sheet	 ---> XSSFSheet
	3. Row		  -->						Row		 ---> XSSFRow
	4. Coloun 	  --> 						Cell	 ---> XSSFCell
	 * @throws IOException 
	 */	
	@Test
	public void sheetOps() throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\TestData.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook();
				//OR
		Workbook workbook=new XSSFWorkbook(fis);
		//get the total sheet count from excel
		int sheetCt=workbook.getNumberOfSheets();
		System.out.println("Sheet count is: "+sheetCt);
		//print all sheet names
		for(int i=0;i<sheetCt;i++) {
//			Sheet sheet=workbook.getSheetAt(i);
//			String sheetName=sheet.getSheetName();
//			System.out.println("Sheet name is :"+sheetName);
						//or
			System.out.println("Sheet name is :"+workbook.getSheetAt(i).getSheetName());
		}
	}
	
	@Test
	public void RowOps() throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\TestData.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook();
				//OR
		Workbook workbook=new XSSFWorkbook(fis);
		//get the required sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		//print row count in current sheet
		int rowCt=sheet.getLastRowNum();
		System.out.println("Row count is: "+rowCt);
		//get specified row
		Row row=sheet.getRow(1);
	}
	@Test
	public void CellOps() throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\TestData.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook();
				//OR
		Workbook workbook=new XSSFWorkbook(fis);
		//get the required sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		//get specified row
		Row row=sheet.getRow(1);
		//get cell count on a particular row
		int cellCt=row.getLastCellNum();
		System.out.println("Cell count on row 1: "+cellCt);
		//print all cell data present in 1st row
		for(int i=0;i<cellCt;i++) {
			//get particular cell from the row
			Cell cell=row.getCell(i);
			String value=cell.getStringCellValue();
					//or
			System.out.println(row.getCell(i).getStringCellValue());
		}
		System.out.println("**********************************");
		//print each row cell count
		for(int i=0;i<sheet.getLastRowNum();i++) {
			Row r=sheet.getRow(i);
			System.out.println("cell count on Row "+i+": "+r.getLastCellNum());
		}
	}
	@Test
	public void CellOps2() throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testData\\TestData.xlsx");
		//XSSFWorkbook workbook=new XSSFWorkbook();
				//OR
		Workbook workbook=new XSSFWorkbook(fis);
		//get the required sheet
		Sheet sheet=workbook.getSheet("Sheet1");
		//get specified row
		Row row=sheet.getRow(3);
		//get cell count on a particular row
		int cellCt=row.getLastCellNum();
		System.out.println("Cell count on row 1: "+cellCt);
		//print all cell data present in 1st row
		for(int i=0;i<cellCt;i++) {
			//get particular cell from the row
			Cell cell=row.getCell(i);
			switch(cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			default:
				System.out.println("No valid input");
			}
		}		
	}
	
	@Test
	public void readComppleteSheetData() {
		//TODO: 
	}
}

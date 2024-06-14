package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
	
	@Test
	public void readdata() throws IOException {
		
	/*	File src = new File(System.getProperty("user.dir")+"/excel data/users.xlsx");
		
		FileInputStream file = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("users");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		System.out.println("cell value "+ cell.getStringCellValue());
		
		wb.close(); */
		
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/excel data/users.xlsx")));
		
		XSSFSheet sheet = wb.getSheet("users");
		
		int row = sheet.getPhysicalNumberOfRows();
		
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0; i< row;i++) {
			
			for (int j = 0; j < cell; j++) {
				
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				
			}
			
		}
		
		
	}
	

}

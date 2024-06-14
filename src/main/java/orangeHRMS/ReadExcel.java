package orangeHRMS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {
	
	XSSFWorkbook wb =null;
	
	public ReadExcel() {
		
		 try {
			 //abc
			wb = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/excel data/users.xlsx")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	public int getRow(String sheetname) {
		return wb.getSheet(sheetname).getPhysicalNumberOfRows();
	}
	
	public int getColumn(String sheetname) {
		return wb.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();
	}
	
	public int getColumn(String sheetname,int row) {
		return wb.getSheet(sheetname).getRow(row).getPhysicalNumberOfCells();
	}
	
	public String getData(String sheetname,int row, int column) {
		
		String data ="";
		
		XSSFCell cell = wb.getSheet(sheetname).getRow(row).getCell(column);
		
		if(cell.getCellType()==CellType.STRING)

		{
			data = cell.getStringCellValue();
		}
		else if (cell.getCellType()==CellType.NUMERIC)

		{
			data = String.valueOf(cell.getNumericCellValue());
		}
		
		else if (cell.getCellType()==CellType.BLANK)

		{
			data = "";
		}
		
		return data;
		
	}

}

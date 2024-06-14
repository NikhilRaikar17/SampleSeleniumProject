package practice;

import org.testng.annotations.Test;

import orangeHRMS.ReadExcel;

public class ReadDataFromExcel {
	
	@Test
	public void readData() {
		
		ReadExcel data = new ReadExcel();
		
		int rows = data.getRow("users");
		
		int column = data.getColumn("users");
		
		Object[][] arr = new Object[rows][column];
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < column; j++) {
				
				arr[i][j] = data.getData("users", i, j);
				System.out.println("data::"+ arr[i][j]);
			}
		}
		
		
	}

}

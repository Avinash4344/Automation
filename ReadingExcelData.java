package AutomationPractise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rows =sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("no of rows:"+ rows);
		System.out.println("no of rows:" + cells);
		
		for(int r=0;r<=rows;r++) {
			
			XSSFRow currentrow = sheet.getRow(r);
			for(int c=0; c<cells;c++) {
				
			XSSFCell currentcell = currentrow.getCell(c);
			
			System.out.print(currentcell.toString() + "\t");
			
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
	}

}

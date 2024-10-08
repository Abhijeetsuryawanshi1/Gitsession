package sellenumLearning;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWork {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Test Data\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		//XSSFSheet sheet = workBook.getSheetAt(0);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int totalRows = sheet.getLastRowNum();
		int totalcells = sheet.getRow(1).getLastCellNum();
		System.out.println(totalRows+" -> "+totalcells);
		
		for(int i=0; i<=totalRows; i++) {
			XSSFRow currentRow = sheet.getRow(i);
			for(int j=0; j<totalcells; j++) {
				XSSFCell cell = currentRow.getCell(j);
			    System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workBook.close();
	}

}

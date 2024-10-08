package Readingdatainxlfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practiceset {

	public static void main(String[] args) throws IOException {

		String baseDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(baseDir + "/Test Data/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int totalrow = sheet.getLastRowNum();
		int totalcell = sheet.getRow(0).getLastCellNum();

		System.out.println(totalrow);
		System.out.println(totalcell);

		for (int r = 0; r < totalrow; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c < totalcell; c++) {
				XSSFCell cell = row.getCell(c);
				System.out.println(cell);
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
	}

}

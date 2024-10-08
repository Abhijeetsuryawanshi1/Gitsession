package sellenumLearning;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteWork {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test Data\\TestData1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("Automation");
		row1.createCell(3).setCellValue(true);
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Java");
		row2.createCell(1).setCellValue(6789);
		row2.createCell(2).setCellValue("Manual");
		row2.createCell(3).setCellValue(false);
		
		workBook.write(file);
		workBook.close();
		file.close();
	}

}

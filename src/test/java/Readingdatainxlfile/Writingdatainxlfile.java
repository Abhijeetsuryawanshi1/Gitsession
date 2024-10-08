package Readingdatainxlfile;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdatainxlfile {

	public static void main(String[] args) throws IOException {
		//open file in writing mode if file is not exist then it will create new file using fileoutputstream object
		
           FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Test Data\\MyFile1.xlsx");
             XSSFWorkbook workbook=new XSSFWorkbook();
             XSSFSheet sheet=workbook.createSheet("data");
             
             XSSFRow row1=sheet.createRow(0);
             row1.createCell(0).setCellValue("java");
             row1.createCell(1).setCellValue("1234");
             row1.createCell(2).setCellValue("automation");
             
             XSSFRow row2=sheet.createRow(1);
             row2.createCell(0).setCellValue("python");
             row2.createCell(1).setCellValue("12345");
             row2.createCell(2).setCellValue("automation");
             
             XSSFRow row3=sheet.createRow(2);
             row3.createCell(0).setCellValue("c#");
             row3.createCell(1).setCellValue("123456");
             row3.createCell(2).setCellValue("automation");
             
             workbook.write(file);
             workbook.close();
             System.out.println("file is created");
	}
	

}

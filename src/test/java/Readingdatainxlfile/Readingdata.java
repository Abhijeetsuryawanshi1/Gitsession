package Readingdatainxlfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdata {

	public static void main(String[] args) throws IOException {
		
//		FileInputStream file=new FileInputStream("C:\\Users\\abhij\\eclipse-workspace\\sellenumLearning\\Test Data\\TestData.xlsx");
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Test Data\\TestData.xlsx");
		
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        
        int totalrows=sheet.getLastRowNum();
        int totalcell=sheet.getRow(0).getLastCellNum();
        
        System.out.println(totalrows);   //5  rows counting from 0
        System.out.println(totalcell);   //4  cells counting from 1
        
     //  now read the data
        
        for(int r=0;r<=totalrows;r++) {              //outer for loop for Row
        	  XSSFRow currentrow=sheet.getRow(r);
        	
        	for(int c=0;c<totalcell;c++) {          // inner for loop is for cell/column
        		XSSFCell cell= currentrow.getCell(c);
          System.out.print(cell.toString()+"\t"); 		
        }
        System.out.println();	
      } 
        workbook.close();
        file.close();
	}

}

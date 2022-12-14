package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 

{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		File myFile= new File("F:\\Selenium\\New Microsoft Excel Worksheet.xlsx");
		
		  String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
				System.out.println(value1);
				
		  double value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
				System.out.println(value2);

		  boolean value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
				System.out.println(value3);

	}

}

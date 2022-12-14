package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile= new File("F:\\Selenium\\New Microsoft Excel Worksheet.xlsx");
		
		Workbook myworkbook = WorkbookFactory.create(myFile);
		
		Sheet mysheet = myworkbook.getSheet("Sheet1");
		
		Row myrow = mysheet.getRow(0);
		
		Cell myCell = myrow.getCell(3);
		
		CellType myType = myCell.getCellType();
		
		System.out.println(myType);
		
		String value = myCell.getStringCellValue();
		
		System.out.println(value);


	}

}

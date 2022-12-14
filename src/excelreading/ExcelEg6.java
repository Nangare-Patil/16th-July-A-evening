package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 

{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile= new File("F:\\Selenium\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		int totalnumofrows = mysheet.getLastRowNum();
		
		int totalnumofcell = mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalnumofrows;i++)
		{
			for(int j=0;j<=totalnumofcell;j++)
			{
				CellType datatype = mysheet.getRow(i).getCell(j).getCellType();
				if(datatype==CellType.STRING)
				{
					String value = mysheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					 double value = mysheet.getRow(i).getCell(j).getNumericCellValue();
					 System.out.print(value+" ");
				}
				else if(datatype==CellType.BLANK)
				{
					System.out.println();
				}
				
				else if(datatype==CellType.BOOLEAN)
				{
					  boolean value = mysheet.getRow(i).getCell(j).getBooleanCellValue();
					 System.out.print(value+" ");
				}
				System.out.println();
			}
			
		}

	}

}

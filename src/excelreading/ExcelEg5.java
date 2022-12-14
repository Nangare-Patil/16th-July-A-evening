package excelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		File myFile= new File("F:\\Selenium\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		int lastrownum = mysheet.getLastRowNum();
		
		System.out.println("Last Row Number Is "+lastrownum);  //last row number 
		
		int totalnumrow = lastrownum;
		
		System.out.println("Total Number of Rows Are "+totalnumrow); //total rows=last rows number
		
		short lastcellnum = mysheet.getRow(0).getLastCellNum();
		
		System.out.println("Last cell Number Is "+lastcellnum); //practically Answer

		int totalnumofcell = lastcellnum-1;
		
		System.out.println("Total Number of cell is "+totalnumofcell); //language based answer
		
		for(int i=0;i<=totalnumrow;i++)
		{
			for(int j=0;j<=totalnumofcell;j++)
			{
				System.out.print(mysheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}	
			
			
			
			
			
			
			
			
			
			
	}

}

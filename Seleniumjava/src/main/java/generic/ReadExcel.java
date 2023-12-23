package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameworkConstants{
 
  public static final File f= new File(EXCEL_PATH);
	
  
  public static Object[][] getMultipleData(String sheetName) throws Throwable, IOException{
	FileInputStream fis= new FileInputStream("f");
	Workbook books=WorkbookFactory.create(fis);
//	Workbook book = new WorkbookFactory.create(fis);
	Sheet sheet = books.getSheet(sheetName);
	int rowCount = sheet.getPhysicalNumberOfRows();
	int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
	Object[][] data=new Object[rowCount][colCount];
	
	
	
	for(int r=0; r<=rowCount;r++) {
		Row row = sheet.getRow(r);
		for(int c=0;c<row.getLastCellNum();c++) 
		{
			data[r][c]=row.getCell(c).getStringCellValue();
		}
	}
	  
	  return data; 
	  
  }
  
}

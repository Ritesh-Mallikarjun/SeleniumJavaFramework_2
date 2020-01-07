package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String path,String sheetName) 
	{
		try {
			workbook =new XSSFWorkbook(path);
			sheet = workbook.getSheet(sheetName);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		getRowCount();
		getColCount();
		getCellStringData(1,0);
		getCellNumericData(2,1); 

	}
	// row count
	public static int getRowCount() 
	{
		int count=0;
		try{
			count=sheet.getPhysicalNumberOfRows();
			System.out.println("no of row count: "+ count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	//column count
	public static int getColCount() 
	{
		int count=0;
		try{
			count=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("no of column count: "+ count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	//get cell data
	public static String getCellStringData(int rowNum,int colNum) 
	{
		String row=null;
		try{
			row =sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println("what's present in a row "+rowNum+": "+ row);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return row;

	}
	public static void getCellNumericData(int rowNum,int colNum) 
	{
		try{
			double row =sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("what's present in a row "+rowNum+": "+ row);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}

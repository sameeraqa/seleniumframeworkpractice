package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	static String path;
    static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtil(String excelPath, String sheetName) {
		try {
			path = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getRowCount();
		getCellData(0,0);
		getCellDataNumber(1,1);
	}
	
	public static int getRowCount() {
		
		int rowCount = 0;
		
		try {
			rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("rowcount:" + rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount; 

	}	
	public static int getColumnCount() {

		int columnCount = 0;
		try {
			columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("rowcount:" + columnCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return columnCount;

	}
	
	public static String getCellData(int rowNum, int columnNum) {

		String celldata = null;
				
		try {
			celldata=sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			System.out.println(celldata);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return celldata;

	}
	
	public static void getCellDataNumber(int rowNum,int columnNum) {
		
			double celldata = sheet.getRow(rowNum).getCell(rowNum).getNumericCellValue();
			System.out.println(celldata);

	}

	}



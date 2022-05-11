package util;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		ExcelUtil util =new ExcelUtil(path + "/Excel/Data.xlsx", "Sheet1");
		util.getCellData(0, 0);
		util.getRowCount();
		util.getCellDataNumber(1, 1);
		
		
	}

}

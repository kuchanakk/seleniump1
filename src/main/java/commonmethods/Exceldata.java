package commonmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	static String path = ("user.dir")+"\\src\\test\\resource\\testdata.xlsx";
	
	public static String readata(int row , int clm) throws IOException {
		
		FileInputStream fis = new  FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String val1=wb.getSheet("Sheet7").getRow(row).getCell(clm).getStringCellValue();
		
		return val1;
		
		
	}
	
	
	public static void writedata(int row , int clm , String value) throws IOException {
		
		FileInputStream fis = new  FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet7").getRow(row).createCell(clm).setCellValue(value);
		FileOutputStream fop = new FileOutputStream(path);
		
		wb.write(fop);
		fop.close();
		
		
		
	}
	
	
	
	
}

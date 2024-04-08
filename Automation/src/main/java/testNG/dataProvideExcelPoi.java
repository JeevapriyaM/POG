package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;


public class dataProvideExcelPoi {
	
	public void exceldata() throws IOException
	{
		FileInputStream filevalue=new FileInputStream("C:\\Users\\j_mahendran\\OneDrive - INFOTEL CONSEIL\\TestData.xls");
		Workbook wbook=new HSSFWorkbook(filevalue);
		Sheet sh=wbook.getSheetAt(0);
		
	}

}

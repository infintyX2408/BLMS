package genericUtility_BLMS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String getDataFromExcel(int rowNo, int columnNo, String Sheetname) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(Sheetname);
		String data = s.getRow(rowNo).getCell(columnNo).getStringCellValue();
		wb.close();
		return data;
	}

	public void setDataIntoExcel(int rowNo, int columnNo, String Sheetname, String data) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(Sheetname);
		s.getRow(rowNo).createCell(columnNo).setCellValue(data);
		FileOutputStream fos = new FileOutputStream("");
		wb.write(fos);
		wb.close();
	}
}

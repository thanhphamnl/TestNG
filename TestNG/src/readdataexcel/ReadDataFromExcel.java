package readdataexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String args[]) throws FileNotFoundException {
		// Load the file
		FileInputStream fis;
		try {

			fis = new FileInputStream("Resources\\Excel\\Testdata.xlsx");
			System.out.println("Read excel file");

			// Load the Workbook
			Workbook wb = WorkbookFactory.create(fis);
			// Workbook wb = new XSSFWorkbook(fis);
			System.out.println("Loaded the Workbook");

			// Load Sheet
			org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
			System.out.println("Loaded the Sheet1");

			// Specify which row you want to read
			Row rw = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(0);
			// System.out.println("getRow(0)");

			// Specify which cell want to read and which data type
			Cell cel = rw.getCell(0);
			// System.out.println("rw.getCell(0)");

			String st = cel.getStringCellValue();
			System.out.println("Username is " + st);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package readdataexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		// Load the file
		FileInputStream fis;
		try {
			fis = new FileInputStream("Resources\\Excel\\Testdata.xlsx");
			// Load the Workbook
			Workbook wb = WorkbookFactory.create(fis);
			// Load Sheet
			Sheet sh = wb.getSheet("Sheet1");
			// Specify which row you want to read
			Row rw = sh.getRow(3);
			// Specify which row want to read and which data type
			Cell cel = rw.getCell(3);
			cel.setCellValue("John");
			// Write the output to a file
			FileOutputStream fout = new FileOutputStream("Resources\\Excel\\Testdata.xlsx");
			wb.write(fout);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

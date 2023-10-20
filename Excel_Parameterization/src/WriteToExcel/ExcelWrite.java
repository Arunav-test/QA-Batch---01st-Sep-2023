package WriteToExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelWrite {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Workbook wb = new HSSFWorkbook();
		Sheet s1 = wb.createSheet("SHEET A");
		Sheet s2 = wb.createSheet("SHEET B");
		Row r0 = s1.createRow(0);
		Row r1 = s1.createRow(1);
		Row r2 = s1.createRow(2);
		Row r3 = s1.createRow(3);
		Row r4 = s1.createRow(4);
		
		Cell c0 = r0.createCell(2);
		Cell c1 = r1.createCell(2);
		Cell c2 = r2.createCell(2);
		Cell c3 = r3.createCell(2);
		Cell c4 = r4.createCell(2);
		
		c0.setCellValue("test 1");
		c1.setCellValue("test 2");
		c2.setCellValue("test 3");
		c3.setCellValue("test 4");
		c4.setCellValue("test 5");
		
		
		
		try  (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA Batch - 01st Sep 2023\\Excel_Parameterization\\src\\TestData\\Sample.xls")) {
		    wb.write(fileOut);
		}

	}

}

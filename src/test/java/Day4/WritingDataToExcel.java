package Day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataToExcel {

	public static void main(String[] args) throws IOException {
FileInputStream ip=new FileInputStream("./Demo.xlsx");
		
		//establish ref of Xssworkbook
		XSSFWorkbook wb=new XSSFWorkbook(ip);
		
		//create sheet obj of xssfsheet
				XSSFSheet sh=wb.getSheet("TestData");
				
				sh.getRow(1).createCell(3).setCellValue("pass");
				
				FileOutputStream out=new FileOutputStream("./Demo.xlsx");
				wb.write(out);
				System.out.println("Writing is done....");
				wb.close();
				
				

	}

}

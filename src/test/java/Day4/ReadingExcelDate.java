package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelDate {

	public static void main(String[] args) throws IOException {
		
		// Establish IO Stream connection with excel file
		FileInputStream ip=new FileInputStream("./Demo.xlsx");
		
		//establish ref of Xssworkbook
		XSSFWorkbook wb=new XSSFWorkbook(ip);
		
		//create sheet obj of xssfsheet
		XSSFSheet sh=wb.getSheet("TestData");
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(2).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(2).getStringCellValue());
		
		int rowno=sh.getPhysicalNumberOfRows();
		int colno=sh.getRow(1).getPhysicalNumberOfCells();
		System.out.println("Row Count:"+rowno);
		System.out.println("col Count:"+colno);
		
		for(int i=0;i<rowno;i++)
		{
			for(int j=0;j<colno;j++)
			{
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue()+" ");
			}
		}
		System.out.println();
		

	}

}

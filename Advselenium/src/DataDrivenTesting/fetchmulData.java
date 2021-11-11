package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class fetchmulData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/excel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("sheet1");
	//int rowcount = sh.getLastRowNum()-sh.getFirstRowNum();
	for(int i=0;i<=sh.getLastRowNum();i++)
	{
		Row r = sh.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++)
		{
			System.out.print(r.getCell(j).getStringCellValue()+"   __  ");
		}
		System.out.println();
	}
	}

}

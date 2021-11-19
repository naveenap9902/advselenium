package com.crm.comcast.generalUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author NAVEEN PATIL
 *
 */
public class ExcelFileUtility2 
{
	/**
	 * 
	 * @param sheet enter the sheet name as in excel
	 * @param row  enter the row from which you want to fetch data
	 * @param cell enter the cell index to fetch data
	 * @return the string value at given index
	 * @throws Throwable
	 */
	public String getData1(String sheet1,int row,int cell) throws Throwable
	{
		String val=" ";
		FileInputStream fis=new FileInputStream("./data/tigerData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet1).getRow(row).getCell(cell);
		val=c.toString();
		return val;
	}
	/**
	 * 
	 * @param Sheet specify sheet name
	 * @param row specify the row index
	 * @param cell specify the index of cell
	 * @param val set the value at given index
	 * @throws Throwable
	 */
	public void createData(String Sheet,int row,int cell,String val) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data/tigerData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell ce = wb.getSheet(Sheet).getRow(row).createCell(cell);
		ce.setCellValue(val);
		FileOutputStream fout=new FileOutputStream("./data/tigerData.xlsx");
		wb.write(fout);
		System.out.println("data is written");	
	}
}
	


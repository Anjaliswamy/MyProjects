package datadrivenfrmwrk;
import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadData {

	public static void main(String[] args) throws BiffException, IOException {
		//to specify path of file	
		File fi= new File("G:\\Testdata.xls");
		//to get workbook
		Workbook wb= Workbook.getWorkbook(fi);
		//to specify worksheet
		Sheet ws=wb.getSheet("Students");
		//to find number of rows data availability
		System.out.println("Number of Rows data availability is: "+ws.getRows());
		//to find number of columns data availability
		System.out.println("number of columns is: "+ws.getColumns());
		
		for (int i=0; i < ws.getRows();i++){
			for (int j=0; j< ws.getColumns(); j++){
				System.out.print(ws.getCell(j,i).getContents()+"----------");
			}
			System.out.println();
		}
wb.close();
	}

}
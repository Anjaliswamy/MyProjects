package datadrivenfrmwrk;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Logindata {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File mt=new File("G:\\Mtlogindata1.xls");
		//to create workbook
		WritableWorkbook wb=Workbook.createWorkbook(mt);
		//to create sheet
		WritableSheet ws=wb.createSheet("logindata", 0);
		//to assign values label(col,row,value0
		Label Cell1=new Label(0,0,"username");
		ws.addCell(Cell1);
		Label Cell2=new Label(1,0,"password");
		ws.addCell(Cell2);
		Label Cell3=new Label(0,1,"mercury");
		ws.addCell(Cell3);
		Label Cell4=new Label(1,1,"mercury");
		ws.addCell(Cell4);
		Label Cell5=new Label(0,2,"mercury");
		ws.addCell(Cell5);
		Label Cell6=new Label(1,2,"mercury");
		ws.addCell(Cell6);
		
		wb.write();
		wb.close();
	}

}

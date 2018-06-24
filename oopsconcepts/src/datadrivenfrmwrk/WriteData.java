package datadrivenfrmwrk;
import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;


public class WriteData {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
	//to specify path of file	
	File fo= new File("G:\\Testdata.xls");
	//to create workbook
	WritableWorkbook wb=Workbook.createWorkbook(fo);
	//to specify & to rename worksheet
	WritableSheet ws=wb.createSheet("Students", 0);
	//to assign value Label(col, row, data)
	Label cell1= new Label(0,0,"Name");
	ws.addCell(cell1);
	
	Label cell2= new Label(1,0,"Course");
	ws.addCell(cell2);
	
	Label cell3= new Label(0,1,"Bhargavi");
	ws.addCell(cell3);
	
	Label cell4= new Label(1,1,"QTP");
	ws.addCell(cell4);
	
	Label cell5= new Label(0,2,"Yamini");
	ws.addCell(cell5);
	
	Label cell6= new Label(1,2,"Selenium");
	ws.addCell(cell6);
	
	Label cell7= new Label(0,3,"Nikhitha");
	ws.addCell(cell7);
	Label cell8= new Label(1,3,"Soapui Testing");
	ws.addCell(cell8);
	
	wb.write();
	wb.close();
	}



	
		

	}


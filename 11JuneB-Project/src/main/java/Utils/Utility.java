package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
	
	public static void CaptureSS (WebDriver driver,String ID ) throws IOException {
		    Date date = new Date();
		    SimpleDateFormat df = new SimpleDateFormat("MM-dd-yy & hh-mm-ss");
		    String dateformat = df.format(date);
			
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    String s = RandomString.make(3);
		    File dest = new File("C:\\Users\\Ajinkya\\Documents\\Screen Shot\\Test"+ID+dateformat+".jpg");
			FileHandler.copy(src, dest); 		
	}
	
	public static String FetchDataFromExcel(String sheet,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Ajinkya\\Documents\\Excel\\Parameter.xlsx");
		Cell Value = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell);
		
		DataFormatter dataformat = new DataFormatter();
		String data;
		try {
			data= dataformat.formatCellValue(Value);
		}
		catch(Exception e) {
			data="";
		}
		return data;
		
	}

}

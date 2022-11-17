package ExelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExelRowandColoumn {
	@Test
	public void operation() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\sures\\OneDrive\\Desktop\\Demo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r = ws.createRow(1);
		for(int i=0;i<10;i++)
		{
			r.createCell(i).setCellValue(i);
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sures\\OneDrive\\Desktop\\Demo.xlsx");
		wb.write(fos);
	}

}

package WithoutPageFactory;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelData implements Values {
	
	public static String fetchdata(String path,String sheet,int row,int cell) throws Exception {	
	FileInputStream file = new FileInputStream(excelfilepath);
	HSSFWorkbook wb=new HSSFWorkbook(file);
	String store=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return store;
}
}
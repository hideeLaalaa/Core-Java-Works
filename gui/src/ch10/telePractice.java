package ch10;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class telePractice {

	public static void main(String[] args) throws IOException{
		
		String filePath = "C:\\Users\\olatoyosi\\Desktop\\telemetry.xlsx";
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.createSheet("Telemetrysheet");
		
		Object[][]  countryData= {
                {"SNo", "Country", "Capital", "Currency"},
                {"1", "India", "Delhi", "Indian Rupee"},
                {"2", "France", "Paris", "Euro"},
                {"3", "USA", "NewYork", "Dollar"},
                {"4", "Australia", "Canberra", "Australian dollar"},
                {"5", "Japan", "Tokyo", "Japanese yen"},
                {"6", "Russia", "Moscow", "Ruble"}
        };
		
		int rowCount = 0;
		for(Object[] arrayData : countryData){
			Row row = sheet.createRow(rowCount++);
			int columnCount =0;
			for(Object obj : arrayData){
				Cell cell = row.createCell(columnCount++);
				if(obj instanceof String){
					cell.setCellValue((String)obj);
				}else if(obj instanceof Integer){
					cell.setCellValue((Integer)obj);
				}
			}
		}
		
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		fos.close();
		System.out.println("Excellently written");

	}

}

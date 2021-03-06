package objectOriented;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class telemetry {
	
	static Row row;
	static int col,rowNo=0;
	
	public static void main(String[] args) throws IOException {		
		
		
		String filePath = "C:\\Users\\olatoyosi\\Desktop\\inflow.xlsx";
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("TelePract");
			
		
		//WRITING IDU AND PANELS SERIALS
		
		Scanner panels = new Scanner (new File("C:\\Users\\olatoyosi\\Documents\\HERB\\workspace\\gui\\src\\ch10\\panels.txt"));
		
		while(panels.hasNext()){
			
			row = sheet.createRow(rowNo++);
			int noOfPanels=1,x=0;
			Scanner tele = new Scanner (new File("C:\\Users\\olatoyosi\\Documents\\HERB\\workspace\\gui\\src\\ch10\\tele.txt"));
			while(tele.hasNext()&&panels.hasNext()){
					
				Cell cell = row.createCell(x);
				String idu = tele.nextLine();
				String panel = panels.nextLine();
				cell.setCellValue(String.format("%d: %s & %s",noOfPanels,idu,panel));
				System.out.printf("%d: %s & %s\t\t\t\t\t",noOfPanels++,idu,panel);
					x+=5;
				if(noOfPanels==56)
					break;
				}
				System.out.println();
				
				
				//WRITING TELEMETRY LABELS
				row=sheet.createRow(rowNo++);
				x=0;
				for(int i=1;i<noOfPanels;i++){
					Cell cell = row.createCell(x++);
					cell.setCellValue("SOC (%)");
					cell=row.createCell(x);
					cell.setCellValue("Telementry Reading");
					x+=4;
					System.out.print("SOC (%)\tTelementry Reading\t\t\t\t");
				}
				System.out.println();
				
				row=sheet.createRow(rowNo++);
				x=1;
				for(int i=1;i<noOfPanels;i++){
					Cell cell = row.createCell(x++);
					cell.setCellValue("Panel Current");
					cell = row.createCell(x++);
					cell.setCellValue("Panel Voltage");
					cell = row.createCell(x);
					cell.setCellValue("Panel Power");
					x+=3;
					System.out.print("\tPanel Current\tPanel Voltage\tPanel Power\t\t");
				}
				
				System.out.println();
				
				//INITIALIZING THE NUMBER OF PANELS
				panels[] solarP = new panels[noOfPanels]; 
				int weather = new Random().nextInt(4);
				for(int i=0;i<solarP.length-1;i++){
					solarP[i]= new panels(weather);
				}
				
				//WRITING THE TELEMETRY VALUES
				for(int hour=1;hour<13;hour++){
					row = sheet.createRow(rowNo++);
					col =0;
					for(int pan=0;pan<solarP.length-1;pan++){
						solarP[pan].dayTime(hour);
						System.out.print("\t\t");
					
						
					}
					System.out.println();	
				}
				
				System.out.println("\n\n");rowNo+=2;
		}
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		fos.close();
		
		
		}
	
}

class panels extends telemetry{
	
	 int soc,power, current, volt;
	 Random ran = new Random();
	 static int weather;
	 
	public panels(int weather) {
		// TODO Auto-generated constructor stub
		if(weather < 3)
			this.weather=weather;
		else 
			this.weather=0;
	}
	public panels() {
		// TODO Auto-generated constructor stub
		this.weather=0;
	}
	
	
	public void dayTime(int hour){
		
		
		switch(hour){
		
		case 1: {
			soc = 38+ran.nextInt(30);
			power = 10+ran.nextInt((6-weather*2));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 2: {
			
			power = 9+ran.nextInt((9-weather*2));
			soc = soc+incrSoc(power);
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 3: {
			power = 12+ran.nextInt((10-weather*2));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 4: {
			power = 17+ran.nextInt((13-weather*2));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 5: {
			power = 18+ran.nextInt((12-weather*2));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 6: {
			power = 25+ran.nextInt((10-weather*4));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 7: {
			power = 15+ran.nextInt((38-weather*10));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 8: {
			power = 15+ran.nextInt((38-weather*10));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 9: {
			power = 15+ran.nextInt((38-weather*10));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 10: {
			power = 12+ran.nextInt((23-weather*5));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 11: {
			power = 8+ran.nextInt((15-weather*3));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
		
		case 12: {
			power = 8+ran.nextInt((12-weather*2));
			soc = soc+(power>19?incrSoc(power):-(1+ran.nextInt(3)));
			volt=(power>19?18:(15+ran.nextInt(3)));
			current =(int) Math.round((double)power/volt);
		}break;
	}
		soc=(soc>100?100:soc);
		System.out.printf("%d%%\t%dA\t%dV\t%dW",soc,current,volt,power);
		
		for(int i=1;i<=4;i++){
			Cell cell = row.createCell(col++);
			if(i==1)
				cell.setCellValue(soc+"%");
			if(i==2)
				cell.setCellValue(current+"A");
			if(i==3)
				cell.setCellValue(volt+"V");
			if(i==4)
				cell.setCellValue(power+"W");
		}
		col++;

}

	private int incrSoc(int power) {
		int incr = 0;
		
			if (power%10<4)
				incr = ran.nextInt(1);
			if (power%14<2)
				incr = 1+ran.nextInt(1);
			if (power%16<7)
				incr = 2+ran.nextInt(1);
			if (power%23<8)
				incr = 3+ran.nextInt(2);
			if (power%31<8)
				incr = 6+ran.nextInt(3);
			if (power%38<9)
				incr = 7+ran.nextInt(5);
			if (power%47<7)
				incr = 10+ran.nextInt(2);
			if (power%54<5)
				incr = 12+ran.nextInt(3);
		
		return incr;
	}



}

	


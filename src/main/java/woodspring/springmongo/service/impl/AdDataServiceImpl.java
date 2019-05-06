package woodspring.springmongo.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import jxl.Cell;
import jxl.Workbook;
import lombok.extern.slf4j.Slf4j;
import woodspring.springmongo.service.AdDataService;


@Service
@Slf4j
public class AdDataServiceImpl implements AdDataService {
	
	//static String pathStr = "classpath:NYGH//";
	//static String pathStr = "//home//woodspring//workspace-201811//SpringMongo//src//main//resources//NYGH//";
	static String pathStr = "C://NYGH//";
	private static final String FILE_NAME = "C:\\NYGH\\AD_ALL.xlsx";
	int recNo = 0;

	@Override
	public int readADFile(String filename) {
	    Path path = null;
	    //recNo = 0;
	    
	    System.out.println(" filename:["+ FILE_NAME+"]");
	    
	    Workbook workbook = null;
	        try {

	            workbook = Workbook.getWorkbook(new File(FILE_NAME));
Arrays.stream( workbook.getSheets()).forEach( sheet -> {
	int rowNo = sheet.getRows();
    int colNo = sheet.getColumns();
    System.out.println("rowNo:["+ rowNo+"] colNo:["+colNo+"]");
    //Cell cell1 = sheet.getCell(0, 0);
    String l="{", ll="[", e="=", r = "}", rr="]", c=",", q="\"", s=" ", t=":";
    StringBuffer strBuff = new StringBuffer();
    strBuff.append(l);
    for (int rowInd =0; rowInd < rowNo; rowInd++) {
    	strBuff.append(q+"index"+q+s+t+s+rowInd+c);
    	strBuff.append(q+"CONTEXT"+q+s+t+s +ll);
    	int size =0;
    	
    	for (int colInd =0; colInd < colNo; colInd++) {
    		Cell cell = sheet.getCell(colInd, rowInd );
    		String cType = cell.getType().toString();
    		if (!("Empty".equalsIgnoreCase(cType))) {
    			strBuff.append(l+q+"row"  +q+ s+t+s+colInd+s+c);
    			strBuff.append(  q+"type" +q+ s+t+s+q+cType+q+c );
    			strBuff.append(  q+"value"+q+s+t+s+q+cell.getContents()+q+r+c);
    		}
    		System.out.print(" row:"+ rowInd+" col:"+ colInd+" type:["+ cell.getType().toString()+"] value:["+cell.getContents()+"]|");
    	}
    	strBuff.deleteCharAt(strBuff.lastIndexOf(c));
    	strBuff.append(q+ll+c);
    	strBuff.append(q+"size"+q+s+t+s+colNo+s+r);
    	System.out.print("\n sheet:"+sheet.getName());;
    	System.out.println(" cell:"+ strBuff.toString());
    }
    
    System.out.println("\n\n==========end of sheet===="+ sheet.getName()+"=============\n\n");
});



//	            Sheet sheet = workbook.getSheet(0);
//	            
//	            int rowNo = sheet.getRows();
//	            int colNo = sheet.getColumns();
//	            System.out.println("rowNo:["+ rowNo+"] colNo:["+colNo+"]");
//	            //Cell cell1 = sheet.getCell(0, 0);
//	            String l="{", e="=", r = "{", c=",";
//	            StringBuffer strBuff = new StringBuffer();
//	            strBuff.append(l);
//	            for (int rowInd =0; rowInd < rowNo; rowInd++) {
//	            	
//	            	for (int colInd =0; colInd < colNo; colInd++) {
//	            		Cell cell = sheet.getCell(colInd, rowInd );
//	            		System.out.print(" row:"+ rowInd+" col:"+ colInd+" type:["+ cell.getType().toString()+"] value:["+cell.getContents()+"]|");
//	            	}
//	            	System.out.println("\n");;
//	            }
//		   
		   
		   
		   
//System.out.println(" filename:["+ FILE_NAME+"]");
//	            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
//	            HSSFWorkbook  workbook = new HSSFWorkbook(excelFile);
//	            HSSFSheet  datatypeSheet = workbook.getSheetAt(0);
//	            
//	            System.out.println(" filename:["+ (pathStr+filename) + "] : PhysicalNumberOfRows: "+ datatypeSheet.getPhysicalNumberOfRows());
//	            Iterator<Row> iterator = datatypeSheet.rowIterator(); //.row.iterator();
//
//	            while (iterator.hasNext()) {
//
//	                Row currentRow = iterator.next();
//	                Iterator<Cell > cellIterator = currentRow.cellIterator(); //.iterator();
//
//	                while (cellIterator.hasNext()) {
//
//	                	Cell  currentCell = cellIterator.next();
//	                    //getCellTypeEnum shown as deprecated for version 3.15
//	                    //getCellTypeEnum will be renamed to getCellType starting from version 4.0
////	                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
////	                        System.out.print(currentCell.getStringCellValue() + "--");
////	                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
////	                        System.out.print(currentCell.getNumericCellValue() + "--");
////	                    }
//	                    
//	                    System.out.print(" cellType:["+currentCell.getCellType().name()+"] index:["+currentCell.getColumnIndex() + "-"+ currentCell.getRowIndex()
//	                    				+"] StringCellValue:["+ currentCell.getStringCellValue()+"] getNumericCellValue:["+ currentCell.getNumericCellValue()+"]\n");
//
//	                }
	                System.out.println("\n\n");
	                recNo++;
	           // }
	        } catch (FileNotFoundException e) {
	        	System.out.println(" FileNotFoundException:"+ e.getMessage());
	            e.printStackTrace();
	        } catch (IOException e) {
	        	System.out.println(" IOException:"+ e.getMessage());
	            e.printStackTrace();
	        } catch (Exception e) {
	        	System.out.println(" Exception:"+ e.getMessage());
	            e.printStackTrace();
	        } finally {
	        	System.out.println("filename:"+ filename);
	        }

		return recNo;
	}

}

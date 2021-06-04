import java.io.*;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExcel {
	
	public static void main (String [] args) throws IOException{
		try
        {
            // File object is created
            File file = new File("javahungry.xlsx");
            
            /* If named file does not exist and was
            successfully created, then createNewFile() method
            will return true, otherwise false*/
            boolean isFileCreated = file.createNewFile();
            
            /* isFileCreated is true if you run the 
            program for the first time, but if you run the 
            program for second time then it will return false 
            because file already exists */
            System.out.println("Is "+ file.getName()+ " created : "+ isFileCreated);
            
            // Displaying the length of the file 
            System.out.println(file.getName()+ " is empty and length : "+ file.length());
        }
        
        catch(IOException e)
        {
          e.printStackTrace();   
        }
		
		
		
		
		String filePath = "javahungry.xlsx";
		//create an object of Workbook and pass the FileInputStream object into it to create a pipeline between the sheet and eclipse.
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//call the getSheet() method of Workbook and pass the Sheet Name here. 
		//In this case I have given the sheet name as “TestData” 
                //or if you use the method getSheetAt(), you can pass sheet number starting from 0. Index starts with 0.
		XSSFSheet sheet = workbook.getSheet("TestData");
		//XSSFSheet sheet = workbook.getSheetAt(0);
		//Now create a row number and a cell where we want to enter a value. 
		//Here im about to write my test data in the cell B2. It reads Column B as 1 and Row 2 as 1. Column and Row values start from 0.
		//The below line of code will search for row number 2 and column number 2 (i.e., B) and will create a space. 
                //The createCell() method is present inside Row class.
                Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		//Now we need to find out the type of the value we want to enter. 
                //If it is a string, we need to set the cell type as string 
                //if it is numeric, we need to set the cell type as number
		//cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("SoftwareTestingMaterial.com");
		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
	}
	
	
	
}

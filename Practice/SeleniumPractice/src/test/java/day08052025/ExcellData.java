package day08052025;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcellData {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        XSSFWorkbook workbook = null;

        try {
            // Correct path to your .xlsx file
            File file = new File("C:\\Users\\chkri\\Desktop\\persnal files\\PracticeSheet.xlsx");
            inputStream = new FileInputStream(file);

            // Create workbook instance for .xlsx file
            workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            if (sheet == null) {
                System.out.println("Sheet 'Sheet1' not found.");
                return;
            }

            int rowCount = sheet.getLastRowNum();

            for (int i = 0; i <= rowCount; i++) {
                XSSFRow row = sheet.getRow(i);
               // if (row == null) continue; // skip if row is null

                int cellCount = row.getLastCellNum();
                System.out.print("Row " + i + " data: ");

                for (int j = 0; j < cellCount; j++) {
                    XSSFCell cell = row.getCell(j);
                    if (cell == null) {
                        System.out.print("BLANK, ");
                    } else {
                        System.out.print(cell.toString() + ", ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Error reading Excel file: " + e.getMessage());
        } finally {
            try {
                if (workbook != null) workbook.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}

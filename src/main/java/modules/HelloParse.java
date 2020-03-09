package modules;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class HelloParse {
    public void readFromExcel(String file) throws IOException, InvalidFormatException {
        Workbook wb = WorkbookFactory.create(new File("D:\\ІТтаКБ. Сем I. Форма навчання  денна.xlsx"));
        Sheet myExcelSheet = wb.getSheet("Робота кафедри");
        Row row = myExcelSheet.getRow(0);
        System.out.println(row);
//        if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
//            String name = row.getCell(0).getStringCellValue();
//            System.out.println("name : " + name);
//        }
//
//        if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
//            Date birthdate = row.getCell(1).getDateCellValue();
//            System.out.println("birthdate :" + birthdate);
//        }

        wb.close();
    }
}

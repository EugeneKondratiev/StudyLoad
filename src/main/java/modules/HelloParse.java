package modules;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class HelloParse {
    public void readFromExcel(String file) throws IOException, InvalidFormatException {
        FileInputStream inputStream = new FileInputStream(new File(file));
        Workbook wb = WorkbookFactory.create(inputStream);
        Sheet myExcelSheet = wb.getSheet("Робота кафедри");
        Row row =  myExcelSheet.getRow(0);
        Cell cell = row.getCell(0);
        cell.setCellValue("Set value");
        //Workbook wbTest = WorkbookFactory.create(new File("src/main/resources/ІТтаКБ. Сем I. Форма навчання  денна.xlsx"));
        FileOutputStream outputStream = new FileOutputStream(file);
        wb.write(outputStream);
        RichTextString richStringCellValue = cell.getRichStringCellValue();

        System.out.println(richStringCellValue);
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
        outputStream.close();
    }
}

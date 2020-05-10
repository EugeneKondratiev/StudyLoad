package modules;

import org.apache.poi.hssf.eventusermodel.HSSFEventFactory;
import org.apache.poi.hssf.eventusermodel.HSSFRequest;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        HelloParse helloParse = new HelloParse();
        helloParse.readFromExcel("src/main/resources/ІТтаКБ. Сем I. Форма навчання  денна.xlsx");

        // create a new file input stream with the input file specified
//        FileInputStream fileInputStream = new FileInputStream("src/main/resources/ІТтаКБ. Сем I. Форма навчання  денна.xlsx");
//
//        // create a new org.apache.poi.poifs.filesystem.Filesystem
//        POIFSFileSystem poifsFileSystem = new POIFSFileSystem(fileInputStream);
//
//
//        // get the Workbook (excel part) stream in a InputStream
//        InputStream inputStream = poifsFileSystem.createDocumentInputStream("Workbook");
//
//        // construct out HSSFRequest object
//        HSSFRequest hssfRequest = new HSSFRequest();
//
//        // lazy listen for ALL records with the listener shown above
//        hssfRequest.addListenerForAllRecords(new ExcelListener());
//
//        // create our event factory
//        HSSFEventFactory factory = new HSSFEventFactory();
//
//        // process our events based on the document input stream
//        factory.processEvents(hssfRequest, inputStream);
//
//        // once all the events are processed close our file input stream
//        fileInputStream.close();
//
//        // and our document input stream (don't want to leak these!)
//        inputStream.close();
//
//        System.out.println("done.");
    }
}

package modules;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        HelloParse helloParse = new HelloParse();
        helloParse.readFromExcel("File");

    }
}

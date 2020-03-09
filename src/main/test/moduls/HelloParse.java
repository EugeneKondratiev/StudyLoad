package moduls;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloParse {
    private HelloParse helloParse;


    @Test
    public void getNotNullHelloParse(){
        helloParse = new HelloParse();
        assertNotNull(helloParse);
    }
}

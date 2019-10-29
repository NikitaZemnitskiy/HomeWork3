import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {



    @Test
    void ZigZagConversionTest1() {
        String expected = "PAHNAPLSIIGYIR";
        String actual = ZigZagConversion.convert("PAYPALISHIRING",3);
        assertEquals(expected, actual);
    }

    @Test
    void ZigZagConversionTest2() {
        String expected = "PAYPALISHIRING";
        String actual = ZigZagConversion.convert("PAYPALISHIRING",99);
        assertEquals(expected, actual);
    }

    @Test
    void ZigZagConversionTest3() {
        String expected = "PHASIYIRPLIGAN";
        String actual = ZigZagConversion.convert("PAYPALISHIRING",5);
        assertEquals(expected, actual);
    }

    @Test
    void ZigZagConversionTestWithOneNumRows() {
        String expected = "PAYPALISHIRING";
        String actual = ZigZagConversion.convert("PAYPALISHIRING",1);
        assertEquals(expected, actual);
    }

    @Test
    void ZigZagConversionTestWithEmptyString() {
        String expected = "";
        String actual = ZigZagConversion.convert("",5);
        assertEquals(expected, actual);
    }

    @Test
    void ZigZagConversionTestWithEmptyNumRows() {
        String expected = "";
        String actual = ZigZagConversion.convert("DUJPQAOAKFGIIFJIA",0);
        assertEquals(expected, actual);
    }

    @Test
    void ZigZagConversionTestWithNull() {
        String expected = "";
        String actual = ZigZagConversion.convert(null,1);
        assertEquals(expected, actual);
    }
}
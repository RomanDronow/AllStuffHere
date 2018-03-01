package strings;

import exceptions.WrongValueException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import static strings.StringProcessor.numberize;
import static strings.StringProcessor.multiply;
import static strings.StringProcessor.entryCount;

public class StringProcessorTest {
    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {"N", 3, "NNN"},
                {"qwe", 3, "qweqweqwe"},
                {"", 3, ""},
                {"", 0, ""}
        };
    }

    @DataProvider
    public static Object[][] countData() {
        return new Object[][]{
                {"a", "a", 1},
                {"", "чсчсчa", 0},
                {"qqqqqq", "qq", 5},
                {"qwe qwe", "qwe", 2},
                {"ss", "sss", 0},
                {"scscbns", "sbcbcbcbss", 0},
                {"", "", 1},
                {"qwerty", "", 0}, // -1 // exception
                {"qwertyer2 ertbvhjfdert", "ert", 3},
                {"qwertyer2 ertbvhjfdert", "n", 0}
        };
    }

    @DataProvider
    public static Object[][] onetwothreeData() {
        return new Object[][]{
                {"", ""},
                {"567890", "567890"},
                {" 1 ", " one "},
                {" 2", " two"},
                {"1 2 3", "one two three"}
        };
    }

    @DataProvider
    public static Object[][] changeWords() {
        return new Object[][]{
                {"", ""},
                {" qq ", " qq "},
                {" 123 erty 11 ", " 11 erty 123 "}
        };
    }

    @Test(dataProvider = "data")
    public void testCopy(String str, int N, String expected) throws IllegalArgumentException, WrongValueException {
        assertEquals(multiply(str, N), expected);
    }

    @Test(expectedExceptions = {WrongValueException .class})
    public void testCopyExc() throws WrongValueException {
        multiply("qwe", -6);
        fail();
    }

    @Test(dataProvider = "countData")
    public void testFind(String big, String small, int expected) {
        assertEquals(entryCount(big, small), expected);
    }

    @Test(dataProvider = "onetwothreeData")
    public void testChange(String source, String expected) {
        assertEquals(numberize(source), expected);
    }
}

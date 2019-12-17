import com.stackroute.pe3.CheckVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CheckVowelsTest {
    CheckVowels checkVowels;

    @Before
    public void setUp() throws Exception {
        checkVowels = new CheckVowels();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] string = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = checkVowels.removeVowels(string);
        assertArrayEquals(expected, actual);
    }

}

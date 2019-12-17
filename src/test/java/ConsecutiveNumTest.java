import com.stackroute.pe3.ChessBoard;
import com.stackroute.pe3.ConsecutiveNum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveNumTest {
    ConsecutiveNum consecutiveNum;
    @Before
    public void setUp() throws Exception {
        consecutiveNum = new ConsecutiveNum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkNon() {
        boolean expected = false;

        boolean actual = consecutiveNum.checkConsecutiveNum("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void checkConsOne() {
        boolean expected = true;
        boolean actual = consecutiveNum.checkConsecutiveNum("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo() {
        boolean expected = false;
        boolean actual = consecutiveNum.checkConsecutiveNum("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }
}

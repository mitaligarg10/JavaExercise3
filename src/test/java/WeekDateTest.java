import com.stackroute.pe3.WeekDate;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WeekDateTest {

    WeekDate weekDate;

    @Before
    public void setUp() {
        weekDate = new WeekDate();
    }

    @After
    public void tearDown() {
        weekDate = null;
    }

    @Test
    public void startDate() {
        boolean expectedValue = true;
        boolean actualValue = weekDate.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        boolean expectedValue1 = true;
        boolean actualValue1 = weekDate.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }
}

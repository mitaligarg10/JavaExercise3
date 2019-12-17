import com.stackroute.pe3.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentMarksTest {
    StudentMarks studentMarks;

    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculate() {
        String expected = "All marks are correct";
        int array[] = {51, 78, 65, 44};
        String actual = studentMarks.calculate(array, 4);

        assertEquals("Marks of the following Student : ", expected, actual);
    }

    @Test
    public void calculateFailure() {
        String expected = "Incorrect Marks Entered";
        int array[] = {77, 93, 178, 56};
        String actual = studentMarks.calculate(array, 4);
        assertEquals("Marks of the following Student : ", expected, actual);
    }
    @Test
    public void calculateFailure1() {
        String expected = "Incorrect Marks Entered";
        int array[] = {77, -93, 8, 56};
        String actual = studentMarks.calculate(array, 4);
        assertEquals("Marks of the following Student : ", expected, actual);
    }
}

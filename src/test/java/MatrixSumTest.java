import com.stackroute.pe3.MatrixSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixSumTest {
    MatrixSum matrixSum;

    @Before
    public void setUp() throws Exception {
        matrixSum = new MatrixSum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkSum() {
        int[][] expected = {{10, 10}, {10, 10}, {10, 10}};
        int matrix1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int matrix2[][] = {{9, 8}, {7, 6}, {5, 4}};
        int[][] actual = matrixSum.checkSum(3, 2, matrix1, matrix2);
        assertArrayEquals(expected, actual);
    }



}
/*  @Test
    public void checkSumFailure() {
        int[][] expected = {{10, 15}, {10, 10}, {10, 10}};
        int matrix1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int matrix2[][] = {{9, 8}, {7, 6}, {5, 4}};
        int[][] actual = matrixSum.checkSum(3, 2, matrix1, matrix2);
        assertArrayEquals(expected, actual);
    }*/
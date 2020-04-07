import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CodingBatTest {

    private CodingBat codingBat;

    @Before
    public void before() {
        codingBat = new CodingBat("Henry");
    }

        @Test
        public void centeredAverage(){
            int[] array1 = {1, 2, 3, 4, 100};
            assertEquals(3, codingBat.centeredAverage(array1));

        }
        @Test
    public void has22(){
        int[] array1 = {1, 2, 2};
        int[] array2 = {1, 2, 1, 2};
        int[] array3 = {2, 1, 2};
        assertEquals(true, codingBat.has22(array1));
        assertEquals(false, codingBat.has22(array2));
        assertEquals(false, codingBat.has22(array3));
        }

        @Test
    public void sum28(){
        int[] array1 = {2, 3, 2, 2, 4, 2};
        int[] array2 = {2, 3, 2, 2, 4, 2, 2};
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {2,2,2,2,2,2,2,2,2,2};
        assertEquals(true, codingBat.sum28(array1));
        assertEquals(false, codingBat.sum28(array2));
        assertEquals(false, codingBat.sum28(array3));
        assertEquals(false, codingBat.sum28(array4));
        }


    }


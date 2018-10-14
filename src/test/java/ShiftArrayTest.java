import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftArrayTest {

    private ShiftArray shiftArray = new ShiftArray();

    @Test
    void tests() {
        int[] arr = new int[] {1,2,3,4,5};
        int[] expectedArray = new int[] {2,3,4,5,1};
        assertArrayEquals(expectedArray, shiftArray.rightShiftDTimes(arr, 3));
    }
}
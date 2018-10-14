public class ShiftArray {


    public int[] rightShift(final int[] arr) {
        int l = arr.length;
        int[] temp = new int[l];
        temp[l - 1] = arr[0];
        for (int i = 0; i < l - 1; i++) {
            temp[i] = arr[i + 1];
        }
        return temp;
    }

    public int[] rightShiftDTimes(final int[] arr, int d) {
        int l = arr.length;
        int[] temp = new int[l];
        for (int j = 0; j < d; j++) {
            temp = rightShift(arr);
        }
        return temp;
    }
}

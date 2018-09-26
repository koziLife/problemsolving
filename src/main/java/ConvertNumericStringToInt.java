public class ConvertNumericStringToInt {
    public int convert(final String s) {
        try {
            //return Integer.valueOf(s);
            return Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return -1;
        }
    }
}

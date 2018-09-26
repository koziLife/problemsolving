package StringReverse;

public class StringReverseIteration {


    public static String reverse(final String str) {
        if(str.length() == 1)
            return str;
        else{
            char[] chars = str.toCharArray();
            int len = Math.floorDiv(chars.length, 2);
            for (int i = 0; i < len; i++) {
                char temp = chars[i];
                chars[i] = chars[chars.length -1 -i];
                chars[chars.length - 1 - i] = temp;
            }
            return String.copyValueOf(chars);
        }
    }

    public static String reverse1(final String s){
        if(s.length() == 1){
            return s;
        }else{
            char[] chars = s.toCharArray();
            int len = Math.floorDiv(s.length(), 2);
            for (int i = 0; i < len; i++) {
                char c = chars[i];
                chars[i] = chars[s.length() - 1 -i];
                chars[s.length() - 1 -i] = c;
            }
            return String.copyValueOf(chars);
        }
    }

    public static void main(String[] args) {
        String s = reverse1("osman");
        System.out.println(s);
    }
}

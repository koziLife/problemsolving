public class CheckPalindrom {


    public static boolean checkPalindrom(final String str) {
        int l = str.length() /2;
        for (int i = 0; i < l; i++) {
            if(str.charAt(i) == str.charAt(str.length() - 1 -i))
                continue;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b = checkPalindrom("savas");
        System.out.println(b);
    }
}

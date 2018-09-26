package StringReverse;

public class StringReverseRecursive {

    public static String reverse(String s){
        if(s.length() <2)
            return s;

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = reverse("savaS");
        System.out.println(s);
    }
}

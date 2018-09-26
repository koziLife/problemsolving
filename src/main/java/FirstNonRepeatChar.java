import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {
    public char giveRepeatChar(final String s) {

       Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c) +1);
            else
                map.put(c, 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.get(c) == 1)
                return c;
        }

        throw new RuntimeException("something went wrong");
    }

    public static void main(String[] args) {
        Character s = new FirstNonRepeatChar().giveRepeatChar("ddddd");
        System.out.println(s);

    }
}

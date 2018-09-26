import java.util.HashMap;
import java.util.Map;

public class CountACharacter {


    public int count(final char c, final String s) {
        Map<Character, Integer> map = new HashMap<>();
        if(s == null || s.isEmpty())
            throw new RuntimeException("String must not be null!");
        else{
            for (int i = 0; i < s.length(); i++) {
                char o = s.charAt(i);
                if(map.containsKey(s.charAt(i)))
                    map.put(o, map.get(o) +1);
                else
                    map.put(o, 1);
            }

            return map.get(c);
        }
    }
}

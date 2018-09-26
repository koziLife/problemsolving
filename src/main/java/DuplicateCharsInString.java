import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DuplicateCharsInString {


    public static Map<Character, Integer> getDuplicateChars(final String s) {
        Map<Character, Integer> map = new ConcurrentHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() >= 2)
                System.out.println(entry.getKey() +" : "+entry.getValue());
            else
                map.remove(entry.getKey());
        }
        return map;
    }

    public static void main(String[] args) {
        Map<Character, Integer> map = getDuplicateChars("xsavasaskcanimmeryem");
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}

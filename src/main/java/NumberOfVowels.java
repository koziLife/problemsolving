import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfVowels {

    public static Map<Character, Integer> findVowels(final String s) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','u','o','i'));
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(vowels.contains(c)) {
                if(map.containsKey(c))
                    map.put(c, map.get(c) +1);
                else
                    map.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
        return map;
    }

    public static Integer countVowels(final String s){
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c: chars){
            switch (c){
                case 'a':
                case 'o':
                case 'u':
                case 'i':
                case 'e':
                    count ++;
            }
        }
        return count;
    }

    public static Integer countVow(final String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case 'a':
                case 'u':
                case 'o':
                case 'i':
                case 'e':
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<Character, Integer> vowels = findVowels("unoiqaserjhggyftdrumeryemsavasaskito");

        Integer count = countVow("unoiqaserjhggyftdrumeryemsavasaskito");
        System.out.println("count: "+count);
    }
}

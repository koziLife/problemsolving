import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFormString {


    public String remove(final String s) {
        if(s.length() == 1)
            return s;
        else{
            Set<Character> set = new LinkedHashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            StringBuilder builder = new StringBuilder();
            for (Character c: set){
                builder.append(c);
            }
            return builder.toString();
        }
    }
}

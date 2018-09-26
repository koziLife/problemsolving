import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateCharacter {
    public static String remove(final String str) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        StringBuilder builder = new StringBuilder();
        Iterator<Character> iterator = set.iterator();
        for (Iterator<Character> it = iterator; it.hasNext(); ){
            builder.append(it.next());
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        String s = remove("meryem");
        System.out.println(s);
    }
}

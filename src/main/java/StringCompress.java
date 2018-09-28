import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompress {


    static String Compress(String str)  {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i= 0; i< str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        StringBuilder builder = new StringBuilder();
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            builder.append(entry.getKey().toString()+ entry.getValue());
        }
        return builder.toString();

    }



        public static void main(String[] args) {
            if( Compress("AABBBCCCD").equals("A2B3C3D1"))
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }

            if( Compress("ABCDE").equals("A1B1C1D1E1"))
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }

            if( Compress("KKKKK").equals("K5"))
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }

            if( Compress("").equals(""))
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
            if( Compress("aaa").equals("a3"))
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
            if( Compress("Abcda").equals("A1b1c1d1a1"))
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
        }
}

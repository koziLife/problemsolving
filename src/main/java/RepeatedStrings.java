public class RepeatedStrings {

    static long repeatedString(String s, long n) {
        long aTotal = 0;
        if(!s.contains("a")){
            return aTotal;
        }else{
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == 'a'){
                    aTotal ++;
                }
            }

            if(n > 1){
                int strLen = s.length();
                aTotal *= (n / strLen);
                int remain = (int) (n % strLen);
                aTotal += repeatedString(s.substring(0, remain), 1);
            }
            return aTotal;
        }
    }

    public static void main(String[] args) {
        long s = repeatedString("a", 100000);
        System.out.println(s);
    }
}

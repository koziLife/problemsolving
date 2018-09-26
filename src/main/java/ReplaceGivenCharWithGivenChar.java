public class ReplaceGivenCharWithGivenChar {

    public String replace(final String str, final char c, final char x) {
        if(str.contains(String.valueOf(c))){
            return str.replace(c, x);
        }
        return str;
    }
}

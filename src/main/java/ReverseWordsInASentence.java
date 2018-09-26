public class ReverseWordsInASentence {


    public static String reverse(final String sentence) {
        String[] words = sentence.split(" ");
        int l = words.length;
        StringBuilder builder = new StringBuilder();
        for (int i = l -1; i >= 0; i--) {
            if(i == 0)
                builder.append(words[i]);
            else
                builder.append(words[i] + " ");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello world naber savas meryem ask"));
    }
}

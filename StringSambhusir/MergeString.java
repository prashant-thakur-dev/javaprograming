package src.StringSambhusir;

public class MergeString {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String res = mergeString(word1, word2);
        System.out.println(res);
    }

    private static String mergeString(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<word1.length() || i < word2.length()){
            if (i< word1.length())
                sb.append(word1.charAt(i));
            if (i< word2.length())
                sb.append(word2.charAt(i));

            i++;
        }
        return sb.toString();
    }
}

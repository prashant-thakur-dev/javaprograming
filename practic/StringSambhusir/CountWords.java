package src.practic.StringSambhusir;

public class CountWords {
    public static void main(String[] args) {
        String s = "hello this is qspider";
        int ans = countWord(s);
        System.out.println(ans);
    }

    private static int countWord(String s) {
        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                isWord = false;
            }
            else {
                if (!isWord){
                    count++;
                    isWord = true;
                }
            }
        }
        return count;
    }
}

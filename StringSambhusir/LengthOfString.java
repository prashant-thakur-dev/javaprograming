package src.StringSambhusir;

public class LengthOfString {
    public static void main(String[] args) {
        String s = "hi hello gr";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                continue;
            }
            c++;
        }
        System.out.println(c);
    }
}

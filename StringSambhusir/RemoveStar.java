package src.StringSambhusir;

public class RemoveStar {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String res = removeStar(s);
        System.out.println(res);
    }

    private static String removeStar(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c:s.toCharArray()){
            if (c != '*'){
                sb.append(c);
            }else {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}

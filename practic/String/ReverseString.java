package src.practic.String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello my name is raj";
        String res = reverseString(str);
        System.out.println(res);
    }

    private static String reverseString(String str) {
        String rev = "";
        for (int i = str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            rev = rev + c;
        }
        return rev;
    }

//    private static String reverseString(String str) {
//        String rev = "";
//        for (char s:str.toCharArray()){
//            rev = s + rev;
//        }
//        return rev;
//    }
}

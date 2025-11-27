package src.StringSambhusir;

public class CompareBack {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad##c";
        boolean res = backspaceCompare(s, t);
        System.out.println(res);
    }
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        for (char c : s.toCharArray()){
            if (c!='#'){
                s1.append(c);
            }
            else{
                if (s1.length() > 0) {
                    s1.deleteCharAt(s1.length() - 1);
                }
            }
        }
        for (char c : t.toCharArray()){
            if (c!='#'){
                t1.append(c);
            }
            else{
                if (t1.length() > 0) {
                    t1.deleteCharAt(t1.length() - 1);
                }
            }
        }


        return s1.toString().equals(t1.toString());
    }
}

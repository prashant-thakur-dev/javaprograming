package src.StringSambhusir;

public class Reverse {
    public static void main(String[] args) {
        String st = "heh";
        boolean res = checkPal(st);
        if (res)
            System.out.println(res);
        else
            System.out.println(res);
    }

    private static boolean checkPal(String st) {
        int s = 0;
        int e = st.length()-1;
        while (s<e){
            if (st.charAt(s) != st.charAt(e)) {
                return false;

            }
            s++;
            e--;
        }
        return true;
    }
}

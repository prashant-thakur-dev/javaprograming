package src.StringSambhusir;

public class SumOfAllNumaricValue {
    public static void main(String[] args) {
        String s = "he23llo1";
        int ans =  sumOfNumber(s);
        System.out.println(ans);
    }

    private static int sumOfNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >=48 && s.charAt(i) <=57){
                sum = sum + (s.charAt(i)-48);
            }
        }
        return sum;
    }
}

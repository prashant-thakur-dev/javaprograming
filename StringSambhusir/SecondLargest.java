package src.StringSambhusir;

public class SecondLargest {
    public static void main(String[] args) {
        String s = "abc1111";
        int ans = secondHighest(s);
        System.out.println(ans);
    }

    private static int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int secMax =Integer.MIN_VALUE;
        for(char c:s.toCharArray()){
            if (c>=48 && c<=57){
                int n = c-48;
                if(n>max) {
                    secMax = max;
                    max = n;
                }
                if(n>secMax && n!=max){
                    secMax = n;
                }
            }
        }
        return secMax!=Integer.MIN_VALUE?secMax:-1;
    }
}

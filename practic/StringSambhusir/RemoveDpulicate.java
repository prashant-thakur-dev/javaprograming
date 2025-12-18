package src.practic.StringSambhusir;

public class RemoveDpulicate {
    public static void main(String[] args) {
        String s = "abcaxbdacdptx";
        String res = removeDuplicate(s);
        System.out.println(res);
    }

    private static String removeDuplicate(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = frequency(s);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>=1){
                sb.append((char)i);
            }
        }
        return sb.toString();
    }

    private static int[] frequency(String s) {
        int[] freq = new int[256];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        return freq;
    }
}

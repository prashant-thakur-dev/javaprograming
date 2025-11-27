package src.StringSambhusir;

public class AddSpace {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        String res = addSpaces(s, spaces);
        System.out.println(res);
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int g:spaces){
            index = g;
            for(int i = 0;i<s.length(); i++){
                if (i < index){
                    sb.append(s.charAt(i));
                }
                if (i == index){
                    sb.append(' ');

                }
                index++;
            }
        }

        return sb.toString();
    }
}

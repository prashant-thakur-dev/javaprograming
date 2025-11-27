package src.Array;

public class PrintElementMaxLength {
    public static void main(String[] args) {
//        String[] arr = new String[6];
        String[] arr1 = {"java", "php", "python", "ai", "ui", "javaScript"};
        String max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length() >= max.length()) {
                max = arr1[i];
            }
        }
        System.out.print(max + " ");
    }
}

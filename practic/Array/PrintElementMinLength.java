package src.practic.Array;

public class PrintElementMinLength {
    public static void main(String[] args) {
//        String[] arr = new String[6];
        String[] arr1 = {"java", "php", "python", "ai", "ui", "javaScript"};
        String min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length() <= min.length()) {
                min = arr1[i];
            }
        }
        System.out.print(min + " ");
    }
}

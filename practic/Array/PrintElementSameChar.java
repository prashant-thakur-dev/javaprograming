package src.practic.Array;

public class PrintElementSameChar {
    public static void main(String[] args) {
//        String[] arr = new String[6];
        String[] arr1 = {"java", "php", "python", "oops", "ui", "javaScript"};
        String min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            char firstChar = arr1[i].charAt(0);
            char secondChar = arr1[i].charAt(1);
            if (firstChar == secondChar)
            {
                min = arr1[i];
            }

        }
        System.out.println(min);

    }
}

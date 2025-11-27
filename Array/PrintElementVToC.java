package src.Array;

public class PrintElementVToC {
    public static void main(String[] args) {
//        String[] arr = new String[6];
        String[] arr1 = {"java", "php", "python", "oops", "ui", "javaScript"};
        String min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            char firstChar = arr1[i].charAt(0);
            char lastChar = arr1[i].charAt(arr1[i].length()-1);
            if ((firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u')
                    && (lastChar != 'a' && lastChar != 'e' && lastChar != 'i' && lastChar != 'o' && lastChar != 'u'))
            {
                min = arr1[i];
            }

        }
        System.out.println(min);

    }
}

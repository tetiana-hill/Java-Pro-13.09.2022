package homework3;

import java.util.Arrays;

public class ToReversString {
    public static void main(String[] args) {

        toReversString();

    }

    public static void toReversString() {
        String str = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String[] words = str.split("Z");
        Arrays.toString(words);

        for (String word: words) {

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");

        }
    }
}

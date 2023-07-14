package lesson_21.practice.string;


public class PracticeString {
    public static void main(String[] args) {

        String str = "Ich liebe Java sehre stark ";
        System.out.println("String: " + str);

        String[] words = str.split(" "); // разделяем строку на слова, потому что разделителем является пробел (" ")
        int n = words.length;
        System.out.println("words of the string: " + n);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }


            String[] symbols = str.split(""); // разделяем строку на слова, потому что разделителем является пробел (" ")
            int m = symbols.length;
            System.out.println("Quantity of symbols in the string: " + m);
            for (int i = 0; i < symbols.length; i++) {
                System.out.print(symbols[i] + " | ");
            }

    }
}

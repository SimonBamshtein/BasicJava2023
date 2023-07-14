// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("String practice!");
        String st = "I like Java! Java is the best way to earn good salary in IT.";
        System.out.println(st); // печатаем строку

        //распечатать последний символ строки
        int l = st.length();//определяем длину строки
        System.out.println("Length of string is: " + l);

        char lastSymbol = st.charAt(st.length() - 1); // так узнал последний символ

        System.out.println("Last symbol is: " + lastSymbol);

        // Найти позицию подстроки “Java” в строке “I like Java!”

        String st1 = "I like Java!"; //задали строку
        int index = st1.indexOf("Java");// узнаем с какого индекса начинается вывод Java
        System.out.println("Java starts from index " + index);// печатаем результат

        int index1 = st1.indexOf("like");
        System.out.println("Like starts from index " + index1);

        //проверить содержит ли заданная строка подстроку "Java". Используем метод String.contains()
        boolean yesOrNo = st.contains("Java");
        System.out.println(yesOrNo); //печатаем результат - true

        // Заменить символы А на О
       String stNew = st.replace("a", "o");// делаем замену в строке st всех букв А на букву О
       System.out.println(stNew); // заменяем и печатаем

        //Преобразуйте строку к верхнему и нижнему регистру

        String stNew1 = st.toLowerCase(); // переводим строку в нижний регистр
        System.out.println(stNew1); // печать

        String stNew2 = st.toUpperCase(); // переводим в верхний регистр
        System.out.println(stNew2); // печать


        // Вырезать строку Java с помощью метода String/substring().

        String stNew3 = st.substring(7, 11);
        System.out.println(stNew3);

        //Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith(),
        // привыкаем к типу boolean.
        String stNew4 = "I like Java!!!";
        yesOrNo = stNew4.endsWith("!!!"); // выясняем
        System.out.println(yesOrNo);





    }
}
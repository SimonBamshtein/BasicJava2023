public class rocket {
    public static void main(String[] args) {

        // Задача 2. Запустить обратный отсчет старта ракеты от 10 до 0.
        // Последнее сообщение: "Поехали!...".

        int countDown = 10; //параметр (счетчик) цикла
         while (countDown >= 0) {
             System.out.println(countDown);
             countDown--;
         } //end of while
        System.out.println("Поехали!...");

    } //end of method main
} //end of class (rocket)


public class EX1 {
    public static void main(String[] args) {
        System.out.println("ex1");

        int [] weekTemp = { 28, 27, 27, 28, 27, 27, 28 }; // название заданного массива

        System.out.println("Tuesday temp was: " + weekTemp[1] + " degrees");
        System.out.println("Thursday temp was: " + weekTemp[3] + " degrees");

        int midT = (weekTemp[0] + weekTemp[1] + weekTemp[2] + weekTemp[3] +weekTemp[4] + weekTemp[5] + weekTemp[6])/7; // расчет средней темп за неделю

        System.out.println("Mid temp of the week was: " + midT + "degrees");

    }
}

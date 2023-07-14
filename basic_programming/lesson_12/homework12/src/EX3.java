public class EX3 {
    public static void main(String[] args) {


        int min = 10;
        int max = 20;
        double[] random = new double[20];
        for (int i = 0; i < random.length ; i++) {
            random[i] = (double) (Math.random() * (max - min) + min);
            System.out.println(random[i]);
        }
    }
}

package lesson_18.practice.hw;

public class ProductAppl {
    public static void main(String[] args) {
        //Массив для хранения продуктов
        Product[] products = new Product[4];

        // Создание объектов для каждого продукта
        products[0] = new Product(10.5, "Apple", 123456789);
        products[1] = new Food(5.4, "Bread", 987654321, false);
        products[2] = new MeatFood(19.9, "Steak", 567891234, false, "Beef");
        products[3] = new MilkFood(5.9, "Milk", 432198765, true, "Soy Milk", 2.5);

        // печать всех продуктов из массива
        printProducts(products);

        // Получение суммы цен всех продуктов в магазине
        double total = calculateTotalPrice(products);
        System.out.println("Сумма цен всех продуктов: " + total);
    }//______Методы
    // Метод для печати всех продуктов массива
    public static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Метод для расчета суммы цен всех продуктов в магазине
    public static double calculateTotalPrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

}

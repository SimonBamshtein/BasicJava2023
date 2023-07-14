package lesson_17.beverage;

public class Beer extends Beverage {

    String type; //white or dark, ...

    // конструктор
    public Beer(String title, String packing, int quantity) {
        super(title, packing, quantity);
    }

    // метод для закупки
    // мы перегрузили родительский метод
    public void toBuy (String title, String packing, int quantity, String type) {
        super.toBuy(title, packing, quantity);
        this.type = type;

    }

    //метод для показа того, что в кладовке
    // мы перегрузили родительский метод
    public void displayStock () {
        super.displayStock();
        System.out.println("This is " + type + " beer.");
    }

    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public Beer(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //пустой конструктор (для того чтобы можно было не вписывать значиения в скобках) для класса Beer
    public Beer() {
    }
}

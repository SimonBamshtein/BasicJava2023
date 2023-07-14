package lesson_18.practice.hw;
import lesson_18.practice.hw.Product;
import lesson_18.practice.hw.Food;
import lesson_18.practice.hw.MeatFood;
class MilkFood extends Food {
    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, boolean isOutOfDate, String milkType, double fat) {
        super(price, name, barCode, isOutOfDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "MilkFood " +
                "milkType='" + milkType + '\'' +
                ", fat=" + fat +
                ' ';
    }
}

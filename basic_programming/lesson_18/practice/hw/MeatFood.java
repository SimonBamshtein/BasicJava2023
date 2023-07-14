package lesson_18.practice.hw;
import lesson_18.practice.hw.Product;
import lesson_18.practice.hw.Food;
public class MeatFood extends Food {
    private String meatType;
    public MeatFood(double price, String name, long barCode, boolean isOutOfDate, String meatType) {
        super(price, name, barCode, isOutOfDate);
        this.meatType = meatType;
    }
    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "MeatFood " +
                "price=" + getPrice() +
                ", name='" + getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", isOutOfDate=" + isOutOfDate() +
                ", meatType='" + meatType + '\'' +
                ' ';
    }
}

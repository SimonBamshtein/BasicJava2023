package lesson_18.practice.model;

import java.util.Objects;

public class computer {
    // поля класса
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;
    // конструктор


    public computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM" + ram + ", SSD: " + ssd;
    }

    //метод для сравнения обьектов
    @Override
    public boolean equals(Object obj) {  //сигнатура метода: модификатор, ТИП ВОЗВРАЩАЕМОГО МЕТОДОМ ЗНАЧЕНИЯ, имя метода,
        // тип переменной и ее имя, которая принимает метод
        if (this == obj) return true; // если мы сравниваем обьект сам с собой, возвращаем true
        if (obj == null || getClass() != obj.getClass()) return false; //если сравниваем с null или обьекты из ранзых классов
        computer computer = (computer) obj; //производим downcasting предложенного обьекта для сравнения до класса computer
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand); // логическое выражение
    }


    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand);
    }
}

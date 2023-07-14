package lesson_16.practice.bank.model;

public class BankAccount {
// поля класса
    private long account; //номер счета
    private String owner; //владелец счета
    private String bank; //наименование банка
    private int branch; //номер отделения
    private double balance; //баланс

    //методы класса
    //конструктор класса
    public BankAccount(long account, String owner, String bank, int branch, double balance) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

    public void deposit (double sum) {
        balance = balance + sum; //добавили деньги на счет
    }


    //геттеры и сеттеры


    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display () {
        System.out.println("Acc: " + account + " Owner: " + owner + " Bank: " + bank + " Branch: " + branch + " Balance: " + balance);
    }

}

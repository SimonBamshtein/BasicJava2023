package lesson_16.practice.bank.controller;

import lesson_16.practice.bank.model.BankAccount;

public class BankApplication {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(1000L, "Dmitriy", "Volksbank", 101, 100);
        // acc1 - обьектная переменная, в которой собраны все поля и их значения
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getOwner());
        acc1.display();
      //внести деньги на депозит

        acc1.deposit(500); //acc 1 вырос баланс
    }

}

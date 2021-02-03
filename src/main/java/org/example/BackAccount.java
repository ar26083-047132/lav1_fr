package org.example;

public class BackAccount {
    private int id;
    private int pin = 123;
    private int money = 2500;

    public BackAccount(int id){
        this.id = id;
    }


    public int getId(){
        return id;
    }
    public int getPin() {
        return pin;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
}

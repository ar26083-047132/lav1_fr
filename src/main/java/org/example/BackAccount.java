package org.example;

public class BackAccount {
    private int id = 123;
    private int pin = 4321;
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

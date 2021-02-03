package org.example;

public class BackAccount {
    private int id;
    private int pin;
    private int money;

    public BackAccount(int id, int pin, int money){
        this.id = id;
        this.pin = pin;
        this.money = money;
    }

    public int getId(){
        return id;
    }
    public int getPin() {
        return pin;
    }
    public void setMoney(int money){
        this.money = money;
    }

}

package org.example;

public class BankServ {
    private BackAccount backAccount;
    public BankServ(BackAccount backAccount){
        this.backAccount = backAccount;
    }
    public int CheckAcc(Card card){
        if (card.getId() == backAccount.getId()){
            return 1;
        }
        return 0;
    }

    public boolean Dost(int pin){
        if (backAccount.getPin() == pin){
            System.out.println(backAccount.getPin());
            return true;
        }
        return false;
    }

    public int getingMoney(){
        int Money = backAccount.getMoney();
        backAccount.setMoney(0);
        return Money;
    }
    public void setPin (int pin){
        backAccount.setPin(pin);
    }
}

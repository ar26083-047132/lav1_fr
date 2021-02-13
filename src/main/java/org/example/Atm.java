package org.example;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        int it = -1, menu = -1, buf;
        boolean dos = false;
        while(true){
            System.out.println("+------[ATM]------+");
            System.out.println("+[1] - Enter Card +");
            System.out.println("+[0] - Exit       +");
            it = sc.nextInt();
            if (it == 0){
                it = -1;
                break;
            }
            BankServ bankServ = (BankServ) context.getBean("servBean");
            Card card = (Card) context.getBean("cardBean");
            if (1 == bankServ.CheckAcc(card)){
                System.out.println("+------[ATM]------+");
                System.out.println("+   [Enter PIN]   +");
                System.out.println("+ *PIN = 4321     +");
            }

            buf = sc.nextInt();
            while(bankServ.Dost(buf)){
                System.out.println("+------[ATM]------+");
                System.out.println("+[1] Get all money+");
                System.out.println("+[2] Change Pin   +");
                menu = sc.nextInt();
                if (menu == 1){
                    System.out.println("geting all money");
                    System.out.println(bankServ.getingMoney());

                }else if(menu == 2){
                    System.out.println("set pin, enter pin");
                    bankServ.setPin(sc.nextInt());
                }else if(menu == 0){
                    break;
                }
            }
        }
    }
}

package Homework_2;

import java.util.Scanner;

public class Homework2Main {
    public static void main(String[] args) {
        
        // CreditAccount account = new CreditAccount(1000);

        // account.getMoney(150);
        // account.putMoney(200);
        

        // DepositAccount depo = new DepositAccount(10000);
        // System.out.println(depo.getBalance());

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Введите количество средств для снятия со вклада: ");
        // double money = scanner.nextDouble();
        // depo.getMoney(money);
        // scanner.close();

        FixedAmountAccount fixAccount = new FixedAmountAccount();

        // System.out.println(fixAccount.getBalance());

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество средств для снятия со вклада: ");
        double money = sc.nextDouble();
        fixAccount.getMoney(money);
        sc.close();
        


    }
}

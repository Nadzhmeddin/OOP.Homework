package Homework_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends AbstractAccount {

    private LocalDate lastTakedMoney = LocalDate.of(2023, 9, 15);
    private double balance = 10000;

    public DepositAccount(double balance) {
        super(balance);
        
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void putMoney(double money) {
        this.balance += money;
        System.out.printf("Ваш текущий баланс %s", balance);
    }

    @Override
    public void getMoney(double money) {
        if(balance > money) {
            LocalDate now = LocalDate.now();
            LocalDate monthAgo = now.minus(1, ChronoUnit.MONTHS);
            boolean after = lastTakedMoney.isBefore(monthAgo);
            System.out.println(after);
            if(after = true) {
                double res = balance - money;
                balance = res;
                System.out.printf("Снятие проведено успешно! Ваш баланс: %s", balance);
            } else System.out.println("Снятие невозможно. Причина:Вы уже снимали в этом месяце!");
        } else System.out.println("Недостаточно средств на счете!");
    }
    
}

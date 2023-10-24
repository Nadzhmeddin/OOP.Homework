package Homework_1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account {

    private LocalDate lastTakedMoney = LocalDate.of(2023, 9, 15);

    DepositAccount() {
        super(10000);
    }

    @Override
    public void getMoney(double money) {
        if(balance > money) {
            LocalDate now = LocalDate.now();
            LocalDate monthAgo = now.minus(1, ChronoUnit.MONTHS);
            boolean after = monthAgo.isBefore(lastTakedMoney);
            System.out.print(after);
            if(after = true) {
                double res = balance - money;
                balance = res;
                System.out.println(balance);
            } else System.out.println("Снятие невозможно. Причина:Вы уже снимали в этом месяце!");
        } else System.out.println("Недостаточно средств на счете!");
    }

    @Override
    public void putMoney(double money) {
        super.putMoney(money);
    }
}   




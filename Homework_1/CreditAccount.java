package Homework_1;

public class CreditAccount extends Account {

    CreditAccount(double balance) {
        super(balance);
    }
    
    public CreditAccount() {
        this(1000);
    }
    
    @Override
    public void getMoney(double money) {
        double commission  = money*0.01;
        double res = balance - money + commission;
        balance = res;
        System.out.printf("Снятие средств произведено с комиссией %s. Ваш баланс: %s", commission, balance);
    }

}

package Homework_2;

public class CreditAccount extends AbstractAccount {

    public double balance;
    protected double comission = 0.01;

    CreditAccount(double balance) {
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
        if(balance >= money) {
            double res = balance - (money + money*comission);
            balance = res;
            System.out.printf("Ваш текущий баланс: %s\n", balance);
        }
        else System.out.println("Недостаточно средств на счете");
    }
        
}

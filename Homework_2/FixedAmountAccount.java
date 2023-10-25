package Homework_2;

public class FixedAmountAccount extends AbstractAccount{


    private static double balance = 10000;

    public FixedAmountAccount() {
        super(balance);
    }
    
    public double getBalance() {
        return balance;
    }

    @Override
    public void putMoney(double money) {
        balance += money - money;
        System.out.printf("Ваш текущий баланс %s", balance);
    }

    @Override
    public void getMoney(double money) {
        if(balance >= money) {
            double res = balance - money + money;
            balance = res;
            System.out.printf("Ваш текущий баланс: %s\n", balance);
        }
        else System.out.println("Недостаточно средств на счете");
    }
    
}

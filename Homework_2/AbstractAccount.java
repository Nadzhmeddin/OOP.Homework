package Homework_2;

public abstract class AbstractAccount implements Interface {
    
    protected double balance;

    public AbstractAccount(double balance) {
        this.balance = 1000;
    }

    public double getBalance() {
        return balance;
    }

    public void putMoney(double money) {
        this.balance += money;
        System.out.printf("Ваш текущий баланс %s", balance);
    }

    public void getMoney(double money) {
        if(balance >= money) {
            double res = balance - money;
            balance = res;
            System.out.printf("Ваш текущий баланс: %s\n", balance);
        }
        else System.out.println("Недостаточно средств на счете");
    }
}

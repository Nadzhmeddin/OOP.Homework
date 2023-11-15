package Homework_5;

public class CreditAccount extends Account{

    protected double commission = 0.01;

    public CreditAccount(double balance) {
        super(balance);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }


    @Override
    public double getMoney(double money) {
        double res = balance - (money + money*commission);
        balance = res;
        return balance;
    }

    @Override
    public double putMoney(double money) {
        return super.putMoney(money);
    }
}

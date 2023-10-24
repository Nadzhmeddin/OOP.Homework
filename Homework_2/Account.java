public class Account {

    protected  double balance;
    

    Account(double balance) {
        this.balance = balance; 
    }

    public void putMoney(double money) {
            this.balance += money;
            System.out.printf("Ваш текущий баланс: %s", balance); 
    }
    
    public void getMoney(double money) {
        if(balance >= money) {
            double res = balance - money;
            balance = res;
            System.out.printf("Ваш текущий баланс: %s", balance);
        }
        else System.out.println("Недостаточно средств на счете");
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

package Homework_5;

public class Account {

    /**
     * Протестировать классы Account, CreditAccount из ДЗ #1.
     *
     * 1. Создать Account. Пополнить его на X рублей. Проверить, что на счету X рублей. (+)
     * 2. Создать Account. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X-Y рублей. (+)
     * 3. Создать CreditAccount. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X - 1.01*Y рублей.(+)
     * 4. ** Протестировать DepositAccount. Тест-кейсы придумать самостоятельно.
     *
     * Примерный код:
     * Account testObject = new Account();
     * testObject.put(10);
     * Assertions.assertEquals(10, testObject.getAmount());
     *
     */

    protected  double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double putMoney(double money) {
        this.balance += money;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMoney(double money) {
        if(balance >= money) {
            double res = balance - money;
            balance = res;
            System.out.printf("Ваш текущий баланс: %s", balance);
        }
        else System.out.println("Недостаточно средств на счете!");
        return money;
    }
}

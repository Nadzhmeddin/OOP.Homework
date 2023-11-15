package Homework_5;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void putMoney() {
        Account testObject = new Account(0);
        double putMoney = testObject.putMoney(150);

        Assertions.assertEquals(putMoney, testObject.getBalance());

    }

    @org.junit.jupiter.api.Test
    void getMoney() {
        Account testObject = new Account(0);
        double putMoney = testObject.putMoney(100);
        double getMoney = testObject.getMoney(50);

        Assertions.assertEquals(50, testObject.getBalance());
    }
}
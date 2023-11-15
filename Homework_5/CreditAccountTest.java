package Homework_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    @Test
    void getMoney() {
        CreditAccount testObject = new CreditAccount(0);

        double putMoney = testObject.putMoney(1000);
        double getMoney = testObject.getMoney(500);

        Assertions.assertEquals(495, testObject.getBalance());
    }
}
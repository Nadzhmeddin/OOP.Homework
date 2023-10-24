package Homework_1;

import java.util.Scanner;
/*
   * 1. Создать класс "Счет в банке" - Account.
   * У этого класса должно быть поле с текущим балансом на счете.
   * У этого класса должно быть 3 метода:
   * - (put) Пополнить счет - принимат положительное число, увеличивает текущий баланс
   * - (take) Вывести средства - принимат положительное число, уменьшает текущий баланс
   * - (getAmount) Показать баланс - ничего не принимает, возвращает текущий баланс (getter)
   *
   * 2. Создать несколько наследников.
   * - Кредитный счет (CreditAccount)
   * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
   * То есть, если снимаем 100 у.е., то снять нужно 101.
   * - Депозитный счет (DepositAccount) *
   * Особенность: нельзя снимать средства чаще, чем раз в месяц.
   * То есть, нужно завести поле с датой последнего снятия, и использовать его.
   * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
   */



public class Homework1Main {
   public static void main(String[] args) {
      Account account = new Account(1000);
      System.out.println("Введите номер операции со счетом: \n1.Показать баланс счета; \n2.Пополнить счет; \n3.Вывести средства со счета; \n4.Выход;");
      System.out.print("Номер операции: ");
      Scanner scanner = new Scanner(System.in);
      double numberOperation = scanner.nextDouble();
      if(numberOperation == 1) System.out.printf("Ваш баланс: %s", account.getBalance());
      else if (numberOperation == 2) {
         System.out.print("Введите количество средств для пополнения счета: ");
         Scanner cash = new Scanner(System.in);
         double money = cash.nextDouble();
         if(money > 0) account.putMoney(money);
         else System.out.println("Введите положительное число!");
         cash.close();
      } else if(numberOperation == 3) {
         System.out.print("Введите количество средств для снятия со счета: ");
         Scanner cash = new Scanner(System.in);
         double money = cash.nextDouble();
         if(money > 0) account.getMoney(money);
         else System.out.println("Введите положительное число!");
         cash.close();
      } else if(numberOperation == 4) System.out.println("Пока-пока");
      else System.out.println("Нет такой операции!");
      scanner.close();


      // CreditAccount credit = new CreditAccount();
      // System.out.print("Введите количетсов средств для снятия с кредитного счета: ");
      // Scanner cash = new Scanner(System.in);
      // double money = cash.nextDouble();
      // if(money > 0) credit.getMoney(money);
      // else System.out.println("Введите положительное число!");
      // cash.close();

      // DepositAccount deposit = new DepositAccount();
   }


}
import java.util.Scanner;

/**
   * Модифицируем пример, описанный в предыдущем домашнем задании (со счетами).
   * {@link ru.gb.lesson1.Homework}
   *
   * 1. Класс Account превратить в интерфейс с методами:
   * # double getAmount() - получение текущего баланса
   * # void put(double amount) - пополнить счет
   * # void take(double amount) - снять средства со счета
   *
   * 2. Создать базовый абстрактный класс AbstractAccount, в котором будет общая часть:
   * # поле с балансом
   * # конструктор, который принимает начальное значение баланса
   * # реализация всех методов
   *
   * 3. Добавить еще один класс FixedAmountAccount с особенностью: методы put, take НЕ изменяют баланс.
   *
   * 4.* Класс AbstractAccount можно реализовать хитрее. Пример ниже.
   */

public class Homework2Main {
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
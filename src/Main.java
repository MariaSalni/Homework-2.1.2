public class Main {
    public static void main(String[] args) {
        // заполняем баланс счета и сумму пополнения
        int balance = 100;
        int replenishmentAmount = 1100;

        int bonus;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount/100;
            }

        else {
            bonus = 0;
            }

        int totalAmount = balance + replenishmentAmount + bonus;

        System.out.println("Количество бонусных рублей:" + bonus);
        System.out.println("Итоговый счет:" + totalAmount);

    }
}

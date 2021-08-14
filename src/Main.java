public class Main {
    public static void main(String[] args) {
        // заполняем баланс счета и сумму пополнения
        int balance = 100;
        int replenishmentAmount = 1100;

        if (replenishmentAmount > 1000) {
            int bonus = replenishmentAmount/100;
            System.out.println("Количество бонусных рублей:" + bonus);
        }

        if (replenishmentAmount < 1000) {
            int bonus = 0;
            System.out.println("Количество бонусных рублей:" + bonus);
        }

        int totalAmount = balance + replenishmentAmount;
        System.out.println("Итоговый счет:" + totalAmount);

    }
}

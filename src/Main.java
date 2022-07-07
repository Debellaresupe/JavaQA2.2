public class Main {
    public static void main(String[] args) {
        int initialAmount = 100; // Сумма на счете
        int replenishmentAmount = 1001; // Сумма пополнения
        int rubles = 100;

        int bonusRubles;

        if (replenishmentAmount > 1000) {
            bonusRubles = replenishmentAmount / rubles;
        } else {
            bonusRubles = 0;
        }
        int finalAmount = bonusRubles + replenishmentAmount + initialAmount;
        System.out.println("Бонусные рубли: " + bonusRubles);
        System.out.println("Итоговая сумма: " + finalAmount);
    }
}

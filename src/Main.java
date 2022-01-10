public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment1 = service.calculate(12);
        System.out.println("Сумма ежемесячного платежа " + payment1 + " руб.");

        double payment2 = service.calculate(24);
        System.out.println("Сумма ежемесячного платежа " + payment2 + " руб.");

        double payment3 = service.calculate(36);
        System.out.println("Сумма ежемесячного платежа " + payment3 + " руб.");
    }
}

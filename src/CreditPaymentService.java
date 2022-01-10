public class CreditPaymentService {
    public double calculate(double n) {
        double s = 1_000_000; //сумма кредита
        // n - срок кредита в месяцах
        double i = 9.99 / 12 / 100; // процентная ставка по кредиту в месяц
        double k = (i * Math.pow((1 + i), n)) / (Math.pow((1 + i), n) - 1); // коэффициент аннуитета
        double monthlyPayment = Math.round(k * s * 100) / 100.00;
        return monthlyPayment;
    }
}

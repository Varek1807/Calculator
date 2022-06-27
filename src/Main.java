public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        int paymentPerMonth = (int) service.calculate(1, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж при сроке кредита 1 год: ");
        System.out.println(paymentPerMonth);
        System.out.println();

        paymentPerMonth = (int) service.calculate(2, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж при сроке кредита 2 года: ");
        System.out.println(paymentPerMonth);
        System.out.println();

        paymentPerMonth = (int) service.calculate(3, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж при сроке кредита 3 года: ");
        System.out.println(paymentPerMonth);

    }
}

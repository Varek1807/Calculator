public class CreditPaymentService {
    public double calculate(double loanTerm, double percent, double loanAmount) { //loanTerm - срок кредита;
        // percent - процент;
        //loanAmount - сумма кредита;
        double loanRate = percent / 12 / 100; // payment - платеж в месяц; loanRate - ставка по кредиту в месяц
        double y = Math.pow(1 + loanRate, loanTerm * 12);
        double coefficient = (loanRate * y) / (y - 1); // coefficient - коэффициент аннуитета
        double payment = coefficient * loanAmount;
        return payment;
    }
}

package q;

public class Calculator {

    public double monthlyPayment(double credit, double rate, double term) {
        rate = rate / 100;
        double result = Math.round(credit * (rate + (rate / (Math.pow((1 + rate), term) - 1))) * 100) / 100.00;
        return result;
    }

    public double total(double credit, double rate, double term) {

        double result = monthlyPayment(credit, rate, term);
        result = Math.round(result * term * 100) / 100.00;
        return result;
    }

    public double overpayment(double credit, double rate, double term) {
        double result = total(credit, rate, term);
        result = Math.round((result - credit) * 100) / 100.00;
        return result;
    }
}
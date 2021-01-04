package q;

public class Main {
    public static void main(String[] args) {
        double term = 24;                           //срок кредита, мес.
        double rate = 2;                         //ставка по кредита, % в мес.
        double credit = 100000;                    //размер кредита.
        Calculator calculator = new Calculator();
        double monthlyPayment = calculator.monthlyPayment(credit, rate, term);
        double total = calculator.total(credit, rate, term);
        double overpayment = calculator.overpayment(credit, rate, term);
        System.out.println("Ежемесячный платеж - " + monthlyPayment + " рублей");
        System.out.println("Полная сумма погашения - " + total + " рублей");
        System.out.println("Сумма переплаты - " + overpayment + " рублей");
    }
}

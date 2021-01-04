package q;

import org.junit.jupiter.api.Assertions;

public class TestCalculator {
    @org.junit.jupiter.api.Test
    public void testMonthlyPayment() {
        // given:
        Calculator calculator = new Calculator();
        double term = 12;                           //срок кредита, мес.
        double rate = 1;                         //ставка по кредита, % в мес.
        double credit = 1000000;                    //размер кредита.
        double monthlyPayment = 88848.79;       //сумма ежемесячного платежа образцовая
        // when:
        double monthlyPaymentTest = calculator.monthlyPayment(credit, rate, term);
        // then:
        Assertions.assertTrue(monthlyPaymentTest == monthlyPayment);
    }

    @org.junit.jupiter.api.Test
    public void testTotal() {
        // given:
        Calculator calculator = new Calculator();
        double term = 12;                           //срок кредита, мес.
        double rate = 1;                         //ставка по кредита, % в мес.
        double credit = 1000000;                    //размер кредита.
        double total = 1066185.48;    // общая сумма к возврату образцовая
        // when:
        double totalTest = calculator.total(credit, rate, term);
        // then:
        Assertions.assertTrue(totalTest == total);
    }

    @org.junit.jupiter.api.Test
    public void testOverpayment() {
        // given:
        Calculator calculator = new Calculator();
        double term = 12;                           //срок кредита, мес.
        double rate = 1;                         //ставка по кредита, % в мес.
        double credit = 1000000;                    //размер кредита.
        double overpayment = 66185.48;      // сумма переплаты образцовая
        // when:
        double overpaymentTest = calculator.overpayment(credit, rate, term);
        // then:
        Assertions.assertTrue(overpaymentTest == overpayment);
    }
}

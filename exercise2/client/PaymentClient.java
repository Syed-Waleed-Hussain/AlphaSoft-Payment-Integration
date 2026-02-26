package base.client;

import base.core.PaymentService;

public class PaymentClient {
    private PaymentService paymentService;

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void processClientPayment(double amount) {
        System.out.println("Client initiating payment...");
        boolean isSuccess = paymentService.pay(amount);
        if (isSuccess) {
            System.out.println("Payment completed successfully.");
        }
    }
}

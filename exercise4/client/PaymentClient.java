package exercise4.client;

import exercise4.core.PaymentService;

public class PaymentClient {
    private PaymentService paymentService;

    public PaymentClient(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    public void setPaymentProvider(PaymentService newService) {
        this.paymentService = newService;
        System.out.println("[System] Payment provider switched.");
    }

    public void processClientPayment(double amount) {
        System.out.println("Client initiating payment...");
        boolean isSuccess = paymentService.pay(amount);
        if (isSuccess) {
            System.out.println("Payment completed successfully.");
        }
    }
}
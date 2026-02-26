package exercise5.client;

import exercise5.core.PaymentService;
import exercise5.integration.MockPayService;

public class Main {
    public static void main(String[] args) {
        PaymentService mockAdapter = new MockPayService();
        
        PaymentClient client = new PaymentClient(mockAdapter);
        
        client.processClientPayment(500.0);
    }
}
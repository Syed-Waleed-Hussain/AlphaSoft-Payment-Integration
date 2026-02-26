package exercise4.client;

import exercise4.core.PaymentService;
import exercise4.external.LegacyPayService;
import exercise4.external.GlobalPayService;
import exercise4.integration.LegacyPayIntegration;
import exercise4.integration.GlobalPayIntegration;

public class Main {
    public static void main(String[] args) {
        
        PaymentService legacyAdapter = new LegacyPayIntegration(new LegacyPayService());
        PaymentClient client = new PaymentClient(legacyAdapter);
        client.processClientPayment(120.0);

        PaymentService globalAdapter = new GlobalPayIntegration(new GlobalPayService(), "EUR");
        client.setPaymentProvider(globalAdapter);
        
        client.processClientPayment(130.0);
    }

}

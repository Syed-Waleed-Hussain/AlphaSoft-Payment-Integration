package base.client;

import base.external.LegacyPayService;
import base.integration.LegacyPayIntegration;
import base.core.PaymentService;

public class Main {
    public static void main(String[] args) {
       
        LegacyPayService legacyService = new LegacyPayService();
        
        PaymentService adapter = new LegacyPayIntegration(legacyService);
        
        PaymentClient client = new PaymentClient(adapter);
        client.processClientPayment(250.0);
    }
}
package exercise3.integration;

import exercise3.core.PaymentService;
import exercise3.external.LegacyPayService; 

public class LogIntegration implements PaymentService {
    private LegacyPayService legacyService;

    public LogIntegration(LegacyPayService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("[AlphaSoft Log] Payment successful -> TXN-OK :: Amount=" + amount);
        return true;
    }
}
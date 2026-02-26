package base.integration;

import base.core.PaymentService;
import base.external.LegacyPayService;

public class LegacyPayIntegration implements PaymentService {
    private LegacyPayService legacyService;

    public LegacyPayIntegration(LegacyPayService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public boolean pay(double amount) {
        legacyService.makePayment(amount);
        return true;
    }

}

package exercise1.integration;

import exercise1.core.PaymentService;
import exercise1.external.CentPayService;

public class CentPayIntegration implements PaymentService {
    private CentPayService centService;

    public CentPayIntegration(CentPayService centService) {
        this.centService = centService;
    }

    @Override
    public boolean pay(double amount) {
        // Dollar ko cents mein convert kar rahay hain
        int cents = (int) (amount * 100);
        centService.processInCents(cents);
        return true;
    }
}
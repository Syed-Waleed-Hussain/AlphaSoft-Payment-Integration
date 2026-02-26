package exercise2.integration;

import exercise2.core.PaymentService;
import exercise2.external.GlobalPayService;

public class GlobalPayIntegration implements PaymentService {
    private GlobalPayService globalService;
    private String defaultCurrency;

    public GlobalPayIntegration(GlobalPayService globalService, String defaultCurrency) {
        this.globalService = globalService;
        this.defaultCurrency = defaultCurrency;
    }

    @Override
    public boolean pay(double amount) {
        
        globalService.executeTransaction(defaultCurrency, amount);
        return true;
    }
}
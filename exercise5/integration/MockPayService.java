package exercise5.integration;
import exercise5.core.PaymentService;

public class MockPayService implements PaymentService {
    @Override
    public boolean pay(double amount) {
        System.out.println("[MockPayService] Simulating payment of $" + amount);
        System.out.println("[Test Mode] No real transaction executed.");
        return true;
    }
}

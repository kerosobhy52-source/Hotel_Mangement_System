import java.time.LocalDate;

public class Payment {

    private double amount;
    private PaymentMethod method;
    private LocalDate date;

    public Payment(double amount, PaymentMethod method) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount");

        this.amount = amount;
        this.method = method;
        this.date = LocalDate.now();
    }

    public double getAmount() {
        return amount;
    }
}

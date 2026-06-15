package service;

public class PaypalService implements OnlinePaymentService {

    @Override
    public Double paymentFee(Double amount) {
        return 0.02 * amount;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return 0.01 * amount * months;
    }
}

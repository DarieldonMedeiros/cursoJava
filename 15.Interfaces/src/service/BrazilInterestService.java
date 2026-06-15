package service;

@SuppressWarnings({"ClassCanBeRecord","unused"})
public class BrazilInterestService implements InterestService {

    private final Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }

}

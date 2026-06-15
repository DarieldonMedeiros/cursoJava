package service;

@SuppressWarnings({"ClassCanBeRecord","unused"})
public class UsaInterestService implements InterestService {

    private final Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public Double getInterestRate() {
        return interestRate;
    }

}

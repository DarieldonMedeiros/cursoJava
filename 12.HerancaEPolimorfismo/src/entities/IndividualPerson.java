package entities;

@SuppressWarnings("unused")
public class IndividualPerson extends Person {

    public Double healthExpenditures;

    public IndividualPerson() {
        super();
    }

    public IndividualPerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthSpending() {
        return healthExpenditures;
    }

    public void setHealthSpending(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        return (getAnnualIncome() < 20000.00 ? 0.15*getAnnualIncome() : 0.25* getAnnualIncome()) - healthExpenditures/2.0;
    }
}

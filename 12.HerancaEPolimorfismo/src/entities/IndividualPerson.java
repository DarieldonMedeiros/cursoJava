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
        double healthExpendituresCheck = healthExpenditures > 0.0 ? healthExpenditures/2.0 : 0.0;
        return (getAnnualIncome() < 20000.00 ? 0.15*getAnnualIncome() : 0.25* getAnnualIncome()) - healthExpendituresCheck;
    }
}

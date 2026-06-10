package entities;

@SuppressWarnings("unused")
public class CompanyPerson extends Person {

    private Integer numberOfEmployees;

    public CompanyPerson() {
        super();
    }

    public CompanyPerson(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        return (numberOfEmployees > 10 ? 0.14 : 0.16) * getAnnualIncome();
    }
}

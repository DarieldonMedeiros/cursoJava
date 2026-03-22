package entities;

import java.math.BigDecimal;

public class Employee {

    private Long id;
    private String name;
    private BigDecimal salary;

    public Employee(Long id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal increaseSalary(BigDecimal percentage) {
        BigDecimal increaseAmount = salary.multiply(percentage).divide(BigDecimal.valueOf(100));
        return salary.add(increaseAmount);
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary.doubleValue());
    }

    
}

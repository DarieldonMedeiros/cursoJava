package entities;

@SuppressWarnings("unused")
public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return   name + ", " + String.format("%.2f", salary);
    }

    @Override
    public int compareTo(Employee other) {
//        return name.compareTo(other.getName()); // Ordenar por nome - ordem crescente
//        return -name.compareTo(other.getName()); // Ordenar por nome - ordem decrescente
//        return salary.compareTo(other.getSalary()); // Ordenar por salário - ordem crescente
        return -salary.compareTo(other.getSalary()); // Ordenar por salário - ordem decrescente
    }
}

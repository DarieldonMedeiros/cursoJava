package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@SuppressWarnings("unused")
public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private final List<HourContract> contracts = new ArrayList<>(); // Lista é normalmente instanciada sem precisar do construtor

    // Construtor padrão
    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    // Não pode ter o setContracts para que a lista de contratos não seja trocada

    // Métodos adicionais
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        double sum = baseSalary;
        Calendar cal =  Calendar.getInstance();

        for (HourContract contract : contracts) {
            cal.setTime(contract.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            if (year == c_year && month == c_month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}

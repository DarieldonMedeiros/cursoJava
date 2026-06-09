package com.darieldon.worker.entities;

import com.darieldon.worker.entities.enums.WorkerLevel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_worker")
@SuppressWarnings("unused")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(mappedBy = "worker", cascade =  CascadeType.ALL, orphanRemoval = true)
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
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

    public void addContract(HourContract contract) {
        contracts.add(contract);
        contract.setWorker(this);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
        contract.setWorker(null); // Opcional
    }

    public Double income(Integer year, Integer month) {
        double sum = baseSalary;

        // Aqui vai buscar no banco de dados, logo não é necessário mudar a lógica
        for(HourContract contract: contracts) {
            if (contract.getDate().getYear() == year && contract.getDate().getMonthValue() == month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Objects.equals(getId(), worker.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}

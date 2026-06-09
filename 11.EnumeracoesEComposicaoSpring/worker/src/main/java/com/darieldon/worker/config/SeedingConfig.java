package com.darieldon.worker.config;

import com.darieldon.worker.entities.Department;
import com.darieldon.worker.entities.HourContract;
import com.darieldon.worker.entities.Worker;
import com.darieldon.worker.entities.enums.WorkerLevel;
import com.darieldon.worker.repositories.DepartmentRepository;
import com.darieldon.worker.repositories.WorkerRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Configuration
public class SeedingConfig implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private WorkerRepository workerRepository;

    @Transactional  // Só por confirmar que isso está numa transação, gerenciada pela JPA, faz o salvamento dela
    // Pois em Worker foi feito o relacionamento com HourContract
    @Override
    public void run(String @NonNull ... args) {
        Department dept = new Department("Design");
        dept = departmentRepository.save(dept);
        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.0, dept);
        worker = workerRepository.save(worker);
        HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50.0, 20);
        HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30.0, 18);
        HourContract contract3 = new HourContract(LocalDate.of(2018, 8, 25), 80.0, 10);

        worker.addContract(contract1);
        worker.addContract(contract2);
        worker.addContract(contract3);
    }
}

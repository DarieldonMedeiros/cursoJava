package com.darieldon.worker.controller;

import com.darieldon.worker.dto.WorkerIncomeDTO;
import com.darieldon.worker.entities.Worker;
import com.darieldon.worker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping(value = "{id}/income/{year}/{month}")
    public WorkerIncomeDTO getIncome(@PathVariable Long id, @PathVariable Integer year, @PathVariable Integer month) {
        Optional<Worker> optionalWorker = workerRepository.findById(id);
        Worker worker = optionalWorker.orElse(new Worker());

        return new WorkerIncomeDTO(worker.getName(), worker.getDepartment().getName(), worker.income(year, month));
    }
}

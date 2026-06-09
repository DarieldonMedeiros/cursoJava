package com.darieldon.worker.repositories;

import com.darieldon.worker.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

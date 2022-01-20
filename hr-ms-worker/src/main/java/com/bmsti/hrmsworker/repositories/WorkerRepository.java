package com.bmsti.hrmsworker.repositories;

import com.bmsti.hrmsworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}

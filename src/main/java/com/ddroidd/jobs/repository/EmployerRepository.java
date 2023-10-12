package com.ddroidd.jobs.repository;

import com.ddroidd.jobs.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
}

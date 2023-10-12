package com.ddroidd.jobs.repository;

import com.ddroidd.jobs.model.JobListing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobListingRepository extends JpaRepository<JobListing, Long> {

}

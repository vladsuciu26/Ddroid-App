package com.ddroidd.jobs.controller;

import com.ddroidd.jobs.dto.ApplicantDto;
import com.ddroidd.jobs.exception.JobListingNotFoundException;
import com.ddroidd.jobs.service.JobListingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/joblistings")
public class JobListingController {

    private final JobListingService jobListingService;

    public JobListingController(JobListingService jobListingService) {
        this.jobListingService = jobListingService;
    }

    @PostMapping("/{jobId}/apply")
    public ResponseEntity<Void> apply(@PathVariable Long jobId, @Valid @RequestBody ApplicantDto applicantDetails) throws JobListingNotFoundException {
        jobListingService.apply(jobId, applicantDetails);

        return ResponseEntity.ok().build();
    }
}

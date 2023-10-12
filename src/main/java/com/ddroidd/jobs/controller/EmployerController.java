package com.ddroidd.jobs.controller;

import com.ddroidd.jobs.dto.ApplicantDto;
import com.ddroidd.jobs.dto.ErrorDetails;
import com.ddroidd.jobs.dto.JobListingDto;
import com.ddroidd.jobs.exception.EmployerNotFoundException;
import com.ddroidd.jobs.exception.JobListingNotFoundException;
import com.ddroidd.jobs.service.JobListingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employers/{employerId}")
public class EmployerController {
    private final JobListingService jobListingService;

    public EmployerController(JobListingService jobListingService) {
        this.jobListingService = jobListingService;
    }

    @PostMapping("/joblistings")
    public ResponseEntity<Void> createJobListing(@PathVariable Long employerId, @RequestBody JobListingDto jobListingDto) throws EmployerNotFoundException {
        jobListingService.create(employerId, jobListingDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/joblistings")
    public ResponseEntity<List<JobListingDto>> getAllJobListing(@PathVariable Long employerId) throws EmployerNotFoundException {
        return ResponseEntity.ok(jobListingService.getAll(employerId));
    }

    @GetMapping
    public ResponseEntity<List<ApplicantDto>> getAllApplicants(@PathVariable Long employerId) throws EmployerNotFoundException {
        return ResponseEntity.ok(jobListingService.getAllApplicants(employerId));
    }

    @DeleteMapping("/joblistings/{jobListingId}")
    public ResponseEntity<Void> deleteJobListing(@PathVariable Long employerId, @PathVariable Long jobListingId) throws EmployerNotFoundException, JobListingNotFoundException {
        jobListingService.delete(employerId, jobListingId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/joblistings/{jobListingId}/applicants")
    public ResponseEntity<List<ApplicantDto>> getAllApplicantsForJobListing(@PathVariable Long employerId, @PathVariable Long jobListingId) throws EmployerNotFoundException, JobListingNotFoundException {
        return ResponseEntity.ok(jobListingService.getAllApplicantsForJobListing(employerId, jobListingId));
    }
}

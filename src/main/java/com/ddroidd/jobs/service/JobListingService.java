package com.ddroidd.jobs.service;

import com.ddroidd.jobs.dto.ApplicantDto;
import com.ddroidd.jobs.dto.JobListingDto;
import com.ddroidd.jobs.exception.EmployerNotFoundException;
import com.ddroidd.jobs.exception.JobListingNotFoundException;

import java.util.List;

public interface JobListingService {

    void create(Long employerId, JobListingDto jobListingDto) throws EmployerNotFoundException;

    void delete(Long employerId, Long jobListingId) throws EmployerNotFoundException, JobListingNotFoundException;

    List<JobListingDto> getAll(Long employerId) throws EmployerNotFoundException;

    List<ApplicantDto> getAllApplicants(Long employerId) throws EmployerNotFoundException;

    List<ApplicantDto> getAllApplicantsForJobListing(Long employerId, Long jobListingId) throws EmployerNotFoundException, JobListingNotFoundException;

    void apply(Long jobId, ApplicantDto applicantDetails) throws JobListingNotFoundException;
}

package com.ddroidd.jobs.service.impl;

import com.ddroidd.jobs.dto.AddressDto;
import com.ddroidd.jobs.dto.ApplicantDto;
import com.ddroidd.jobs.dto.JobListingDto;
import com.ddroidd.jobs.exception.EmployerNotFoundException;
import com.ddroidd.jobs.exception.JobListingNotFoundException;
import com.ddroidd.jobs.model.Applicant;
import com.ddroidd.jobs.model.Employer;
import com.ddroidd.jobs.model.JobListing;
import com.ddroidd.jobs.repository.EmployerRepository;
import com.ddroidd.jobs.repository.JobListingRepository;
import com.ddroidd.jobs.service.JobListingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DefaultJobListingService implements JobListingService {

    private final JobListingRepository jobListingRepository;
    private final EmployerRepository employerRepository;

    public DefaultJobListingService(JobListingRepository jobListingRepository, EmployerRepository employerRepository) {
        this.jobListingRepository = jobListingRepository;
        this.employerRepository = employerRepository;
    }

    @Override
    public void create(Long employerId, JobListingDto jobListingDto) throws EmployerNotFoundException {
        JobListing jobListingModel = new JobListing();
        jobListingModel.setTitle(jobListingDto.getTitle());
        jobListingModel.setDescription(jobListingDto.getDescription());

        Optional<Employer> employerModelOptional = employerRepository.findById(employerId);
        if (!employerModelOptional.isPresent()) {
            throw new EmployerNotFoundException("No employer with id " + employerId + " found");
        }

        jobListingModel.setEmployer(employerModelOptional.get());
        jobListingRepository.save(jobListingModel);
    }

    @Transactional
    @Override
    public List<JobListingDto> getAll(Long employerId) throws EmployerNotFoundException {
        Optional<Employer> employerModelOptional = employerRepository.findById(employerId);
        if (!employerModelOptional.isPresent()) {
            throw new EmployerNotFoundException("No employer with id " + employerId + " found");
        }

        return employerModelOptional.get().getJobListings().stream()
                .map(this::buildJobListingDto)
                .collect(Collectors.toList());
    }

    private JobListingDto buildJobListingDto(JobListing jobListingModel) {
        JobListingDto jobListingDto = new JobListingDto();
        jobListingDto.setTitle(jobListingModel.getTitle());
        jobListingDto.setDescription(jobListingModel.getDescription());

        return jobListingDto;
    }

    @Transactional
    @Override
    public List<ApplicantDto> getAllApplicants(Long employerId) throws EmployerNotFoundException {
        Optional<Employer> employerModelOptional = employerRepository.findById(employerId);
        if (!employerModelOptional.isPresent()) {
            throw new EmployerNotFoundException("No employer with id " + employerId + " found");
        }

        return employerModelOptional.get().getJobListings().stream()
                .flatMap(allJobListings -> allJobListings.getApplicants().stream())
                .map(this::buildApplicantDto)
                .collect(Collectors.toList());
    }

    private ApplicantDto buildApplicantDto(Applicant applicantModel) {
        ApplicantDto applicantDto = new ApplicantDto();
        applicantDto.setFirstName(applicantModel.getFirstName());
        applicantDto.setLastName(applicantModel.getLastName());
        applicantDto.setEmailAddress(applicantModel.getEmailAddress());
        applicantDto.setPhone(applicantModel.getPhoneNumber());

        AddressDto addressDto = new AddressDto();
        addressDto.setFirstAddressLine(applicantModel.getFirstAddressLine());
        addressDto.setSecondAddressLine(applicantModel.getSecondAddressLine());
        addressDto.setCity(applicantModel.getCity());
        addressDto.setState(applicantModel.getState());
        addressDto.setCountry(applicantModel.getCountry());
        applicantDto.setAddress(addressDto);

        return applicantDto;
    }

    @Transactional
    @Override
    public void delete(Long employerId, Long jobListingId) throws EmployerNotFoundException, JobListingNotFoundException {
        Optional<Employer> employerModelOptional = employerRepository.findById(employerId);
        if (!employerModelOptional.isPresent()) {
            throw new EmployerNotFoundException("No employer with id " + employerId + " found");
        }

        Employer employer = employerModelOptional.get();
        Optional<JobListing> jobListingOptional = employer.getJobListings()
                .stream()
                .filter(jobListing -> jobListing.getId().equals(jobListingId))
                .findFirst();

        if (!jobListingOptional.isPresent()) {
            throw new JobListingNotFoundException("No job listing with id " + jobListingId);
        }

        JobListing jobListing = jobListingOptional.get();
        employer.removeJobListing(jobListing);
        jobListingRepository.delete(jobListing);
    }

    @Override
    @Transactional
    public List<ApplicantDto> getAllApplicantsForJobListing(Long employerId, Long jobListingId) throws EmployerNotFoundException, JobListingNotFoundException {
        Optional<Employer> employerModelOptional = employerRepository.findById(employerId);
        if (!employerModelOptional.isPresent()) {
            throw new EmployerNotFoundException("No employer with id " + employerId + " found");
        }

        Optional<JobListing> jobListingOptional = employerModelOptional.get().getJobListings().stream()
                .filter(jobListing -> jobListing.getId().equals(jobListingId))
                .findFirst();

        if (!jobListingOptional.isPresent()) {
            throw new JobListingNotFoundException("No job listing with id " + jobListingId + " found");
        }

        return jobListingOptional.get().getApplicants().stream()
                .map(this::buildApplicantDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void apply(Long jobListingId, ApplicantDto applicantDto) throws JobListingNotFoundException {
        JobListing jobListing = jobListingRepository.findById(jobListingId)
                .orElseThrow(() -> new JobListingNotFoundException("No job listing with id " + jobListingId + " found"));
        jobListing.addApplicant(buildApplicantModel(applicantDto));
        jobListingRepository.save(jobListing);
    }

    private Applicant buildApplicantModel(ApplicantDto applicantDto) {
        Applicant applicantModel = new Applicant();
        applicantModel.setFirstName(applicantDto.getFirstName());
        applicantModel.setLastName(applicantDto.getLastName());
        applicantModel.setEmailAddress(applicantDto.getEmailAddress());
        applicantModel.setPhoneNumber(applicantDto.getPhone());
        applicantModel.setFirstAddressLine(applicantDto.getAddress().getFirstAddressLine());
        applicantModel.setSecondAddressLine(applicantDto.getAddress().getSecondAddressLine());
        applicantModel.setCity(applicantDto.getAddress().getCity());
        applicantModel.setState(applicantDto.getAddress().getState());
        applicantModel.setCountry(applicantDto.getAddress().getCountry());

        return applicantModel;
    }
}

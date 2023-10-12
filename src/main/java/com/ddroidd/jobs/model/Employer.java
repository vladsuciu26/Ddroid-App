package com.ddroidd.jobs.model;

import com.ddroidd.jobs.model.JobListing;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employers")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String emailAddress;

    @OneToMany(mappedBy = "employer")
    private Set<JobListing> jobListings = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Set<JobListing> getJobListings() {
        return jobListings;
    }

    public void setJobListings(Set<JobListing> jobListings) {
        this.jobListings = jobListings;
    }

    public void removeJobListing(JobListing jobListing) {
        this.jobListings.remove(jobListing);
        jobListing.setEmployer(null);
    }
}

package com.ddroidd.jobs.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "joblistings")
public class JobListing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "job_listing_applicant",
            joinColumns = @JoinColumn(name = "job_listing_id"),
            inverseJoinColumns = @JoinColumn(name = "applicant_id"))
    private Set<Applicant> applicants = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(Set<Applicant> applicants) {
        this.applicants = applicants;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void addApplicant(Applicant applicant) {
        this.applicants.add(applicant);
        applicant.getJobListings().add(this);
    }
}

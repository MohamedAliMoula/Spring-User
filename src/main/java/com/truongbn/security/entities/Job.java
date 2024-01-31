package com.truongbn.security.entities;

import jakarta.persistence.*;



@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titreJob;
    private String descriptionJob;
    private String emailAddress;
    private String username;
    private String specialisms;
    private String jobType;
    private String industry;
    private String careerLevel;
    private int experience;

    public Job() {
    }

    public Job(Long id, String titreJob, String descriptionJob, String emailAddress, String username, String specialisms, String jobType, String industry, String careerLevel, int experience) {
        this.id = id;
        this.titreJob = titreJob;
        this.descriptionJob = descriptionJob;
        this.emailAddress = emailAddress;
        this.username = username;
        this.specialisms = specialisms;
        this.jobType = jobType;
        this.industry = industry;
        this.careerLevel = careerLevel;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitreJob() {
        return titreJob;
    }

    public void setTitreJob(String titreJob) {
        this.titreJob = titreJob;
    }

    public String getDescriptionJob() {
        return descriptionJob;
    }

    public void setDescriptionJob(String descriptionJob) {
        this.descriptionJob = descriptionJob;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSpecialisms() {
        return specialisms;
    }

    public void setSpecialisms(String specialisms) {
        this.specialisms = specialisms;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getCareerLevel() {
        return careerLevel;
    }

    public void setCareerLevel(String careerLevel) {
        this.careerLevel = careerLevel;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    // Getters and setters (omitted for brevity)

    // Constructors (default and parameterized)
    // Getters and Setters
    // Other methods, if required...
}


package com.truongbn.security.controller;

import com.truongbn.security.entities.Job;
import com.truongbn.security.service.impl.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin("*")
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        return jobService.getJobById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.saveJob(job);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Job> updateJob(@PathVariable Long id, @RequestBody Job updatedJob) {
        return jobService.getJobById(id).map(job -> {
            job.setTitreJob(updatedJob.getTitreJob());
            job.setDescriptionJob(updatedJob.getDescriptionJob());
            job.setEmailAddress(updatedJob.getEmailAddress());
            job.setUsername(updatedJob.getUsername());
            job.setSpecialisms(updatedJob.getSpecialisms());
            job.setJobType(updatedJob.getJobType());
            job.setIndustry(updatedJob.getIndustry());
            job.setCareerLevel(updatedJob.getCareerLevel());
            job.setExperience(updatedJob.getExperience());
            return ResponseEntity.ok(jobService.saveJob(job));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
        return ResponseEntity.noContent().build();
    }

    // Other CRUD methods as needed...
}

package com.truongbn.security.repository;


import com.truongbn.security.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // You can define custom query methods here if needed
}

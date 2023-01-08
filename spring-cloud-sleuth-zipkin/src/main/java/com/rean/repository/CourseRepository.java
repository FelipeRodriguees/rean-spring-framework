package com.rean.repository;

import com.rean.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<Course> findFirstById(Long id);

    Page<Course> findAllBy(Pageable pageable);
    Page<Course> findAllByNameContainingIgnoreCase(String name, Pageable pageable);
    Page<Course> findAllByPrice(BigDecimal price, Pageable pageable);
    Page<Course> findAllByNameContainingIgnoreCaseAndPrice(String name, BigDecimal price, Pageable pageable);
}

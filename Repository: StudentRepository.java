package com.yourname.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yourname.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

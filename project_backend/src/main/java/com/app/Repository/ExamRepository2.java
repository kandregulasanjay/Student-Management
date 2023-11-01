package com.app.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Exam;


public interface ExamRepository2 extends JpaRepository<Exam,String> {
	
}

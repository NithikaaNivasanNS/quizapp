package com.nithikaa.quiz_application.repository;

import com.nithikaa.quiz_application.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Integer> {
}

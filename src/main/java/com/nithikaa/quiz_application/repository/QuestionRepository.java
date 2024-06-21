package com.nithikaa.quiz_application.repository;

import com.nithikaa.quiz_application.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> ,QuestionRepositoryCustom{
    List<Question> findByCategory(String category);


    /*@Query(value = "SELECT * FROM quiz q WHERE q.category=:category ORDER BY RAND() LIMIT:numQ",nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, Integer numQ);*/
}



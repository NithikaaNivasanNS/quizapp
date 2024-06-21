package com.nithikaa.quiz_application.repository;

import com.nithikaa.quiz_application.model.Question;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;

@Repository
public class QuestionRepositoryImpl implements QuestionRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Question> findRandomQuestionsByCategory(String category, int numQ) {
        String sql = "SELECT * FROM quiz q WHERE q.category = :category ORDER BY RAND() LIMIT " + numQ;
        Query query = entityManager.createNativeQuery(sql, Question.class);
        query.setParameter("category", category);
        return query.getResultList();
    }
}
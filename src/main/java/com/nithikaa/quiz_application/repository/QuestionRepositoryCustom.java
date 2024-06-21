package com.nithikaa.quiz_application.repository;

import com.nithikaa.quiz_application.model.Question;

import java.util.List;

public interface QuestionRepositoryCustom {
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
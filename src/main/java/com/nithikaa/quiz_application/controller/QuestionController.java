package com.nithikaa.quiz_application.controller;

import com.nithikaa.quiz_application.model.Question;
import com.nithikaa.quiz_application.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestion(){
        return questionService.getAllQuestions();


    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getAllQuestionByCategory(@PathVariable String category){
        return questionService.getAllQuestionByCategory(category);
    }

    @PostMapping("addQ")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}

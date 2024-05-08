package com.quiz.controller;


import com.quiz.repository.QuizProgramRepository;
import com.quiz.entity.QuizQuestions;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = {"http://localhost:3000/", "*"})
@RestController
public class QuizController {

    @Autowired
    QuizService quizService;

    @GetMapping(path = "linkQuiz")
    public List<QuizQuestions> getQuestions() {
        return quizService.getQuestions();
    }

    @PostMapping(consumes = "application/json" , path = "submitAnswer")
    public Integer submitAnswer(@RequestBody List<QuizQuestions> answers){
        return quizService.verifyAnswers(answers);
    }
}

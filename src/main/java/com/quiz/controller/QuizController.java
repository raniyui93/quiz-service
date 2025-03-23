package com.quiz.controller;

import com.quiz.entity.QuizQuestions;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @GetMapping(path = "/questions")
    public List<QuizQuestions> getQuestions() {
        return quizService.getQuestions();
    }

    @PostMapping(consumes = "application/json" , path = "/answers")
    public Integer submitAnswer(@RequestBody List<QuizQuestions> answers){
        return quizService.verifyAnswers(answers);
    }
}

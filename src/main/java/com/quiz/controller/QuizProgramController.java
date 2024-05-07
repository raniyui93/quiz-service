package com.quiz.controller;


import com.quiz.repository.QuizProgramRepository;
import com.quiz.entity.QuizQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = {"http://localhost:3000/", "*"})
@RestController
public class QuizProgramController {
    @Autowired
    QuizProgramRepository quizProgramRepository;

    @GetMapping(path = "linkQuiz")
    public List<QuizQuestions> getQuestions() {
        List<QuizQuestions> questions = quizProgramRepository.findAll();
        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).setAnswer("");
        }
        return questions;
    }

    @PostMapping(consumes = "application/json" , path = "submitAnswer")
    public Integer submitAnswer(@RequestBody List<QuizQuestions> questions){
        Integer score = 0;
        for(int i=0;i< questions.size();i++){
          QuizQuestions question =   questions.get(i);
          String answer = question.getAnswer();

         Optional<QuizQuestions> optionalQuizQuestion = quizProgramRepository.findById(question.getID());
            if (optionalQuizQuestion.isPresent()) {
              QuizQuestions databaseQuestions =  optionalQuizQuestion.get();
              String actualAnswer = databaseQuestions.getAnswer();
              if(answer.equals(actualAnswer)){
                  score++;
              }
            }
        }
        return score;
    }
}

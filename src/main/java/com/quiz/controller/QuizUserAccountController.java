package com.quiz.controller;


import com.quiz.entity.QuizUserAccount;
import com.quiz.repository.QuizUserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizUserAccountController {

    @Autowired
    QuizUserAccountRepository quizUserAccountRepository;

    @PostMapping(consumes = "application/json" , path = "accountDetails")
    public QuizUserAccount createAccount(@RequestBody QuizUserAccount userAccount){
        QuizUserAccount  saving = quizUserAccountRepository.save(userAccount);
        return saving;
    }
}

package com.quiz.service;

import com.quiz.entity.QuizQuestions;
import com.quiz.repository.QuizProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizService{
    @Autowired
    QuizProgramRepository quizProgramRepository;

    @Override
    public List<QuizQuestions> getQuestions() {
        List<QuizQuestions> questions = quizProgramRepository.findAll();
        for (int i = 0; i < questions.size(); i++) {
            questions.get(i).setAnswer("");
        }
        return questions;
    }

    @Override
    public Integer verifyAnswers(List<QuizQuestions> answers) {
        Integer score = 0;
        for(int i=0;i< answers.size();i++){
            QuizQuestions question =   answers.get(i);
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

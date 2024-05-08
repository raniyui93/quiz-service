package com.quiz.service;

import com.quiz.entity.QuizQuestions;

import java.util.List;

public interface QuizService {
    /**
     * Returns list of Questions along with possible options
     * @return
     */
    List<QuizQuestions> getQuestions();

    /**
     * Verifies the submitted answers
     * @param answers
     * @return no. of correct answers
     */
    Integer verifyAnswers(List<QuizQuestions> answers);
}

package com.quiz.repository;

import com.quiz.entity.QuizUserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizUserAccountRepository extends JpaRepository<QuizUserAccount,Integer> {
}

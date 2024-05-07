package com.quiz.repository;
import com.quiz.entity.QuizQuestions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizProgramRepository extends JpaRepository<QuizQuestions,Integer> {
    }


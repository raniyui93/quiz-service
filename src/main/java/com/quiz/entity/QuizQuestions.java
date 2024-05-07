package com.quiz.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "quiz ")
public class QuizQuestions {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String questions;
  private String optionOne;
  private String optionTwo;
  private String optionThree;
  private String optionFour;
  private String answer;

  public int  getID(){
    return id;
  }
  public void setQuestions(int id){
    this.id = id;
  }
  public String getQuestions() {
      return questions;
  }
  public void setQuestions(String questions){
    this.questions = questions;
  }
  public String getOptionOne(){
    return optionOne;
  }
  public void setOptionOne(String optionOne){
    this.optionOne = optionOne;
  }
  public String getOptionTwo(){
    return optionTwo;
  }
  public void setOptionTwo(String optionTwo){
    this.optionTwo = optionTwo;
  }
  public String getOptionThree(){
    return optionThree;
  }
  public void setOptionThree(String optionThree){
    this.optionThree = optionThree;
  }
  public  String getOptionFour(){
    return optionFour;
  }
  public void setOptionFour(String optionFour){
    this.optionFour = optionFour;
  }
  public String getAnswer(){
    return answer;
  }
  public void setAnswer(String answer){
    this.answer = answer;
  }
}

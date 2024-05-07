package com.quiz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CreateAccount ")
public class QuizUserAccount {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;

    public int getPersonId(){
        return personId;
    }
    public void setPersonId(int personId){
        this . personId = personId;
    }

    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this . emailId = emailId;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}

package hu.cubix.spring.hr.vik.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

public class Employee {
    private int id;
    private String job;
    private int salary;
    private LocalDateTime timestamp;

//Constructor to initialize the attributes
    public Employee(int id,String job,int salary, LocalDateTime timestamp){

        this.id=id;
        this.job=job;
        this.salary=salary;
        this.timestamp=timestamp;


    }
    //Setter methods to set the attributes of the object
    public void setId(int id){
        this.id=id;
    }
    public void setJob(String job){
        this.job=job;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp=timestamp;
    }

    //Getter methods to get the attributes of the object
    public int getId(){
        return this.id;
    }
    public String getJob(){
        return this.job;
    }
    public int getSalary(){
        return this.salary;
    }
    public LocalDateTime getTimestamp(){
        return this.timestamp;
    }




}

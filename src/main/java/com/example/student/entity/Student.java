package com.example.student.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String address;
    private String student_class;

    public Student(){};

    public Student(String nsme,String email,String address,String student_class){
        this.name = name;
        this.email = email;
        this.address = address;
        this.student_class = student_class;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getStudent_class(){
        return student_class;
    }

    public void setStudent_class(String student_class){
        this.student_class = student_class;
    }


}

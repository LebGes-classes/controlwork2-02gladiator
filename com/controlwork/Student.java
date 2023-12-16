package com.controlwork;

public class Student {
    private String surname;
    private String name;
    private String patronymic;
    private int mark;

    public Student(String surname,
                   String name,
                   String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.mark = 0;
    }
    public Student(){
        this.mark = 0;
    }




    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getPatronymic(){
        return patronymic;
    }

    public String printInfo(){
        String info = surname + name + patronymic;
        return info;
    }
    public int getMark(){
        return mark;
    }
}
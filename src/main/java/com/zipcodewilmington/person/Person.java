package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean isFemale;
    private char favAlphabet;
    private float height;
    private double salary;



    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.isFemale = false;
        this.favAlphabet = 'S';
        this.height = 5.7f;
        this.salary = 500000.00;

    }

    public Person(int age) {
        this.age = age;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(boolean isFemale){
        this.isFemale = isFemale;
    }

    public Person (char favAlphabet){
        this.favAlphabet = favAlphabet;
    }

    public Person(float height){
        this.height= height;
    }

    public Person(double salary){
        this.salary = salary;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person (String name,  int age, boolean isFemale, char favAlphabet,
             float height, double salary){
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.favAlphabet = favAlphabet;
        this.height = height;
        this.salary = salary;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }
}

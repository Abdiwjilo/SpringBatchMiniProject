package com.example.batchprocessing;

public class Person {

    private String lastName;

    public Person(String lastName, String firstName, double GPA, int Age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.GPA = GPA;
        this.Age = Age;
    }

    private String firstName;
    private double GPA;
    private int Age;

    public Person() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGPA() {return GPA;}

    public void setGPA(double GPA) {this.GPA = GPA;}

    public int getAge() {return Age;}

    public void setAge(int age) {Age = age;}

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", GPA=" + GPA +
                ", Age=" + Age +
                '}';
    }
}
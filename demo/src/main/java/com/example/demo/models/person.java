package com.example.demo.models;

public class person {
    // Fields
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    // Constructors
    public person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Additional Methods
    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an instance of the Person class
        person person = new person("John", "Doe", 25, "Male");

        // Displaying information about the person
        person.displayInfo();
    }
}


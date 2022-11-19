package ge.softgen.softlab.tutorial.impl;

import ge.softgen.softlab.tutorial.abstraction.Entity;

import java.time.LocalDate;

public class Person extends Entity {

    public Person(String firstName, String lastName, LocalDate birthDate) throws Exception {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthDate(birthDate);
        setSalary(0);
        count++;
    }

    private String firstName;
    private String lastName;
    private int salary;

    private static int count = 0;

    public static int getCount() {
        return count;
    }
    public String getLastName() {
        return lastName;
    }


    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        if(salary < 0) {
            throw new RuntimeException("salary can't be negative integer");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

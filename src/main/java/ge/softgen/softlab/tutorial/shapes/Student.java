package ge.softgen.softlab.tutorial.shapes;

import ge.softgen.softlab.tutorial.impl.Person;

import java.time.LocalDate;

public class Student extends Person {
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String firstName, String lasName, LocalDate birthDate, double gpa) throws Exception {
        super(firstName, lasName, birthDate);
        this.gpa = gpa;


    }
}

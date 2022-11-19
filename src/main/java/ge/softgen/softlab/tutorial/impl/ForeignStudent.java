package ge.softgen.softlab.tutorial.impl;

import ge.softgen.softlab.tutorial.shapes.Student;

import java.time.LocalDate;

public class ForeignStudent extends Student {

    private String country;
    public ForeignStudent(String firstName, String lastName, LocalDate birthDate, double gpa) throws Exception {
        super(firstName, lastName, birthDate, gpa);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

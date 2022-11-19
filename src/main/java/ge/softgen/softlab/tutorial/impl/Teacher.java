package ge.softgen.softlab.tutorial.impl;

import java.time.LocalDate;

public class Teacher extends Person {
    public Teacher (String firstName, String lastName, LocalDate birthDate) throws Exception {
        super(firstName, lastName, birthDate);
    }
}

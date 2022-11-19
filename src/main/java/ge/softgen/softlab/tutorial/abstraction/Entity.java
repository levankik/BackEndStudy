package ge.softgen.softlab.tutorial.abstraction;

import ge.softgen.softlab.tutorial.exceptions.BirthDateRageException;
import ge.softgen.softlab.tutorial.exceptions.NullBirthdateException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Entity {
    private LocalDate birthDate;

    public  int getAge() {
        return diffInYears(birthDate, LocalDate.now());
    }

    public static int diffInYears(LocalDate date1, LocalDate date2) {
        return (int) Math.abs(ChronoUnit.YEARS.between(date1, date2));
    };
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) throws NullBirthdateException, BirthDateRageException {
        if(birthDate == null) {
            throw new NullBirthdateException("birthDate should not be null");
        }
        if(birthDate.isAfter(LocalDate.now())) {
            throw new BirthDateRageException("birthDate should be past date");
        }
        this.birthDate = birthDate;
    }
}


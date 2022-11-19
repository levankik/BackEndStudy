package ge.softgen.softlab.tutorial.impl;

import ge.softgen.softlab.tutorial.abstraction.Entity;
import ge.softgen.softlab.tutorial.exceptions.NullBirthdateException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testConstructor() throws Exception {
        LocalDate now = LocalDate.now();
        var person = new Person("vano", "atabegashvili", now);
        assertEquals("vano", person.getFirstName());
        assertEquals("atabegashvili", person.getLastName());
        assertEquals(now, person.getBirthDate());
        assertEquals(0, person.getSalary());
    }

    @Test
    public void testConstructor_when_birthdate_is_null() throws Exception {
        assertThrows(NullBirthdateException.class, () -> {
            new Person("vano", "atabegashvili", null);
        });
   }

    @Test
    public void testGetAge() throws Exception {
        LocalDate date1 = LocalDate.of(2022, 11, 1);
        LocalDate date2 = LocalDate.of(2020, 11, 1);
        int result = Entity.diffInYears(date1, date2);
        assertEquals(2, result);
    }

    @Test
    public void testCounter() throws Exception {
        assertEquals(0, Person.getCount());
        new Person("a", "b", LocalDate.now());
        assertEquals(1, Person.getCount());
        new Person("a", "b", LocalDate.now());
        assertEquals(2, Person.getCount());
        new Person("a", "b", LocalDate.now());
        assertEquals(3, Person.getCount());
    }
}
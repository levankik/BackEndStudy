package ge.softgen.softlab.tutorial.impl.validators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ISODateValidatorTest {

    @Test
    void isValid_is_null() {
        var validator = new ISODateValidator(null);
        assertEquals(false, validator.isValid());
    }

    @Test
    void isValid_is_empty() {
        var validator = new ISODateValidator("");
        assertFalse(validator.isValid());
    }

    @Test
    void isValid_is_invalid_separator() {
        var validator = new ISODateValidator("1979.04.07");
        assertFalse(validator.isValid());
    }

    @Test
    void isValid_is_invalid_length() {
        var validator = new ISODateValidator("1979-4-7");
        assertFalse(validator.isValid());
    }

    @Test
    void isValid_has_letters() {
        var validator = new ISODateValidator("aaaa-bb-cc");
        assertFalse(validator.isValid());
    }

    @Test
    void isValid_is_valid() {
        var validator = new ISODateValidator("1990-10-01");
        assertTrue(validator.isValid());
    }
}
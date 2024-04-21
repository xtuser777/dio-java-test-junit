package br.com.xt.dio.java.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionExamplesTest {

    @Test
    void shouldAgeEquals34() {
        Person p = new Person("Adam", LocalDate.of(1990, 1, 1));
        Assertions.assertEquals(34, p.getAge());
    }

    @Test
    void shouldPersonIsAdult() {
        Person p = new Person("Adam", LocalDate.of(1990, 1, 1));
        Assertions.assertTrue(p.isAdult());
    }

    @Test
    void shouldPersonIsNotNull() {
        Person p = new Person("Adam", LocalDate.of(1990, 1, 1));
        Assertions.assertNotNull(p);
    }

    @Test
    void shouldPersonIsNull() {
        Person p = null;
        Assertions.assertNull(p);
    }
}

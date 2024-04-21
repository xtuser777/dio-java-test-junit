package br.com.xt.dio.java.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class BeforeAfterExamplesTest {

    @BeforeAll
    static void openConnection() {
        Database.open();
    }

    @AfterAll
    static void closeConnection() {
        Database.close();
    }

    @BeforeEach
    void seedDatabase() {
        Database.seed();
    }

    @AfterEach
    void unseedDatabase() {
        Database.unseed();
    }

    @Test
    void shouldPersonInserted() {
        Person p = new Person("Adam", LocalDate.of(1990, 1, 1));
        boolean result = Database.insert(p);
        Assertions.assertTrue(result);
    }
}

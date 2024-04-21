package br.com.xt.dio.java.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionExampleTest {

    @Test
    void assertException() {
        Bank b = new Bank();
        Assertions.assertThrows(IllegalArgumentException.class, () -> b.transfer("123", -1));
    }

    @Test
    void assertNotException() {
        Bank b = new Bank();
        Assertions.assertDoesNotThrow(() -> b.transfer("123", 10));
    }
}

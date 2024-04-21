package br.com.xt.dio.java.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionExampleTest {

    @Test
    void enableOnlyUserIsLucas() {
        Assumptions.assumeTrue("lucas".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}

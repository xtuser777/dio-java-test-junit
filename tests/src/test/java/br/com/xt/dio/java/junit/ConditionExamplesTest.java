package br.com.xt.dio.java.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionExamplesTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "lucas")
    void enableOnlyUserIsLucas() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    @EnabledOnOs(OS.LINUX)
    @EnabledOnJre(JRE.JAVA_17)
    void enableOnlyUserIsNotRoot() {
        Assertions.assertEquals(10, 5+5);
    }
}

package br.com.xt.dio.java.junit;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final LocalDate birth;

    public Person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getAge() {
        if (this.birth == null) return 0;
        return LocalDate.now().compareTo(this.birth);
    }

    public boolean isAdult() {
        return this.getAge() >= 18;
    }
}

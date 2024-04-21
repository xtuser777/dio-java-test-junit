package br.com.xt.dio.java.junit;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Adam", LocalDate.of(1990, 1, 1));

        System.out.println(p.getAge());
    }
}

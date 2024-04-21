package br.com.xt.dio.java.junit;

public class Bank {

    public void transfer(String account, double amount) {
        if (amount <= 0) throw new IllegalArgumentException("");
    }
}

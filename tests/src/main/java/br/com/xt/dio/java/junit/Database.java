package br.com.xt.dio.java.junit;

import java.util.logging.Logger;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(Database.class.getName());

    public static void open() {
        LOGGER.info("Connection opened");
    }

    public static void close() {
        LOGGER.info("Connection closed");
    }

    public static void seed() {
        LOGGER.info("Seeding database");
    }

    public static void unseed() {
        LOGGER.info("Remove seed of database");
    }

    public static boolean insert(Person p) {
        LOGGER.info("Inserting the person: " + p);
        return true;
    }
}

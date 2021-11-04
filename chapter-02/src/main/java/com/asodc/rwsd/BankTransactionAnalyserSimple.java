package com.asodc.rwsd;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyserSimple {
    private static final String RESOURCES = "chapter-02/src/main/resources/";

    public static void main(String... args) throws Exception {
        final Path path = Paths.get(RESOURCES + "statements.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0;
        for (final String line : lines) {
            String[] columns = line.split(",");
            double amount = Double.parseDouble(columns[1]);
            total += amount;
        }

        System.out.println("The total for all transactions is " + total);
    }
}
package com.pluralsight.ordering;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ReceiptGenerator {
    private static final String FILE_LOCATION = "src/main/receipts";
    private static LocalDateTime localDateTime = LocalDateTime.now();
    private static final String RECEIPT_HEADER = "\t*** SPEZIALETTI'S PIZZERIA ***" +
            "\n" + localDateTime + "\n\n\n";
    /**
     * class that will take in data from the cart
     * and write it to a receipt     *  needs to call the file the following format
     * "yyyyMMdd-hhmmss.txt"
     */

    public void printReceipt(CalculateOrder order) {
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(FILE_LOCATION, false));
            //bufWriter.write(String.format());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

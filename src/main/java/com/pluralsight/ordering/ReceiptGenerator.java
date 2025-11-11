package com.pluralsight.ordering;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptGenerator {
    private static final LocalDateTime localDateTime = LocalDateTime.now();
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
    private static final String formatDateTime = localDateTime.format(format);

    private static final String FILE_LOCATION = "src/main/receipts/";
    private static final String FILE_NAME = formatDateTime + ".txt";
    private static final String FILE_PATH = FILE_LOCATION + FILE_NAME;
    private static final File receipt = new File(FILE_PATH);
    private static String RECEIPT_HEADER = "\t*** SPEZIALETTI'S PIZZERIA ***" +
            "\n" + formatDateTime + "\n\n\n";


    public static void printReceipt(CalculateOrder order) {
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(receipt, false));
            bufWriter.write(RECEIPT_HEADER);
            bufWriter.newLine();
            bufWriter.write(String.format(order.toString()));

            bufWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

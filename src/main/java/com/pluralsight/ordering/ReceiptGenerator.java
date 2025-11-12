package com.pluralsight.ordering;

import com.pluralsight.models.MenuItem;

import java.awt.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReceiptGenerator {
    private static final LocalDateTime localDateTime = LocalDateTime.now();
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_hh:mm:ss");
    private static final String formatDateTime = localDateTime.format(format);

    private static final String FILE_LOCATION = "src/main/receipts/";
    private static final String FILE_NAME = formatDateTime + ".txt";
    private static final String FILE_PATH = FILE_LOCATION + FILE_NAME;
    private static final File receipt = new File(FILE_PATH);
    private static String RECEIPT_HEADER = "\t*** SPEZIALETTI'S PIZZERIA ***" +
            "\n" + formatDateTime + "\n\n";


    public static void printReceipt(CalculateOrder order) {
        // need to add a check to see if the receipt folder exists
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(receipt, false));
            bufWriter.write(RECEIPT_HEADER);

            for (MenuItem orders : order.getCheckOutCart()) {
                bufWriter.write(String.format(orders.toString()));
            }

            bufWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void displayReceipt() {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(receipt));

            String input = "";

            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }
            bufReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

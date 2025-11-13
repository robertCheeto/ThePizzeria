package com.pluralsight.ordering;

import com.pluralsight.models.MenuItem;

import java.awt.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptGenerator {
    private static final LocalDateTime localDateTime = LocalDateTime.now();
    private static final DateTimeFormatter formatReceipt = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
    private static final DateTimeFormatter formatText = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
    private static final String formatReceiptTXT = localDateTime.format(formatReceipt);
    private static final String formatTextPrint = localDateTime.format(formatText);
    private static final String RECEIPT_HEADER = "\t*** SPEZIALETTI'S PIZZERIA ***" +
            "\n\t\t" + formatTextPrint + "\n\t\t**********" + "\n\n";

    private static final String FILE_LOCATION = "src/main/receipts/";
    private static final String FILE_NAME = formatReceiptTXT + ".txt";
    private static final File FILE_PATH = new File(FILE_LOCATION + FILE_NAME);
    private static final File FOLDER_PATH = new File(FILE_LOCATION);


    public static void printReceipt(CalculateOrder order) {
        if (FOLDER_PATH.exists()) {
            try {
                BufferedWriter bufWriter = new BufferedWriter(new FileWriter(FILE_PATH, false));
                bufWriter.write(RECEIPT_HEADER);

                for (MenuItem orders : order.getCheckOutCart()) {
                    bufWriter.write(String.format("\t\t- %s | $%.2f\n\n",orders.toString(), orders.getTotalPrice()));
                }
                bufWriter.write(String.format("\t\tTotal: $%.2f", CalculateOrder.getFinalReceiptPrice()));
                bufWriter.write("\n\t\t**********");
                bufWriter.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            File newFolder = new File(FILE_LOCATION);
            newFolder.mkdirs();

            try {
                BufferedWriter bufWriter = new BufferedWriter(new FileWriter(FILE_PATH, false));
                bufWriter.write(RECEIPT_HEADER);

                for (MenuItem orders : order.getCheckOutCart()) {
                    bufWriter.write(String.format("- %s | $%.2f\n\n",orders.toString(), orders.getTotalPrice()));
                }

                bufWriter.write("\n**********");
                bufWriter.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void displayReceipt() {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(FILE_PATH));

            String input;

            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }
            bufReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

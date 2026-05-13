package file;

import model.*;
import model.enums.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class PaymentListFH implements FileReader { //
    private static String FILE_NAME = "src/main/java/file/CSVFile/PaymentOverview.csv";

    @Override
    public ArrayList readFile() {
        ArrayList<Payment> payments = new ArrayList<Payment>();
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                int annualFee = Integer.parseInt(data[1]);
                PaymentStatus paymentStatus = PaymentStatus.valueOf(data[2]);


                payments.add(new Payment(id, annualFee, paymentStatus));
            }
        } catch (IOException e) {
            System.out.println("readFile Fejl");
        }
        return payments;
    }


    public void saveToFile() {

    }
}

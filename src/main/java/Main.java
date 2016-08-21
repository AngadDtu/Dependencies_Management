import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

/**
 * Created by Angad on 21/08/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer=new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Angad" , "Singh" , 5 , "Loved It");
            printer.printRecord("Amit" , "Pradhan" , 2 , "Pretty good, but could have done better");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

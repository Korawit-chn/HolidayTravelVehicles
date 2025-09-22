import java.sql.Date;
import java.util.ArrayList;

public class Invoice {
    private int invoiceID;
    private Date date;
    private double negotiatedPrice;
    private double taxes;
    private double licenseFees;
    private double tradeInAllowance;
    private boolean customerSignature;
    private Customer customer;
    private Saleperson saleperson;
    private Vehicle vehicle;
    private TradeInVehicle tradeInVehicle;
    private ArrayList<Option> options;

    public void printInvoice() {
        System.out.println();
    }
}

public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;
    private Invoice invoice;

    public Vehicle(String serialNumber, String name, String model, int year) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = "N/A";
        this.baseCost = 0;
        this.invoice = null;
    }

    public void printInfo() {
        System.out.println("Serial Number: " + this.serialNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Cost: " + this.baseCost);
        System.out.println("Invoice Detail");
        if (this.invoice == null) {
            System.out.println("No Invoice");
        } else {
            this.invoice.printInvoice();
        }
    }
}

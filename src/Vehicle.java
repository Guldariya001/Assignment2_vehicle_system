public abstract class Vehicle {

    protected String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String brand, int year, Driver driver) {
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public void displayDriver() {
        if (driver != null) {
            driver.displayDriverInfo();
        } else {
            System.out.println("No driver assigned.");
        }
    }
}

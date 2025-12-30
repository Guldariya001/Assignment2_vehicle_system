public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String brand, int year, Driver driver, boolean hasSidecar) {
        super(brand, year, driver);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}


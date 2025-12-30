public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Alex", "DL12345");
        Driver driver2 = new Driver("Maria", "DL67890");

        Vehicle car = new Car("Toyota", 2020, driver1, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2019, driver1, false);
        Vehicle truck = new Truck("Volvo", 2018, driver2, 10.5, 6);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.displayDriver();
            v.stopEngine();
            System.out.println("-------------------");
        }
    }
}


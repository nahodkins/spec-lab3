import transport.Car;
import transport.ElectricCar;
import transport.Transport;
import transport.Truck;

public class Main {

    public static void main(String[] args) {
        Transport car =
                new Car("BMW", 40.0, 9.0, 400, 0.3);
        car.drive(10);
        System.out.println();
        Transport tesla = new ElectricCar("Tesla", 3, 300);
        tesla.drive(10);
        System.out.println();
        Transport truck = new Truck("Kamaz", 450, 300.0);
        truck.drive(10);
    }
}

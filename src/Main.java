public class Main {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", 4);
        Car car2 = new Car("Audi", 4);

        Truck truck = new Truck("Volvo", 8);
        Truck truck2 = new Truck("Scania", 6);

        Bicycle bicycle = new Bicycle("Felt", 2);
        Bicycle bicycle2 = new Bicycle("Merida", 2);

        ServiceStation station = new ServiceStation();
        station.Service(car);
        station.Service(truck);
        station.Service(bicycle2);
        System.out.println(bicycle2.toString());
    }
}
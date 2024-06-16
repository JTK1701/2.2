public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Car("Hyundai", 4);
        vehicles[1] = new Car("Audi", 4);
        vehicles[2] = new Truck("Volvo", 8);
        vehicles[3] = new Truck("Scania", 6);
        vehicles[4] = new Bicycle("Felt", 2);
        vehicles[5] = new Bicycle("Merida", 2);

        ServiceStation station = new ServiceStation();
        for (int i = 0; i < vehicles.length; i++) {
            station.Service(vehicles[i]);
        }
        System.out.println(vehicles[4].toString());
    }
}
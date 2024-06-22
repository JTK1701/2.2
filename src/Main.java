public class Main {
    public static void main(String[] args) {
        Serviceable[] transport = new Serviceable[6];
        transport[0] = new Bicycle("Merida", 2);
        transport[1] = new Bicycle("Felt", 2);
        transport[2] = new Car("Hyundai", 4);
        transport[3] = new Car("Kia", 4);
        transport[4] = new Truck("Volvo", 8);
        transport[5] = new Truck("Skania", 6);
        ServiceStation serviceStation = new ServiceStation();
        for (int i = 0; i < transport.length - 1; i++) {
            serviceStation.check(transport[i]);
        }
    }
}
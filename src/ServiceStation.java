public class ServiceStation implements TypeOfRepair {
    public void Service(Object object) {
        if (object.getClass() == Bicycle.class || object.getClass() == Car.class || object.getClass() == Truck.class) {
            for (int i = 0; i < ((Vehicle) object).getWheelsCount(); i++) {
                ((TypeOfRepair) object).updateTyre();
            }
            ((TypeOfRepair) object).checkEngine();
            ((TypeOfRepair) object).checkTrailer();
        } else {
            throw new UnsupportedOperationException("Обслуживание транспортных средств данного типа не осуществляется");
        }
    }
}
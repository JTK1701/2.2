public class Truck extends Vehicle implements TypeOfRepair{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}

abstract public class Vehicle implements Serviceable {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("В работе " + this.getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void service() {
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    @Override
    public String toString() {
        return (this.getModelName() + ". Колёс - " + this.getWheelsCount());
    }
}
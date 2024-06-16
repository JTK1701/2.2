public interface TypeOfRepair {
    public default void updateTyre() {
    }

    public default void checkEngine() {
        System.out.println("У данного транспортного средства отсутствует двигатель");
    }

    public default void checkTrailer() {
        System.out.println("У данного транспортного средства отсутствует прицеп");
    }
}
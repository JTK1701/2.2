public interface TypeOfRepair {
    default void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

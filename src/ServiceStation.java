public class ServiceStation {
    public void check(Serviceable... serviceable1) {
        for (Serviceable serviceable : serviceable1) {
            serviceable.service();
        }
    }
}
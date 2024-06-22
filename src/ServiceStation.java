public class ServiceStation {
    public void check(Serviceable... serviceables) {
        for (Serviceable serviceable : serviceables) {
            serviceable.service();
        }
    }
}

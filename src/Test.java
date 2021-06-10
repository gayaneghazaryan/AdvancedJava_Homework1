public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Sargis Ghazaryan",2000,"manager",new PhoneNumber("098","232323"));

        Serialization.serializeXML(employee);
        Serialization.deserializeXML(employee);
    }
}

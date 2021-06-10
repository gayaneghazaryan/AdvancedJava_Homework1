import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Serialization {

    public static void serializeXML(Employee employee) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            File file = new File("src\\employee.xml");
            marshaller.marshal(employee,file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void deserializeXML(Employee employee) {
        JAXBContext jaxbContext;
        try {
            File file = new File("src\\employee.xml");
            jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Employee employee1 = (Employee) unmarshaller.unmarshal(file);
            System.out.println(employee1);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

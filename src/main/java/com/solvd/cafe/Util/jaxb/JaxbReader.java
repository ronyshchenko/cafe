package com.solvd.cafe.Util.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {

    public static void main(String[] args) throws JAXBException {
        File file = new File("src/main/resources/xml/file.xml");
        JAXBContext context = JAXBContext.newInstance(Citizen.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Citizen citizen = (Citizen) unmarshaller.unmarshal(file);
    }
}

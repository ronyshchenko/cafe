package com.solvd.cafe.Util.jaxb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;


public class JaxbWriter {
    public static void main(String[] args) throws JAXBException {
        String xmlFilePath = "d:/file.xml";
        Citizen citizen = new Citizen(1, "Roman", 25);
        File file = new File(xmlFilePath);
        StringWriter writer = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(Citizen.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(citizen, file);
            marshaller.marshal(citizen, writer);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

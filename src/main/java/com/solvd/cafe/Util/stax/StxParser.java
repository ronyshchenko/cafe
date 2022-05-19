package com.solvd.cafe.Util.stax;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StxParser {
    private static final Logger LOGGER = LogManager.getLogger(StxParser.class);

    public static void main(String[] args) {
        String fileName = "src/main/resources/xml/student.xml";
        List<Student> studentsList = parseXMLfile(fileName);
        for (Student student : studentsList) {
            LOGGER.info(student.toString());
        }
    }

    private static List<Student> parseXMLfile(String fileName) {
        List<Student> studentsList = new ArrayList<>();
        Student student = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            while (reader.hasNext()) {
                XMLEvent xmlEvent = reader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    if (startElement.getName().getLocalPart().equals("Student")) {
                        student = new Student();
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        if (idAttr != null) {
                            student.setId(Integer.parseInt(idAttr.getValue()));
                        }
                    } else if (startElement.getName().getLocalPart().equals("age")) {
                        xmlEvent = reader.nextEvent();
                        student.setAge(Integer.parseInt(xmlEvent.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("name")) {
                        xmlEvent = reader.nextEvent();
                        student.setName(xmlEvent.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("language")) {
                        xmlEvent = reader.nextEvent();
                        student.setLanguage(xmlEvent.asCharacters().getData());
                    }
                }
                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equals("Student")) {
                        studentsList.add(student);
                    }
                }
            }

        } catch (FileNotFoundException | XMLStreamException exc) {
            exc.printStackTrace();
        }
        return studentsList;
    }
}
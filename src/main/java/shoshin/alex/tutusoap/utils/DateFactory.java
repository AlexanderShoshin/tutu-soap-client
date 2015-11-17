package shoshin.alex.tutusoap.utils;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateFactory {
    public static XMLGregorianCalendar newDate(int year, int month, int day) throws DatatypeConfigurationException {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
    }
    
    public static XMLGregorianCalendar newDate(int year, int month, int day, int hour, int minutes) throws DatatypeConfigurationException {
        GregorianCalendar calendar = new GregorianCalendar(year, month, day, hour, minutes);
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
    }
}
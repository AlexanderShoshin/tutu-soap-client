
package shoshin.alex.tutusoap.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ticketStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESERVED"/>
 *     &lt;enumeration value="PAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ticketStatus")
@XmlEnum
public enum TicketStatus {

    RESERVED,
    PAID;

    public String value() {
        return name();
    }

    public static TicketStatus fromValue(String v) {
        return valueOf(v);
    }

}

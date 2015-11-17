
package shoshin.alex.tutusoap.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the shoshin.alex.tutusoap.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReserveTicket_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "reserveTicket");
    private final static QName _ReturnTicketResponse_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "returnTicketResponse");
    private final static QName _ReserveTicketResponse_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "reserveTicketResponse");
    private final static QName _PayForTicket_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "payForTicket");
    private final static QName _TicketDoesNotExistException_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "TicketDoesNotExistException");
    private final static QName _GetTicket_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "getTicket");
    private final static QName _PayForTicketResponse_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "payForTicketResponse");
    private final static QName _AlreadyPaidException_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "AlreadyPaidException");
    private final static QName _GetTicketResponse_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "getTicketResponse");
    private final static QName _ReturnTicket_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "returnTicket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: shoshin.alex.tutusoap.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserveTicketResponse }
     * 
     */
    public ReserveTicketResponse createReserveTicketResponse() {
        return new ReserveTicketResponse();
    }

    /**
     * Create an instance of {@link ReserveTicket }
     * 
     */
    public ReserveTicket createReserveTicket() {
        return new ReserveTicket();
    }

    /**
     * Create an instance of {@link ReturnTicketResponse }
     * 
     */
    public ReturnTicketResponse createReturnTicketResponse() {
        return new ReturnTicketResponse();
    }

    /**
     * Create an instance of {@link AlreadyPaidException }
     * 
     */
    public AlreadyPaidException createAlreadyPaidException() {
        return new AlreadyPaidException();
    }

    /**
     * Create an instance of {@link GetTicketResponse }
     * 
     */
    public GetTicketResponse createGetTicketResponse() {
        return new GetTicketResponse();
    }

    /**
     * Create an instance of {@link ReturnTicket }
     * 
     */
    public ReturnTicket createReturnTicket() {
        return new ReturnTicket();
    }

    /**
     * Create an instance of {@link PayForTicketResponse }
     * 
     */
    public PayForTicketResponse createPayForTicketResponse() {
        return new PayForTicketResponse();
    }

    /**
     * Create an instance of {@link TicketDoesNotExistException }
     * 
     */
    public TicketDoesNotExistException createTicketDoesNotExistException() {
        return new TicketDoesNotExistException();
    }

    /**
     * Create an instance of {@link GetTicket }
     * 
     */
    public GetTicket createGetTicket() {
        return new GetTicket();
    }

    /**
     * Create an instance of {@link PayForTicket }
     * 
     */
    public PayForTicket createPayForTicket() {
        return new PayForTicket();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "reserveTicket")
    public JAXBElement<ReserveTicket> createReserveTicket(ReserveTicket value) {
        return new JAXBElement<ReserveTicket>(_ReserveTicket_QNAME, ReserveTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "returnTicketResponse")
    public JAXBElement<ReturnTicketResponse> createReturnTicketResponse(ReturnTicketResponse value) {
        return new JAXBElement<ReturnTicketResponse>(_ReturnTicketResponse_QNAME, ReturnTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "reserveTicketResponse")
    public JAXBElement<ReserveTicketResponse> createReserveTicketResponse(ReserveTicketResponse value) {
        return new JAXBElement<ReserveTicketResponse>(_ReserveTicketResponse_QNAME, ReserveTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "payForTicket")
    public JAXBElement<PayForTicket> createPayForTicket(PayForTicket value) {
        return new JAXBElement<PayForTicket>(_PayForTicket_QNAME, PayForTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketDoesNotExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "TicketDoesNotExistException")
    public JAXBElement<TicketDoesNotExistException> createTicketDoesNotExistException(TicketDoesNotExistException value) {
        return new JAXBElement<TicketDoesNotExistException>(_TicketDoesNotExistException_QNAME, TicketDoesNotExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "getTicket")
    public JAXBElement<GetTicket> createGetTicket(GetTicket value) {
        return new JAXBElement<GetTicket>(_GetTicket_QNAME, GetTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "payForTicketResponse")
    public JAXBElement<PayForTicketResponse> createPayForTicketResponse(PayForTicketResponse value) {
        return new JAXBElement<PayForTicketResponse>(_PayForTicketResponse_QNAME, PayForTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlreadyPaidException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "AlreadyPaidException")
    public JAXBElement<AlreadyPaidException> createAlreadyPaidException(AlreadyPaidException value) {
        return new JAXBElement<AlreadyPaidException>(_AlreadyPaidException_QNAME, AlreadyPaidException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "getTicketResponse")
    public JAXBElement<GetTicketResponse> createGetTicketResponse(GetTicketResponse value) {
        return new JAXBElement<GetTicketResponse>(_GetTicketResponse_QNAME, GetTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.tutusoap.alex.shoshin/", name = "returnTicket")
    public JAXBElement<ReturnTicket> createReturnTicket(ReturnTicket value) {
        return new JAXBElement<ReturnTicket>(_ReturnTicket_QNAME, ReturnTicket.class, null, value);
    }

}


package shoshin.alex.tutusoap.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TerminalService", targetNamespace = "http://services.tutusoap.alex.shoshin/", wsdlLocation = "http://localhost:8081/tutu-soap-server/terminal?wsdl")
public class TerminalService
    extends Service
{

    private final static URL TERMINALSERVICE_WSDL_LOCATION;
    private final static WebServiceException TERMINALSERVICE_EXCEPTION;
    private final static QName TERMINALSERVICE_QNAME = new QName("http://services.tutusoap.alex.shoshin/", "TerminalService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/tutu-soap-server/terminal?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TERMINALSERVICE_WSDL_LOCATION = url;
        TERMINALSERVICE_EXCEPTION = e;
    }

    public TerminalService() {
        super(__getWsdlLocation(), TERMINALSERVICE_QNAME);
    }

    public TerminalService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TERMINALSERVICE_QNAME, features);
    }

    public TerminalService(URL wsdlLocation) {
        super(wsdlLocation, TERMINALSERVICE_QNAME);
    }

    public TerminalService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TERMINALSERVICE_QNAME, features);
    }

    public TerminalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TerminalService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Terminal
     */
    @WebEndpoint(name = "TerminalPort")
    public Terminal getTerminalPort() {
        return super.getPort(new QName("http://services.tutusoap.alex.shoshin/", "TerminalPort"), Terminal.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Terminal
     */
    @WebEndpoint(name = "TerminalPort")
    public Terminal getTerminalPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.tutusoap.alex.shoshin/", "TerminalPort"), Terminal.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TERMINALSERVICE_EXCEPTION!= null) {
            throw TERMINALSERVICE_EXCEPTION;
        }
        return TERMINALSERVICE_WSDL_LOCATION;
    }

}
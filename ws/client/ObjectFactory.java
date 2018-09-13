
package ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.client package. 
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

    private final static QName _PrintLog_QNAME = new QName("http://webserviceimpl.ws/", "printLog");
    private final static QName _PrintLogResponse_QNAME = new QName("http://webserviceimpl.ws/", "printLogResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrintLog }
     * 
     */
    public PrintLog createPrintLog() {
        return new PrintLog();
    }

    /**
     * Create an instance of {@link PrintLogResponse }
     * 
     */
    public PrintLogResponse createPrintLogResponse() {
        return new PrintLogResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceimpl.ws/", name = "printLog")
    public JAXBElement<PrintLog> createPrintLog(PrintLog value) {
        return new JAXBElement<PrintLog>(_PrintLog_QNAME, PrintLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceimpl.ws/", name = "printLogResponse")
    public JAXBElement<PrintLogResponse> createPrintLogResponse(PrintLogResponse value) {
        return new JAXBElement<PrintLogResponse>(_PrintLogResponse_QNAME, PrintLogResponse.class, null, value);
    }

}

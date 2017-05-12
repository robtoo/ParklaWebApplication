
package robert.projekt;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ParkingLotService", targetNamespace = "http://robert/projekt", wsdlLocation = "file:/C:/Users/rober_000/Documents/NetBeansProjects/ParklaWebApplication/src/conf/xml-resources/web-services/ParklaWebServiceFromWSDL/wsdl/CarParkingService.wsdl")
public class ParkingLotService
    extends Service
{

    private final static URL PARKINGLOTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PARKINGLOTSERVICE_EXCEPTION;
    private final static QName PARKINGLOTSERVICE_QNAME = new QName("http://robert/projekt", "ParkingLotService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/rober_000/Documents/NetBeansProjects/ParklaWebApplication/src/conf/xml-resources/web-services/ParklaWebServiceFromWSDL/wsdl/CarParkingService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PARKINGLOTSERVICE_WSDL_LOCATION = url;
        PARKINGLOTSERVICE_EXCEPTION = e;
    }

    public ParkingLotService() {
        super(__getWsdlLocation(), PARKINGLOTSERVICE_QNAME);
    }

    public ParkingLotService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PARKINGLOTSERVICE_QNAME, features);
    }

    public ParkingLotService(URL wsdlLocation) {
        super(wsdlLocation, PARKINGLOTSERVICE_QNAME);
    }

    public ParkingLotService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PARKINGLOTSERVICE_QNAME, features);
    }

    public ParkingLotService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ParkingLotService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ParkingLotPortType
     */
    @WebEndpoint(name = "ParkingLotPort")
    public ParkingLotPortType getParkingLotPort() {
        return super.getPort(new QName("http://robert/projekt", "ParkingLotPort"), ParkingLotPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ParkingLotPortType
     */
    @WebEndpoint(name = "ParkingLotPort")
    public ParkingLotPortType getParkingLotPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://robert/projekt", "ParkingLotPort"), ParkingLotPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PARKINGLOTSERVICE_EXCEPTION!= null) {
            throw PARKINGLOTSERVICE_EXCEPTION;
        }
        return PARKINGLOTSERVICE_WSDL_LOCATION;
    }

}

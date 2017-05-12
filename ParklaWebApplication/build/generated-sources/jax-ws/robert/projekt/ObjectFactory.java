
package robert.projekt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the robert.projekt package. 
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

    private final static QName _GetCarResponse_QNAME = new QName("http://robert/projekt", "getCarResponse");
    private final static QName _AddCarResponse_QNAME = new QName("http://robert/projekt", "addCarResponse");
    private final static QName _GetParkingLotResponse_QNAME = new QName("http://robert/projekt", "getParkingLotResponse");
    private final static QName _AddParkingLotResponse_QNAME = new QName("http://robert/projekt", "addParkingLotResponse");
    private final static QName _GetParkingLotCarListResponse_QNAME = new QName("http://robert/projekt", "getParkingLotCarListResponse");
    private final static QName _AddParkingLotCarResponse_QNAME = new QName("http://robert/projekt", "addParkingLotCarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: robert.projekt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCarRequest }
     * 
     */
    public GetCarRequest createGetCarRequest() {
        return new GetCarRequest();
    }

    /**
     * Create an instance of {@link CarType }
     * 
     */
    public CarType createCarType() {
        return new CarType();
    }

    /**
     * Create an instance of {@link AddCarRequest }
     * 
     */
    public AddCarRequest createAddCarRequest() {
        return new AddCarRequest();
    }

    /**
     * Create an instance of {@link GetCarListRequest }
     * 
     */
    public GetCarListRequest createGetCarListRequest() {
        return new GetCarListRequest();
    }

    /**
     * Create an instance of {@link GetCarListResponse }
     * 
     */
    public GetCarListResponse createGetCarListResponse() {
        return new GetCarListResponse();
    }

    /**
     * Create an instance of {@link GetParkingLotRequest }
     * 
     */
    public GetParkingLotRequest createGetParkingLotRequest() {
        return new GetParkingLotRequest();
    }

    /**
     * Create an instance of {@link ParkingLotType }
     * 
     */
    public ParkingLotType createParkingLotType() {
        return new ParkingLotType();
    }

    /**
     * Create an instance of {@link AddParkingLotRequest }
     * 
     */
    public AddParkingLotRequest createAddParkingLotRequest() {
        return new AddParkingLotRequest();
    }

    /**
     * Create an instance of {@link GetParkingLotListRequest }
     * 
     */
    public GetParkingLotListRequest createGetParkingLotListRequest() {
        return new GetParkingLotListRequest();
    }

    /**
     * Create an instance of {@link GetParkingLotListResponse }
     * 
     */
    public GetParkingLotListResponse createGetParkingLotListResponse() {
        return new GetParkingLotListResponse();
    }

    /**
     * Create an instance of {@link GetParkingLotCarListRequest }
     * 
     */
    public GetParkingLotCarListRequest createGetParkingLotCarListRequest() {
        return new GetParkingLotCarListRequest();
    }

    /**
     * Create an instance of {@link ParkingLotCarListType }
     * 
     */
    public ParkingLotCarListType createParkingLotCarListType() {
        return new ParkingLotCarListType();
    }

    /**
     * Create an instance of {@link AddParkingLotCarRequest }
     * 
     */
    public AddParkingLotCarRequest createAddParkingLotCarRequest() {
        return new AddParkingLotCarRequest();
    }

    /**
     * Create an instance of {@link ParkingLotCarType }
     * 
     */
    public ParkingLotCarType createParkingLotCarType() {
        return new ParkingLotCarType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://robert/projekt", name = "getCarResponse")
    public JAXBElement<CarType> createGetCarResponse(CarType value) {
        return new JAXBElement<CarType>(_GetCarResponse_QNAME, CarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://robert/projekt", name = "addCarResponse")
    public JAXBElement<CarType> createAddCarResponse(CarType value) {
        return new JAXBElement<CarType>(_AddCarResponse_QNAME, CarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkingLotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://robert/projekt", name = "getParkingLotResponse")
    public JAXBElement<ParkingLotType> createGetParkingLotResponse(ParkingLotType value) {
        return new JAXBElement<ParkingLotType>(_GetParkingLotResponse_QNAME, ParkingLotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkingLotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://robert/projekt", name = "addParkingLotResponse")
    public JAXBElement<ParkingLotType> createAddParkingLotResponse(ParkingLotType value) {
        return new JAXBElement<ParkingLotType>(_AddParkingLotResponse_QNAME, ParkingLotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkingLotCarListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://robert/projekt", name = "getParkingLotCarListResponse")
    public JAXBElement<ParkingLotCarListType> createGetParkingLotCarListResponse(ParkingLotCarListType value) {
        return new JAXBElement<ParkingLotCarListType>(_GetParkingLotCarListResponse_QNAME, ParkingLotCarListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkingLotCarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://robert/projekt", name = "addParkingLotCarResponse")
    public JAXBElement<ParkingLotCarType> createAddParkingLotCarResponse(ParkingLotCarType value) {
        return new JAXBElement<ParkingLotCarType>(_AddParkingLotCarResponse_QNAME, ParkingLotCarType.class, null, value);
    }

}

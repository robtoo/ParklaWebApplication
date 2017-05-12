
package robert.projekt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parkingLotCarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parkingLotCarType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="car" type="{http://robert/projekt}carType"/&gt;
 *         &lt;element name="parkingLot" type="{http://robert/projekt}parkingLotType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkingLotCarType", propOrder = {
    "car",
    "parkingLot"
})
public class ParkingLotCarType {

    @XmlElement(required = true)
    protected CarType car;
    @XmlElement(required = true)
    protected ParkingLotType parkingLot;

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link CarType }
     *     
     */
    public CarType getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarType }
     *     
     */
    public void setCar(CarType value) {
        this.car = value;
    }

    /**
     * Gets the value of the parkingLot property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingLotType }
     *     
     */
    public ParkingLotType getParkingLot() {
        return parkingLot;
    }

    /**
     * Sets the value of the parkingLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingLotType }
     *     
     */
    public void setParkingLot(ParkingLotType value) {
        this.parkingLot = value;
    }

}

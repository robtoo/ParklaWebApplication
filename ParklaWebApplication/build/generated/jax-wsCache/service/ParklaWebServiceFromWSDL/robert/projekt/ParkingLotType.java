
package robert.projekt;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parkingLotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parkingLotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lotId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parkingLotCarList" type="{http://robert/projekt}parkingLotCarListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkingLotType", propOrder = {
    "lotId",
    "capacity",
    "address",
    "parkingLotCarList"
})
public class ParkingLotType {

    @XmlElement(required = true)
    protected BigInteger lotId;
    protected double capacity;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected ParkingLotCarListType parkingLotCarList;

    /**
     * Gets the value of the lotId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLotId() {
        return lotId;
    }

    /**
     * Sets the value of the lotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLotId(BigInteger value) {
        this.lotId = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(double value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the parkingLotCarList property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingLotCarListType }
     *     
     */
    public ParkingLotCarListType getParkingLotCarList() {
        return parkingLotCarList;
    }

    /**
     * Sets the value of the parkingLotCarList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingLotCarListType }
     *     
     */
    public void setParkingLotCarList(ParkingLotCarListType value) {
        this.parkingLotCarList = value;
    }

}

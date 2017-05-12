
package robert.projekt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parkingLotCarListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parkingLotCarListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingLotCar" type="{http://robert/projekt}parkingLotCarType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkingLotCarListType", propOrder = {
    "parkingLotCar"
})
public class ParkingLotCarListType {

    protected List<ParkingLotCarType> parkingLotCar;

    /**
     * Gets the value of the parkingLotCar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parkingLotCar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParkingLotCar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParkingLotCarType }
     * 
     * 
     */
    public List<ParkingLotCarType> getParkingLotCar() {
        if (parkingLotCar == null) {
            parkingLotCar = new ArrayList<ParkingLotCarType>();
        }
        return this.parkingLotCar;
    }

}

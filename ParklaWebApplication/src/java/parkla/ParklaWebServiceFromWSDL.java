/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkla;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import robert.projekt.CarType;
import robert.projekt.GetCarListResponse;
import robert.projekt.GetCarRequest;
import robert.projekt.GetParkingLotListResponse;
import robert.projekt.GetParkingLotRequest;
import robert.projekt.ParkingLotCarListType;
import robert.projekt.ParkingLotCarType;
import robert.projekt.ParkingLotType;

/**
 *
 * @author rober_000
 */
@WebService(serviceName = "ParkingLotService", portName = "ParkingLotPort", endpointInterface = "robert.projekt.ParkingLotPortType", targetNamespace = "http://robert/projekt", wsdlLocation = "WEB-INF/wsdl/ParklaWebServiceFromWSDL/CarParkingService.wsdl")
public class ParklaWebServiceFromWSDL {
static int nextCarId = 1;
    static int nextParkingLotId = 1;
    static List<CarType> CarList = new ArrayList<CarType>();
    static List<ParkingLotType> ParkingLotList = new ArrayList<ParkingLotType>();

    public robert.projekt.CarType getCar(robert.projekt.GetCarRequest parameter) {
                CarType ct = null;
        if (parameter.getToken().equalsIgnoreCase("password")) {
            for (int i = 0; i < CarList.size(); i++) {
                if (CarList.get(i).getCarId().equals(parameter.getCarId())) {
                    ct = CarList.get(i);
                }

            }    
        }
        return ct;   

    }

    public robert.projekt.CarType addCar(robert.projekt.AddCarRequest parameter) {
      CarType ct = new CarType();
        if (parameter.getToken().equalsIgnoreCase("password")) {
            ct.setMake(parameter.getMake());
            ct.setModel(parameter.getModel());
            ct.setCarId(BigInteger.valueOf(nextCarId++));
            CarList.add(ct);
        }
        return ct;
    }

    public GetCarListResponse getCarList(robert.projekt.GetCarListRequest parameter) {
        GetCarListResponse response = new GetCarListResponse();
        if (parameter.getToken().equalsIgnoreCase("password")) {
            for (CarType CarType : CarList) {
                response.getCar().add(CarType);
            }
        }
        return response;

}

    public robert.projekt.ParkingLotType getParkingLot(robert.projekt.GetParkingLotRequest parameter) {
        ParkingLotType pt = null;
        if (parameter.getToken().equalsIgnoreCase("password")) {
            for (int i = 0; i < ParkingLotList.size(); i++) {
                if (ParkingLotList.get(i).getLotId().equals(parameter.getLotId())) {
                    pt = ParkingLotList.get(i);
                }

            }    
        }
        return pt;
 }

    public robert.projekt.ParkingLotType addParkingLot(robert.projekt.AddParkingLotRequest parameter) {
                ParkingLotType pt = new ParkingLotType();
        if (parameter.getToken().equalsIgnoreCase("password")) {
            pt.setLotId(BigInteger.valueOf(nextParkingLotId++));
            pt.setCapacity(parameter.getCapacity());
            pt.setAddress(parameter.getAddress());
            pt.setParkingLotCarList(new ParkingLotCarListType());
            ParkingLotList.add(pt);
        }
        return pt;
}

    public robert.projekt.GetParkingLotListResponse getParkingLotList(robert.projekt.GetParkingLotListRequest parameter) {
                GetParkingLotListResponse response = new GetParkingLotListResponse();
        if (parameter.getToken().equalsIgnoreCase("password")) {
            for (ParkingLotType ParkingLotType : ParkingLotList) {
                response.getParkingLot().add(ParkingLotType);
            }
        }
        return response;

    }

    public robert.projekt.ParkingLotCarListType getParkingLotCarList(robert.projekt.GetParkingLotCarListRequest parameter) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public robert.projekt.ParkingLotCarType addParkingLotCar(robert.projekt.AddParkingLotCarRequest parameter) {
            ParkingLotCarType parkingLotCar = new ParkingLotCarType();
        if (parameter.getToken().equalsIgnoreCase("password")) {
            GetCarRequest carRequest = new GetCarRequest();
            GetParkingLotRequest parkingLotRequest = new GetParkingLotRequest();
            carRequest.setCarId(parameter.getCarId());
            carRequest.setToken(parameter.getToken());
            parkingLotRequest.setLotId(parameter.getLotId());
            parkingLotRequest.setToken(parameter.getToken());
            
            parkingLotCar.setCar(getCar(carRequest));
            parkingLotCar.setParkingLot(getParkingLot(parkingLotRequest));
            
            //parkingLotCarListType.add(parkingLotCar);
            
        }
        return parkingLotCar;}
    

    }
    


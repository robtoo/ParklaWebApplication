/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkla;

import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import robert.projekt.AddParkingLotRequest;
import robert.projekt.GetParkingLotListRequest;
import robert.projekt.GetParkingLotListResponse;
import robert.projekt.GetParkingLotRequest;
import robert.projekt.ParkingLotType;

/**
 * REST Web Service
 *
 * @author rober_000
 */
@Path("parkingLot")
public class ParkingLotResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ParkingLotResource
     */
    public ParkingLotResource() {
    }

    /**
     * Retrieves representation of an instance of parkla.ParkingLotResource
     * @return an instance of robert.projekt.ParkingLotType
     */
            @GET
    @Produces("application/json")
    public GetParkingLotListResponse getParkingLotList(@QueryParam("token") String token) {
        ParklaWebServiceFromWSDL ws = new ParklaWebServiceFromWSDL();
        GetParkingLotListRequest request = new GetParkingLotListRequest();
        request.setToken(token);
        return ws.getParkingLotList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public ParkingLotType getParkingLot(@PathParam("id") String id,
            @QueryParam("token") String token) {
        ParklaWebServiceFromWSDL ws = new ParklaWebServiceFromWSDL();
        GetParkingLotRequest request = new GetParkingLotRequest();
        request.setLotId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getParkingLot(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ParkingLotType addParkingLot(ParkingLotType content, 
                                @QueryParam("token") String token) {
       ParklaWebServiceFromWSDL ws = new ParklaWebServiceFromWSDL();
        AddParkingLotRequest request = new AddParkingLotRequest();
        request.setAddress(content.getAddress());
        request.setCapacity(content.getCapacity());
        request.setToken(token);
        return ws.addParkingLot(request);
    }
}

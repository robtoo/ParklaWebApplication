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
import robert.projekt.AddCarRequest;
import robert.projekt.CarType;
import robert.projekt.GetCarListRequest;
import robert.projekt.GetCarListResponse;
import robert.projekt.GetCarRequest;

/**
 * REST Web Service
 *
 * @author rober_000
 */
@Path("car")
public class CarResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CarResource
     */
    public CarResource() {
    }

    /**
     * Retrieves representation of an instance of parkla.CarResource
     * @return an instance of robert.projekt.CarType
     */
      @GET
    @Produces("application/json")
    public GetCarListResponse getCarList(@QueryParam("token") String token) {
        ParklaWebServiceFromWSDL ws = new ParklaWebServiceFromWSDL();
        GetCarListRequest request = new GetCarListRequest();
        request.setToken(token);
        return ws.getCarList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public CarType getCar(@PathParam("id") String id,
            @QueryParam("token") String token) {
        ParklaWebServiceFromWSDL ws = new ParklaWebServiceFromWSDL();
        GetCarRequest request = new GetCarRequest();
        request.setCarId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getCar(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public CarType addCar(CarType content, 
                                @QueryParam("token") String token) {
        ParklaWebServiceFromWSDL ws = new ParklaWebServiceFromWSDL();
        AddCarRequest request = new AddCarRequest();
        request.setMake(content.getMake());
        request.setModel(content.getModel());
        request.setToken(token);
        return ws.addCar(request);
    }
}


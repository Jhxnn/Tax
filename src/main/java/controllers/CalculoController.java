package controllers;


import dtos.CalculoICMSDto;
import dtos.CalculoIPIDto;
import dtos.CalculoISSDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import services.CalculoService;

@Path("/calculo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CalculoController {

    @Inject
    CalculoService calculoService;

    @GET
    @Path("/ICMS")
    public Response calculoIcms(@RequestBody CalculoICMSDto calculoICMSDto){
        return Response.ok(calculoService.calcularICMS(calculoICMSDto)).build();
    }
    @GET
    @Path("/IPI")
    public Response calculoIpi(@RequestBody CalculoIPIDto calculoIPIDto){
        return Response.ok(calculoService.calcularIPI(calculoIPIDto)).build();
    }
    @GET
    @Path("/ISS")
    public Response calculoIss(@RequestBody CalculoISSDto calculoISSDto){
        return Response.ok(calculoService.calcularISS(calculoISSDto)).build();
    }


}

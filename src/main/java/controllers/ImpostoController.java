package controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import services.ImpostoService;

@Path("/imposto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ImpostoController {


    @Inject
    ImpostoService impostoService;

    @GET
    @Operation(description = "Lista todos os impostos")
    public Response findAll(){

        return  Response.ok(impostoService.findAll()).build();
    }


}

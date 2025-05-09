package controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import services.ImpostoService;

@Path("/imposto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ImpostoController {


    @Inject
    ImpostoService impostoService;

    @GET
    public Response findAll(){

        return  Response.ok(impostoService.findAll()).build();
    }


}

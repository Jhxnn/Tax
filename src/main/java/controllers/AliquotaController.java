package controllers;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import services.AliquotaService;


@Path("/aliquota")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AliquotaController {

    @Inject
    AliquotaService aliquotaService;

    @GET
    @Operation(description = "Lista todos os aliquota")
    public Response findAll(){
        return Response.ok(aliquotaService.findAll()).build();
    }

}

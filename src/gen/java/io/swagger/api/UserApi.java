package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Usuario;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/user")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-05-20T15:21:05.392Z[GMT]")public class UserApi  {
   private final UserApiService delegate;
   List<Usuario> users = new LinkedList<Usuario>();

   public UserApi(@Context ServletConfig servletContext) {
      UserApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UserApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UserApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UserApiServiceFactory.getUserApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/{username}")
    
    @Produces({ "text/plain" })
    @Operation(summary = "Delete user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found response", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = String.class))) })
    public Response deleteUser(@Parameter(description = "The name that needs to be deleted",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteUser(username,securityContext);
    }
    @GET
    @Path("/{username}")
    
    @Produces({ "text/plain" })
    @Operation(summary = "Devuelve el usuario por nombre", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found response", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = String.class))) })
    public Response getUserByName(@Parameter(description = "The name that needs to be fetched. ",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserByName(username,securityContext);
    }
    @GET
    @Path("/login")
    
    @Produces({ "text/plain" })
    @Operation(summary = "Devuelve", description = "Creacion de nuevos usuarios.", tags={ "Usuario" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found response", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = String.class))) })
    public Response inicioSesionUsuarios(@Parameter(description = "Nomber de usuario",required=true) @QueryParam("username") String username
,@Parameter(description = "Password del usuario",required=true) @QueryParam("password") String password
,@Context SecurityContext securityContext)
    throws NotFoundException {

        return delegate.inicioSesionUsuarios(username,usaurios,securityContext);
    }
    @GET
    @Path("/logout")
    
    @Produces({ "text/plain" })
    @Operation(summary = "Cierre de sesion", description = "Cierra la sesion abierta por el usuario actual", tags={ "Usuario" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found response", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = String.class))) })
    public Response logoutUsuario(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logoutUsuario(securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "text/plain" })
    @Operation(summary = "Registra un nuevo usuario", description = "Creacion de nuevos usuarios.", tags={ "Usuario" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found response", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = String.class))) })
    public Response registroUsuarios(@Parameter(description = "" ,required=true) Usuario body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        usuarios.add(Usuario);
        return delegate.registroUsuarios(body,securityContext);
    }
    @PUT
    @Path("/{username}")
    @Consumes({ "*/*" })
    @Produces({ "text/plain" })
    @Operation(summary = "Updated user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "404", description = "Not found response", content = @Content(schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input", content = @Content(schema = @Schema(implementation = String.class))) })
    public Response updateUser(@Parameter(description = "Updated user object" ,required=true) Usuario body

,@Parameter(description = "name that need to be updated",required=true) @PathParam("username") String username
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateUser(body,username,securityContext);
    }
}

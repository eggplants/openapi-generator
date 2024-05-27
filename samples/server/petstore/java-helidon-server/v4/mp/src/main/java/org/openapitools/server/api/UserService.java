/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.api;

import java.util.List;
import java.time.OffsetDateTime;
import org.openapitools.server.model.User;

import jakarta.ws.rs.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/user")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public interface UserService {

    @POST
    @Consumes({ "application/json" })
    void createUser(@Valid @NotNull User user);

    @POST
    @Path("/createWithArray")
    @Consumes({ "application/json" })
    void createUsersWithArrayInput(@Valid @NotNull List<@Valid User> user);

    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    void createUsersWithListInput(@Valid @NotNull List<@Valid User> user);

    @DELETE
    @Path("/{username}")
    void deleteUser(@PathParam("username") String username);

    @GET
    @Path("/{username}")
    @Produces({ "application/xml", "application/json" })
    User getUserByName(@PathParam("username") String username);

    @GET
    @Path("/login")
    @Produces({ "application/xml", "application/json" })
    String loginUser(@QueryParam("username") @NotNull String username, @QueryParam("password") @NotNull String password);

    @GET
    @Path("/logout")
    void logoutUser();

    @PUT
    @Path("/{username}")
    @Consumes({ "application/json" })
    void updateUser(@PathParam("username") String username, @Valid @NotNull User user);
}

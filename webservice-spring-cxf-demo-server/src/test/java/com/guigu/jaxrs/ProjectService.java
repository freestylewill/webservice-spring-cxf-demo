package com.guigu.jaxrs;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Administrator on 2017/4/11.
 */
@Path("/project")
public interface ProjectService {

    @GET
    @Path("/infos")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Project> getAllProject();

    @GET
    @Path("/info/{projectId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Project getProject(@PathParam("projectId") String projectId);

    @POST
    @Path("/info")
    public void addProject(Project project);

    @PUT
    @Path("/info")
    public void updateProject(Project project);

    @DELETE
    @Path("/info/{projectId}")
    public void deleteProject(@PathParam("projectId") String projectId);
}

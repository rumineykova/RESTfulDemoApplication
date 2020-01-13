package com.howtodoinjava.service;
 
import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.howtodoinjava.model.User;
 
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "user-management")
@Path("/user-management")
public class UserService
{
    @GET
    @Path("/users/{id}")
    public User getUserByIdUsingPathParam(@PathParam("id") Integer id) 
    {
        User user = new User();
        user.setId(id);
        user.setFirstName("demo");
        user.setLastName("user");
        return user;
    }
    
    /*@GET
    @Path("/allusers")
    public User getAllUsers() 
    {
        User user = new User();
        user.setId(1);
        user.setFirstName("demo");
        user.setLastName("user");
        return user;
    }*/
}
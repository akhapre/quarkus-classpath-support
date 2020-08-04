package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        try {
            System.out.println("Location of 'org/acme/Example2Resource.class : " + Thread.currentThread().getContextClassLoader().getResource("org/acme/Example2Resource.class"));
            System.out.println("Location of 'META-INF/resources/index2.html : " + Thread.currentThread().getContextClassLoader().getResource("META-INF/resources/index2.html"));
            System.out.println("Location of 'index2.html : " + Thread.currentThread().getContextClassLoader().getResource("index2.html"));
        } catch (Exception e) {

        }

        return "hello";
    }
}
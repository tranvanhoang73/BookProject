
package com.mycompany.bookproject.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class BookApplication extends ResourceConfig{

    public BookApplication() {
        packages("com.mycompany.bookproject.resource");
    }
    
    
}

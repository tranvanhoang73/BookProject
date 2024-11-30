package com.mycompany.bookproject.resource.v1;

import com.mycompany.bookproject.dao.BookDAO;
import com.mycompany.bookproject.dto.Book;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("v1/Books")
public class BookResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getABook(){
    
     BookDAO bookDAO = new BookDAO();
     return bookDAO.getABook();  
     //return new Book("123456", "My first API.");       
    }
      
    @POST  
    @Consumes(MediaType.APPLICATION_JSON)  
    @Produces(MediaType.APPLICATION_JSON)  
    public Response addBook(Book newBook) {  
        try {  
            BookDAO bookDAO = new BookDAO();  
            boolean isAdded = bookDAO.addBook(newBook);  
            if (isAdded) {  
                return Response.status(Response.Status.CREATED).entity(newBook).build();  
            } else {  
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR)  
                               .entity("Error adding book")  
                               .build();  
            }  
        } catch (Exception e) {  
            return Response.status(Response.Status.BAD_REQUEST)  
                           .entity("Invalid input data: " + e.getMessage())  
                           .build();  
        }  
    } 
}

//curl -X POST "http://localhost:8080/BookProject/api/v1/Books" -H "Content-Type: application/json" -d "{\"isbn\": \"1484\", \"title\": \"Titlenew\"}"  

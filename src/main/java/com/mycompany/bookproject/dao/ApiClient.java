
package com.mycompany.bookproject.dao;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStream;  
import java.net.HttpURLConnection;  
import java.net.URL;  

public class ApiClient {  

    public static void main(String[] args) {  
        // Example for adding a new book  
        String isbn = "978-301";  
        String title = "New Book2";  
        
        // Call the method to add the book  
        addBook(isbn, title);  
    }  

    public static void addBook(String isbn, String title) {  
    try {  
        URL url = new URL("http://localhost:8080/BookProject/api/v1/Books");  
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();  
        conn.setRequestMethod("POST");  
        conn.setRequestProperty("Content-Type", "application/json; utf-8");  
        conn.setRequestProperty("Accept", "application/json");  
        conn.setDoOutput(true); // Indicates we will send data  

        // Create JSON representation of the new book  
        String jsonInputString = "{\"isbn\": \"" + isbn + "\", \"title\": \"" + title + "\"}";  

        // Send JSON data in request body  
        try (OutputStream os = conn.getOutputStream()) {  
            byte[] input = jsonInputString.getBytes("utf-8");  
            os.write(input, 0, input.length);  
        }  

        // Check response code and handle  
        int responseCode = conn.getResponseCode();  
        if (responseCode == HttpURLConnection.HTTP_CREATED) {  
            System.out.println("Book added successfully!");  
        } else if (responseCode == HttpURLConnection.HTTP_BAD_REQUEST) {  
            System.out.println("Failed to add book due to bad request. Response code: " + responseCode);  
            System.out.println("Response message: " + getResponseMessage(conn));  
        } else {  
            System.out.println("Failed to add book. Response code: " + responseCode);  
            System.out.println("Response message: " + getResponseMessage(conn));  
        }  

    } catch (IOException e) {  
        System.out.println("An error occurred while trying to add the book: " + e.getMessage());  
    }  
}

    private static String getResponseMessage(HttpURLConnection conn) {  
        StringBuilder response = new StringBuilder();  
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {  
            String line;  
            while ((line = reader.readLine()) != null) {  
                response.append(line);  
            }  
        } catch (IOException e) {  
            System.out.println("Error reading the response: " + e.getMessage());  
        }  
        return response.toString();  
    }  
}
<%-- 
    Document   : books
    Created on : Nov 24, 2024, 7:38:36 PM
    Author     : Admin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <table border="1">
     
   <c:forEach items="${listS}" var="x">
    <tr>
      <th>${x.getIsbn()}</th>
      <th>${x.getTitle()}</th>
    
    </tr>
    </c:forEach>
    
  </table>
    </body>
</html>

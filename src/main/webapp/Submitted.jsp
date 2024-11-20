<%-- 
    Document   : thanks
    Created on : Aug 29, 2024, 2:23:12 PM
    Author     : Duy Thanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset ="utf-8">
        <title>Submitted Form</title>
        <link rel = "stylesheet" href="/main.css" type="text/css"/>
    </head>
    <body>
        <h1>Thanks for submitted your information</h1>
        
        <<p>Here is the information that you entered:</p>
        
        <label>Email:</label>
        <span>${user.email}</span><br>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        <label>Date of birth:</label>
        <span>${user.dateOfBirth}</span><br>
        <label>You heard about us:</label>
        <span>${user.hearAbout}</span>
        <label>You want to receive:</label>
        <span>${user.receive}</span>
        <label>We can contact with you:</label>
        <span>${user.contact}</span>
        <p>To enter another email address, click on the Back 
        button in your browser or the Return button shown
        below.</p>
        
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
    </head>
    <body>
        <table>
            <tr>
                <td>Welcome ${firstname}</td>
            </tr>
            <tr>
            </tr>
            <tr>
            </tr>
            <tr>
                <td><a href="<c:url value="/" />">Home</a>
                </td>
            </tr>
        </table>
    </body>
    </html>
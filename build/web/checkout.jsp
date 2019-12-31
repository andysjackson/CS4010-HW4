<%-- 
   Andrew Jackson
   cs4010 hw4
   08/11/2017
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css" type="text/css" />
        <title>Thank You</title>
    </head>
    <body>
        <h1>Thanks for your order</h1>
        <p>Here is the information that you entered.</p>
        <table>
            <tr>
                <th>Cover</th>
                <th>Title</th>
                <th>Price</th>
                <th>Amount</th>
                <th>Quantity</th>
            </tr>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <c:forEach var="dvd" items ="${cart.contents}">
                <c:if test="${dvd.quantity != '0'}">
                    <tr>
                        <td><img src="${dvd.imageSrc}" /></td>
                        <td>${dvd.name}</td>
                        <td>${dvd.priceCurrencyFormat}</td>
                        <td>${dvd.totalCurrencyFormat}</td>
                        <td>${dvd.quantity}</td>
                    </tr>
                </c:if>
            </c:forEach>
                    <tr>
                        <th>Total</th>
                        <td></td>
                        <td></td>
                        <td>${cart.getTotal()}</td>
                        <td></td>
                    </tr>
        </table>
                        <p>To order another DVD, click on the button below.</p>
                        <form action="cart" method="post">
                            <input type="hidden" name="action" value="reset" />
                            <input type="submit" value="Return" />
                        </form>
    </body>
</html>

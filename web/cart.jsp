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
        <title>DVD Sale - Cart</title>
    </head>
    <body>
        <h1>Your cart</h1>
        <table>
            <tr>
                <th>Cover</th>
                <th>Title</th>
                <th>Price</th>
                <th>Amount</th>
                <th>Quantity</th>
                <th></th>
            </tr>
            
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <c:forEach var="dvd" items ="${cart.contents}">
                <c:if test="${dvd.quantity != '0'}">
                    <tr>
                        <td><img src="${dvd.imageSrc}" /></td>
                        <td>${dvd.name}</td>
                        <td>${dvd.priceCurrencyFormat}</td>
                        <td>${dvd.totalCurrencyFormat}</td>
                        <td>
                            <form action="" method="post">
                                <input type="hidden" name="productCode"
                                       value="${dvd.productCode}" />
                                <input type="text" name="quantity" id="quantity"
                                    value="${dvd.quantity}" />
                                <input type="Submit" value="Update" />
                            </form>
                        </td>
                        <td>
                            <form action="" method="post">
                                <input type="hidden" name="productCode"
                                       value="${dvd.productCode}" />
                                <input type="hidden" name="quantity" value="0" />
                                <input type="submit" value="Remove DVD" />
                            </form>
                        </td>
                    </tr>
                </c:if>
            </c:forEach>
        </table>
            <p><b>To change the quantity</b>, enter the new quantity
                and click the Update button.</p>
            <form action="" method="post">
                <input type="hidden" name ="action" value="shop" />
                <input type="Submit" value="Continue Shopping" />
            </form>
            <form action="" method="post">
                <input type="hidden" name="action" value="checkout" />
                <input type ="submit" value="Checkout" />
            </form>
            
    </body>
</html>

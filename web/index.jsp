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
        <title>DVD Sale - Home</title>
    </head>
    <body>
        <h1>DVD list</h1>
        <table>
            <tr>
                <th>Cover</th>
                <th>Title</th>
                <th>Price</th>
                <th></th>
            </tr>
            <tr>
                <td><img src="https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/The_Tenenbaums.jpg/220px-The_Tenenbaums.jpg"
                         /></td>
                <td>The Royal Tenenbaums</td>
                <td>$9.99</td>
                <td><form action="cart" method="post">
                        <input type="hidden" name="productCode" value="dvd01" />
                        <input type="hidden" name="quantity" value="add" />
                        <input type="submit" value="Add To Cart" />
                    </form></td>
            </tr>
            <tr>
                <td><img src="https://upload.wikimedia.org/wikipedia/en/thumb/4/42/Rushmoreposter.png/220px-Rushmoreposter.png"
                         /></td>
                <td>Rushmore</td>
                <td>$8.99</td>
                <td><form action="cart" method="post">
                        <input type="hidden" name="productCode" value="dvd02" />
                        <input type="hidden" name="quantity" value="add" />
                        <input type="submit" value="Add To Cart" />
                    </form></td>
            </tr>
            <tr>
                <td><img src="https://upload.wikimedia.org/wikipedia/en/thumb/7/7c/Lifeaquaticposter.jpg/220px-Lifeaquaticposter.jpg"
                         /></td>
                <td>The Life Aquatic with Steve Zissou</td>
                <td>$7.99</td>
                <td><form action="cart" method="post">
                        <input type="hidden" name="productCode" value="dvd03" />
                        <input type="hidden" name="quantity" value="add" />
                        <input type="submit" value="Add To Cart" />
                    </form></td>
            </tr>
            <tr>
                <td><img src="https://upload.wikimedia.org/wikipedia/en/a/a6/The_Grand_Budapest_Hotel_Poster.jpg"
                         /></td>
                <td>The Grand Budapest Hotel</td>
                <td>$10.99</td>
                <td><form action="cart" method="post">
                        <input type="hidden" name="productCode" value="dvd04" />
                        <input type="hidden" name="quantity" value="add" />
                        <input type="submit" value="Add To Cart" />
                    </form></td>
            </tr>
        </table>
    </body>
</html>

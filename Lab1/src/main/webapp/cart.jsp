<%@ page import="UI.ItemInfo" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yusufabdi
  Date: 2021-10-09
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
    <style>

        body {
            font-family: Chalkduster, sans-serif;
            margin: 0;
        }
        .header {
            padding: 10px;
            text-align: center;
            background: #F0E68C;
            color: #696969;
            border-bottom: 3px solid;
            border-color: #696969;
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);

        }
        .itemText {
            background-color: #FFFFF0;

            margin: 30px;
            border: 3px solid;
            border-color: #F0E68C;
            text-align: center;
            color: #696969;
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
        }
        .items {

            text-align: center;

        }
        .button {
            font-family: Chalkduster, sans-serif;
            border-radius: 12px;
            font-size: 16px;
            color: #696969;
            padding: 10px 10px;
            margin-top: 10px;
            text-align: center;
            border: 3px solid;
            border-color: #696969;
            background-color: #F0E68C;
            transition-duration: 0.4s;
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);

        }
        .button:hover {
            background-color: #FFFFF0;
            color: #696969;
            border-color: #696969;
        }
        </style>
</head>
<body>
<div class="header">
    <h1>Cart</h1>
    <p>You have following items in your cart</p>
</div>
<form class="items" action="./items.jsp">
    <input class="button" type="submit" value="View items">
</form>
    <%
if(request.getSession().getAttribute("cart") != null) {
ArrayList<ItemInfo> cart = (ArrayList<ItemInfo>) request.getSession().getAttribute("cart");
    for (int i = 0; i < cart.size(); i++) {
    %><div class="itemText">
        <h2><%=cart.get(i).getName()%></h2>
        <p><%=cart.get(i).getPrice()%> kr
        <p><%=cart.get(i).getDescr()%></p>
        <form action="./removefromcart">
            <button type="submit" name="itemId" value="<%=i%>" >Remove item</button>
        </form>
    </div><%
        }
    }
%>
</body>
</html>

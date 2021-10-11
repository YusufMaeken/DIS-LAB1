<%@ page import="UI.ItemInfo" %>
<%@ page import="java.util.Collection" %>
<%@ page import="BO.ItemHandler" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yusufabdi
  Date: 2021-10-07
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Item page</title>
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
            margin: 20px;
            border: 3px solid;
            border-color: #F0E68C;
            text-align: center;
            color: #696969;
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
        }
        .cart {
            text-align: center;
        }
        .logout {
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
    <h1>Webshop</h1>
    <p>Item list</p>
</div>
    <form class="cart" action="./viewcart">
        <input class="button" type="submit"  value="View cart">
    </form>

<%
    ArrayList<ItemInfo> itemInfoList = (ArrayList<ItemInfo>) request.getSession().getAttribute("itemList");
    for (int i = 0; i < itemInfoList.size(); i++) {
    %><div class="itemText">
        <h2><%=itemInfoList.get(i).getName()%></h2>
        <p><%=itemInfoList.get(i).getPrice()%> kr
           </p>
        <p><%=itemInfoList.get(i).getDescr()%></p>
        <%request.getSession().setAttribute(String.valueOf(i), itemInfoList.get(i));%>
        <form action="./addcart">
            <button type="submit" name="itemId" value="<%=i%>" >Add to cart</button>
        </form>
    </div>
       <% }%>
<form class="logout" action="./index.jsp">
    <input class="button" type="submit"  value="Log out">
</form>
</body>
</html>
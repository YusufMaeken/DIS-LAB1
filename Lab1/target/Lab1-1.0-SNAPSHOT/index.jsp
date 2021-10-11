<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        .button {
            font-family: Chalkduster, sans-serif;
            border-radius: 12px;
            font-size: 24px;
            color: #696969;
            padding: 10px 10px;
            text-align: center;
            display: inline-block;
            text-align: center;
            border: 3px solid;
            border-color: #696969;
            background-color: #F0E68C;
            position: absolute;
            top: 40%;
            right: 37.5%;
            transition-duration: 0.4s;
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
            width: 25%;

        }
        .button:hover {
            background-color: #FFFFF0;
            color: #696969;
            border-color: #696969;
        }

         body {
             font-family: Chalkduster, sans-serif;
             margin: 0;
             background-color: #FFFFF0;
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
        .wrapper {
            text-align: center;
        }



    </style>
</head>

<body>
<div class="header">
    <h1><%= "Welcome to our Webshop!" %></h1>
    <p>Please log in to view available items</p>
</div>

<div class="wrapper">
    <form action="getItems">
        <input class="button" type="submit" value="Log in" >
    </form>
</div>


</body>
</html>
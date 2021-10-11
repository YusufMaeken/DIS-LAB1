package Servlets;

import BO.ItemHandler;
import UI.ItemInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("cart", ItemHandler.getItemsByUserID(1));
        ArrayList<ItemInfo> cart;
        if(req.getSession().getAttribute("cart") != null) {
            cart = (ArrayList<ItemInfo>) req.getSession().getAttribute("cart");
        } else {
            cart = new ArrayList<>();
        }

        req.getSession().setAttribute("cart", cart);
        resp.sendRedirect("./cart.jsp");
    }
}

package Servlets;

import UI.ItemInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "AddCartServlet")
public class AddCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String Id = req.getParameter("itemId");
        ItemInfo product = (ItemInfo) req.getSession().getAttribute(Id);
        ArrayList<ItemInfo> cart;
        if(req.getSession().getAttribute("cart") != null) {
            cart = (ArrayList<ItemInfo>) req.getSession().getAttribute("cart");
        } else {
            cart = new ArrayList<>();
        }
        cart.add(product);

        req.getSession().setAttribute("cart", cart);
        resp.sendRedirect("./items.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Id = req.getParameter("itemId");

    }
}

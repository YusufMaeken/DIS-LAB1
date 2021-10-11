package Servlets;

import UI.ItemInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "RemoveCartServlet")
public class RemoveCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Id = Integer.parseInt(req.getParameter("itemId"));
        ArrayList<ItemInfo> cart = (ArrayList<ItemInfo>) req.getSession().getAttribute("cart");
        cart.remove(Id);

        req.getSession().setAttribute("cart", cart);
        resp.sendRedirect("./cart.jsp");
    }
}

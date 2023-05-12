package com.example.module3_javaweb.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ProductDiscountServlet", value = "/discount")
public class ProductDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product_iscount_calculator/product_discount.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        request.setAttribute("productDescription", productDescription);
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        request.setAttribute("listPrice", listPrice);
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
        request.setAttribute("discountPercent", discountPercent);
        request.getRequestDispatcher("product_iscount_calculator/discount_calculator.jsp")
                .forward(request, response);
    }
}

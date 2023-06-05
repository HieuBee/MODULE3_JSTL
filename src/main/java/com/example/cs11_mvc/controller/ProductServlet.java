package com.example.cs11_mvc.controller;

import com.example.cs11_mvc.bean.Product;
import com.example.cs11_mvc.service.ProductService;
import com.example.cs11_mvc.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "update":
                showUpdate(request, response);
                break;
            case "detail":
                showDetail(request, response);
                break;
            case "delete":
                showDeleteProduct(request,response);
                break;
            default:
                showList(request, response);
        }
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idDetail = Integer.parseInt(request.getParameter("id"));
        Product product = service.findById(idDetail);
        request.setAttribute("product", product);
        request.getRequestDispatcher("cs11_mvc/product/update.jsp")
                .forward(request, response);
    }

    private void showDeleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idDetail = Integer.parseInt(request.getParameter("id"));
        if (service.delete(idDetail)){
            response.sendRedirect("/product");
        }
    }

    private void showDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idDetail = Integer.parseInt(request.getParameter("id"));
        Product product = service.findById(idDetail);
        request.setAttribute("product", product);
        request.getRequestDispatcher("cs11_mvc/product/detail.jsp")
                .forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("cs11_mvc/product/create.jsp")
                .forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = service.findAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("cs11_mvc/product/list.jsp")
                .forward(request, response);
    }

    private ProductService service = new ProductServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                doCreate(request, response);
                break;
            case "update":
                doUpdate(request, response);
                break;
            default:
                response.sendRedirect("/product?action=list");
        }
    }

    private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String origin = request.getParameter("origin");
        Product product = new Product(id, name, price, quantity, origin);
        if (service.update(product)) {
            response.sendRedirect("/product");
        }
    }

    private void doCreate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String origin = request.getParameter("origin");
        Product product = new Product(id, name, price, quantity, origin);
        if (service.save(product)) {
            response.sendRedirect("/product");
        } else {
            String errorMsg = "ID of product existed";
            request.setAttribute("error", errorMsg);
            request.getRequestDispatcher("cs11_mvc/product/create.jsp")
                    .forward(request, response);
        }
    }
}

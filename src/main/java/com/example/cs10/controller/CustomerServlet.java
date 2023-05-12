package com.example.cs10.controller;

import com.example.cs10.entity.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    final String IMG1 = "https://gamek.mediacdn.vn/133514250583805952/2020/1/7/photo-1-15783908015661107535592.jpg";
    final String IMG2 = "https://gamek.mediacdn.vn/133514250583805952/2020/1/7/photo-1-1578390891465482599205.jpg";
    final String IMG3 = "https://gamek.mediacdn.vn/133514250583805952/2020/1/7/811439621326995881994564971093550386118656n-15783907670931825079046.jpg";
    final String IMG4 = "https://gamek.mediacdn.vn/133514250583805952/2020/1/7/photo-1-157839080814245297685.jpg";
    final String IMG5 = "https://gamek.mediacdn.vn/133514250583805952/2020/1/7/photo-1-1578390832798205906195.jpg";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Kimetsu No Yaiba A", LocalDate.of(1983, 8, 20), "Ha Noi", IMG1));
        customerList.add(new Customer(2, "Kimetsu No Yaiba B", LocalDate.of(1983, 8, 21), "Ha Noi", IMG2));
        customerList.add(new Customer(3, "Kimetsu No Yaiba C", LocalDate.of(1983, 8, 22), "Ha Noi", IMG3));
        customerList.add(new Customer(4, "Kimetsu No Yaiba D", LocalDate.of(1983, 8, 17), "Ha Noi", IMG4));
        customerList.add(new Customer(5, "Kimetsu No Yaiba E", LocalDate.of(1983, 8, 19), "Ha Noi", IMG5));
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/cs10_customer/index.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

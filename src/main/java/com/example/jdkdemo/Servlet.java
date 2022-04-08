//package com.example.jdkdemo;
//
//import org.hibernate.service.spi.InjectService;
//
//import javax.inject.Inject;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(urlPatterns = "/data")
//public class Servlet extends HttpServlet {
//
//    @Inject
//    private ExampleBean exampleBean;
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().append("Session: " + exampleBean.doLogin());
//        resp.getWriter().append("\r\nLogin: " + exampleBean.getLogin());
//        resp.getWriter().append("\r\nPassword: " + exampleBean.getPassword());
//    }
//}

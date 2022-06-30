package com.lun.bito.api.demo.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/dataModel/*"})
public class DataModelController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) {
        String pathInfo = request.getPathInfo();
        if (pathInfo == null) {
            return;
        }

        try {
            if ("/getData".equals(pathInfo)) {
                getData(request, response);
            } else {
                System.out.println("error");
            }

        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void getData(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String input = request.getParameter("");

        // TODO 1. call quiz.test.model.DataModelBO.get
        // TODO 2. send response with JSON
    }

}

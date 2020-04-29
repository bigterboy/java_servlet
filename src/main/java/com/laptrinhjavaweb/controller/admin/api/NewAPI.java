package com.laptrinhjavaweb.controller.admin.api;

import com.laptrinhjavaweb.utils.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/api-admin-new")
public class NewAPI extends HttpServlet {

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");

        HttpUtil.of(request.getReader());

    }
    protected void doPut(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

    }
    protected void doDelete(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

    }

}

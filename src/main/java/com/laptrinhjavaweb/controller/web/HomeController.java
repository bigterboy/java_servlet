package com.laptrinhjavaweb.controller.web;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.INewService;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/trang-chu","/dang-nhap","/thoat"})
public class HomeController extends HttpServlet {

    @Inject
    private ICategoryService categoryService;

    @Inject
    private INewService newService;




	private static final long serialVersionUID = 2686801510274002166L;

	
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

//        final UserModel userModel = new UserModel();



//        request.setAttribute("categories",categoryService.findAll());
////        request.setAttribute("news",newService.findByCategoryId(categoryId));
//
//
////        request.setAttribute("model", newService.findByCategoryId(categoryId));
//
//        request.setAttribute("test",newService.save(newModel));


        String action = request.getParameter("action");

        if(action != null && action.equals("login") ){
            RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
            rd.forward(request, response);
        }else if(action != null && action.equals("logout") ){

        }else{
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
            rd.forward(request, response);
        }

    }

    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if(action != null && action.equals("login") ){
//            UserModel userModel = FormU
//        }
    	
    }
}

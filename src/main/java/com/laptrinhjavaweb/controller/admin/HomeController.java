package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;

import java.io.IOException;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/admin-new-list"})
public class HomeController extends HttpServlet {

    @Inject
    private INewService newService;

	private static final long serialVersionUID = 3461613811928964367L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        NewModel newModel = new NewModel();
        String pageStr = request.getParameter("page");
        String maxPageItemStr = request.getParameter("maxPageItem");

        if(pageStr != null){
            newModel.setPage(Integer.parseInt(pageStr));
        }else {
            newModel.setPage(1);
        }
        if(maxPageItemStr != null){
            newModel.setMaxPageItem(Integer.parseInt(maxPageItemStr));
        }

        Integer offset = (newModel.getPage() -1) * newModel.getMaxPageItem();

        newModel.setListResult(newService.findAll(offset,newModel.getMaxPageItem()));
        newModel.setTotalItem(newService.getTotalItem());
        newModel.setTotalPage(newModel.getTotalItem()/newModel.getMaxPageItem());
        request.setAttribute("model",newModel);

        RequestDispatcher rd = request.getRequestDispatcher("/views/admin/news/list.jsp");
        rd.forward(request, response);
    }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }

}

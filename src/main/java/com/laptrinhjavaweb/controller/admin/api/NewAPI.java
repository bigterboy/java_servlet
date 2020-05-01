package com.laptrinhjavaweb.controller.admin.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.utils.HttpUtil;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/api-admin-new")
public class NewAPI extends HttpServlet {

    /**
	 *
	 */
	private static final long serialVersionUID = 181005237206981088L;

	@Inject
    private INewService newService;


    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

//        ObjectMapper mapper = new ObjectMapper();

        ObjectMapper mapper = new ObjectMapper();


        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        request.getReader();
        NewModel newModel =  HttpUtil.of(request.getReader()).toModel(NewModel.class);
        newModel =  newService.save(newModel);


        mapper.writeValue(response.getOutputStream() ,newModel);

    }
    protected void doPut(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

    }
    protected void doDelete(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

    }

}

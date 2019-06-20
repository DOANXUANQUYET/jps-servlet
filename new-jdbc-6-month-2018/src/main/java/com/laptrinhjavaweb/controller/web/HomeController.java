package com.laptrinhjavaweb.controller.web;

//import com.laptrinhjavaweb.model.UserModel;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.service.ICategoryService;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	@Inject
	private ICategoryService categoryService;
	
//	@Inject
//	private INewService newiService;

//	@Inject
//	private INewService newService;

	private static final long serialVersionUID = 2686801510274002166L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		Long categoryId = 1L;

		// tao doi tuong userModel set full name
		// UserModel userModel = new UserModel();
		// userModel.setFullName("Hello World");
		// tao bien ten model truyen vao request de chuyen qua jsp (bien object
		// userModel dat ten model, co cac thuoc tinh cua userModel)
		// request.setAttribute("model",userModel);
//		request.setAttribute("news",newService.findByCategoryId(categoryId));
		
//		String title = "Bai viet 4";
//		String content = "bai viet 4";
//		Long categoryId = 1L;
//		NewModel newModel = new NewModel();
//		newModel.setTitle(title);
//		newModel.setContent(content);
//		newModel.setCategoryId(categoryId);
//		newService.save(newModel);
		request.setAttribute("category", categoryService.findAll());
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}

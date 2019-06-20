package com.laptrinhjavaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.utils.HttpUtil;

@WebServlet(urlPatterns = { "/api-admin-new" })
public class NewAPI extends HttpServlet{

	private static final long serialVersionUID = -915988021506484384L;
	
	@Inject
	private INewService newService;
	
	// post -> method them moi du lieu
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//dinh dang utf-8 de nhan du lieu tieng viet, tieng nhan ..v..v. tu client gui len qua request
		req.setCharacterEncoding("UTF-8");
		//dinh dang du lieu tra ve cliet kieu jison qua response
		resp.setContentType("application");
		//chuyen du lieu ve kieu string trong class HttpUtil
		HttpUtil httpUtil = HttpUtil.of(req.getReader());
		NewModel newModel = httpUtil.toModel(NewModel.class);
		newModel = newService.save(newModel);
		System.out.print(newModel);
		
		//tao object mapper de chuyen objedct ket qua ve lai kieu jison
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(resp.getOutputStream(), newModel);
		
	}
	

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
//	// put -> method update du lieu
//	@Override
//	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		//dinh dang utf-8 de nhan du lieu tieng viet, tieng nhan ..v..v. tu client gui len qua request
//		req.setCharacterEncoding("UTF-8");
//		//dinh dang du lieu tra ve cliet kieu jison qua response
//		resp.setContentType("application");
//		//chuyen du lieu ve kieu string trong class HttpUtil
//		HttpUtil httpUtil = HttpUtil.of(req.getReader());
//		NewModel updateNew = httpUtil.toModel(NewModel.class);
//		updateNew = newService.update(updateNew);
//		System.out.print(updateNew);
//		
//		//tao object mapper de chuyen objedct ket qua ve lai kieu jison
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.writeValue(resp.getOutputStream(), newModel);
//	}
	
	// put -> method update du lieu
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//dinh dang utf-8 de nhan du lieu tieng viet, tieng nhan ..v..v. tu client gui len qua request
		req.setCharacterEncoding("UTF-8");
		//dinh dang du lieu tra ve cliet kieu jison qua response
		resp.setContentType("application");
		//chuyen du lieu ve kieu string trong class HttpUtil
		HttpUtil httpUtil = HttpUtil.of(req.getReader());
		NewModel updateNew = httpUtil.toModel(NewModel.class);
		updateNew = newService.update(updateNew);
		System.out.print(updateNew);
		
		//tao object mapper de chuyen objedct ket qua ve lai kieu jison
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(resp.getOutputStream(), 		updateNew);
	}

}

package jp.vn.yuanyuan.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.vn.yuanyuan.constant.SystemConstant;
import jp.vn.yuanyuan.model.NewModel;
import jp.vn.yuanyuan.service.INewService;
import jp.vn.yuanyuan.utils.FormUtil;

@WebServlet(urlPatterns={"/item"})
public class ItemPage extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private INewService newService;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException{
		
		NewModel model = FormUtil.toModel(NewModel.class, request);
		model = newService.findOne(model.getId());
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/item.jsp");
		rd.forward(request, response);
		
		
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
			
			
		}

}

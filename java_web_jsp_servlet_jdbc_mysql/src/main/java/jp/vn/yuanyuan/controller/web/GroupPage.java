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
import jp.vn.yuanyuan.paging.PageRequest;
import jp.vn.yuanyuan.paging.Pageble;
import jp.vn.yuanyuan.service.ICategoryService;
import jp.vn.yuanyuan.service.INewService;
import jp.vn.yuanyuan.sort.Sorter;
import jp.vn.yuanyuan.utils.FormUtil;

@WebServlet(urlPatterns= {"/group"})
public class GroupPage extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Inject 
	private ICategoryService categoryService;
	@Inject
	private INewService newService;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		
		String category = request.getParameter("category");
		if(category!=null && category.equals("mini")) {
			NewModel model =FormUtil.toModel(NewModel.class, request);
			Pageble pageble = new PageRequest(model.getPage(),model.getMaxPageItem(),
					new Sorter(model.getSortName(),model.getSortBy()));
			model.setListResult(newService.findAll(pageble));
			request.setAttribute(SystemConstant.MODEL,model);
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/group.jsp");
			rd.forward(request, response);
		}else if(category!=null && category.equals("compact")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/group.jsp");
			rd.forward(request, response);
		}else if(category!=null && category.equals("midsize")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/group.jsp");
			rd.forward(request, response);
		}else if(category!=null && category.equals("large")) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/group.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("categories",categoryService.findAll());
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
			rd.forward(request, response);
		}
		
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		
	}
}

package com.marondal.servlet.database.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.servlet.common.MysqlService;

@WebServlet("/database/favorite/insert")
public class FavoriteInserController extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String site = request.getParameter("site");
		String url = request.getParameter("url");
		
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		mysqlService.update("INSERT INTO `favorite` (`name`, `url`) \r\n"
				+ "VALUE \r\n"
				+ "('" + site + "', '" + url + "');");
		
		response.sendRedirect("/database/favorite-list.jsp");
	}

}

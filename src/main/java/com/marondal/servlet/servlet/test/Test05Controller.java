package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")
public class Test05Controller extends HttpServlet {
//	
//	public void printGugu(int dan) {
//		for(int i = 1; i <= 9; i++) {			
//			System.out.println(dan + " X " + i + " = " + (dan * i));
//		}
//	}
// 	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 구구단을 리스트 태그로 response에 담기
		
		String number = request.getParameter("number");
		int dan = Integer.parseInt(number);
		

		out.println("<html><head><title>구구단</title></head><body><ul>");
		
		for(int i = 1; i <= 9; i++) {			
			out.println("<li>" + dan + " X " + i + " = " + (dan * i) + "</li>");
		}
		out.println("</ul></body></html>");
		
	}

}

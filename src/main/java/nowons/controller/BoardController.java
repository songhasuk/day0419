package nowons.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	System.out.println("/board/ 시작하는 모든 주소를 처리합니다");
	
	// 페이지 연결 설정
	
	System.out.println("서버 요청주소"+request.getRequestURI());
	
	String uri =request.getRequestURI();
	
	if(uri.equals("/day0419/board/list")) {
		String path = "/WEB-INF/board/list.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request,response);
	}
	else if (uri.equals("/day0419/board/write")) {
		String path = "/WEB-INF/board/lwrite.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request,response);
	}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

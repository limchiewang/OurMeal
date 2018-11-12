package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationSyncServlet_02")
public class ApplicationSyncServlet_02 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 동기화 처리
		// 서로 다른 서블릿 객체에서는 동기화가 적용되지 않습니다.
		// (다른 서블릿 객체에 대해서 동기화가 처리되었다 하더라도,
		// 현재 서블릿 객체에는 영향을 미치지 않습니다.)
		
		System.out.println("ApplicationSyncServlet_02\n");		
	}

}












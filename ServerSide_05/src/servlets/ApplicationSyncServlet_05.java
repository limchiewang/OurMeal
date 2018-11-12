package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationSyncServlet_05")
public class ApplicationSyncServlet_05 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext application = getServletContext();
		
		System.out.printf("Before using application(ApplicationSyncServlet_05)\n");
		
		System.out.printf("using application(ApplicationSyncServlet_05)\n");
			
		// 동기화 코드가 작성되지 않으면, 다른 서블릿, JSP 에서
		// 동기화 처리를 하여도 블럭 상태에 빠지지 않습니다.
		// 아래의 코드는 ApplicationSyncServlet_03 과 같이 실행하여도
		// 즉시 실행되어 처리되는것을 확인할 수 있습니다.
		// (다른 서블릿에서 application 객체를 수정하기 위해 동기화를 처리하면
		// 반드시 현재 서블릿에서도 application 객체를 이용하여 동기화를
		// 해야만 안전하게 값을 수정할 수 있습니다.)
		// 단, 동일한 name 에 대해서 값을 수정하고자 하는 경우
		// 만약 서로 다른 name 값에 대해서 수정하고자 하는 경우에는
		// this 를 사용하여 동기화를 처리할 수 있습니다.
		application.setAttribute("num", 10);
		
		System.out.printf("After using application(ApplicationSyncServlet_05)\n");
		
	}

}












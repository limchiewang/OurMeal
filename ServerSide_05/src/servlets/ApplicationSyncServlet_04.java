package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationSyncServlet_04")
public class ApplicationSyncServlet_04 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 웹 컨테이너에서의 동기화 처리
		// ServletContext 타입(application 객체)을 동기화 객체로 지정하여 
		// 동기화를 처리하게 되면 웹 컨테이너에 존재하는 모든

		// application 객체를 참조하는 방법
		ServletContext application = getServletContext();
		
		System.out.printf("Before synchronized(ApplicationSyncServlet_04)\n");
		
		// 현재 웹 컨테이너 내부에 단 하나만 존재하는
		// application 객체를 동기화 대상으로 지정하는 방법
		// (현재 웹 컨테이너 내부의 모든 서블릿, JSP에서 
		// application 객체를 사용하는 코드(동기화된)는 블럭 상태로 빠집니다.)
		synchronized( application ) {
			System.out.printf("synchronized(ApplicationSyncServlet_04)\n");
			
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
		System.out.printf("After synchronized(ApplicationSyncServlet_04)\n");
		
	}

}












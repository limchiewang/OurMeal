package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationSyncServlet_01")
public class ApplicationSyncServlet_01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 동기화 처리
		// synchronized 키워드를 사용하여 특정 메소드, 코드 블럭을
		// 하나의 쓰레드가 선점하여 사용할 수 있도록 처리하는 문법
		// 1. 메소드 자체를 동기화 처리하는 방법
		//  - 메소드의 선언부에 synchronized 키워드를 사용하여
		//    해당 메소드의 전체를 동기화 영역으로 지정
		//  - public synchronized void disp() {}
		// 2. 특정 블럭의 코드를 동기화 처리하는 방법
		//  - 특정 코드 영역을 중괄호로 묶은 후, 해당 영역을
		//    synchronized 키워드를 사용하여 등기화 영역으로 지정
		//  - 메소드 내부에 작성하는 방법
		//  - synchronized( 동기화 객체 ) {}
		//  - 동기화 객체 : 현재 실행 중인 쓰레드가 선점하고자 하는 객체
		
		System.out.printf("Before synchronized(%s)\n", 
				Thread.currentThread().getName());
		
		// 현재 서블릿 객체를 동기화의 대상으로 지정하여 
		// 동기화를 처리하는 방법
		// 만약, 특정 클라이언트가 현재 서블릿을 실행하여
		// 아래의 동기화 블럭 내부로 진입하게 되면, 
		// 다른 클라이언트들은 현재 서블릿을 사용할 수 없게 됩니다.
		synchronized(this) {
			System.out.printf("synchronized(%s)\n", 
					Thread.currentThread().getName());
			
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
		System.out.printf("After synchronized(%s)\n", 
				Thread.currentThread().getName());
		
	}

}












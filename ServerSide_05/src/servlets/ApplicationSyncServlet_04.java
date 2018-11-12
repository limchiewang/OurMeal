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

		// �� �����̳ʿ����� ����ȭ ó��
		// ServletContext Ÿ��(application ��ü)�� ����ȭ ��ü�� �����Ͽ� 
		// ����ȭ�� ó���ϰ� �Ǹ� �� �����̳ʿ� �����ϴ� ���

		// application ��ü�� �����ϴ� ���
		ServletContext application = getServletContext();
		
		System.out.printf("Before synchronized(ApplicationSyncServlet_04)\n");
		
		// ���� �� �����̳� ���ο� �� �ϳ��� �����ϴ�
		// application ��ü�� ����ȭ ������� �����ϴ� ���
		// (���� �� �����̳� ������ ��� ����, JSP���� 
		// application ��ü�� ����ϴ� �ڵ�(����ȭ��)�� �� ���·� �����ϴ�.)
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












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
			
		// ����ȭ �ڵ尡 �ۼ����� ������, �ٸ� ����, JSP ����
		// ����ȭ ó���� �Ͽ��� �� ���¿� ������ �ʽ��ϴ�.
		// �Ʒ��� �ڵ�� ApplicationSyncServlet_03 �� ���� �����Ͽ���
		// ��� ����Ǿ� ó���Ǵ°��� Ȯ���� �� �ֽ��ϴ�.
		// (�ٸ� �������� application ��ü�� �����ϱ� ���� ����ȭ�� ó���ϸ�
		// �ݵ�� ���� ���������� application ��ü�� �̿��Ͽ� ����ȭ��
		// �ؾ߸� �����ϰ� ���� ������ �� �ֽ��ϴ�.)
		// ��, ������ name �� ���ؼ� ���� �����ϰ��� �ϴ� ���
		// ���� ���� �ٸ� name ���� ���ؼ� �����ϰ��� �ϴ� ��쿡��
		// this �� ����Ͽ� ����ȭ�� ó���� �� �ֽ��ϴ�.
		application.setAttribute("num", 10);
		
		System.out.printf("After using application(ApplicationSyncServlet_05)\n");
		
	}

}












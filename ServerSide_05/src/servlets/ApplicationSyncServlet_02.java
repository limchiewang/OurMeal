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

		// ����ȭ ó��
		// ���� �ٸ� ���� ��ü������ ����ȭ�� ������� �ʽ��ϴ�.
		// (�ٸ� ���� ��ü�� ���ؼ� ����ȭ�� ó���Ǿ��� �ϴ���,
		// ���� ���� ��ü���� ������ ��ġ�� �ʽ��ϴ�.)
		
		System.out.println("ApplicationSyncServlet_02\n");		
	}

}












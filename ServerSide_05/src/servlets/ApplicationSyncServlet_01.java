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

		// ����ȭ ó��
		// synchronized Ű���带 ����Ͽ� Ư�� �޼ҵ�, �ڵ� ����
		// �ϳ��� �����尡 �����Ͽ� ����� �� �ֵ��� ó���ϴ� ����
		// 1. �޼ҵ� ��ü�� ����ȭ ó���ϴ� ���
		//  - �޼ҵ��� ����ο� synchronized Ű���带 ����Ͽ�
		//    �ش� �޼ҵ��� ��ü�� ����ȭ �������� ����
		//  - public synchronized void disp() {}
		// 2. Ư�� ���� �ڵ带 ����ȭ ó���ϴ� ���
		//  - Ư�� �ڵ� ������ �߰�ȣ�� ���� ��, �ش� ������
		//    synchronized Ű���带 ����Ͽ� ���ȭ �������� ����
		//  - �޼ҵ� ���ο� �ۼ��ϴ� ���
		//  - synchronized( ����ȭ ��ü ) {}
		//  - ����ȭ ��ü : ���� ���� ���� �����尡 �����ϰ��� �ϴ� ��ü
		
		System.out.printf("Before synchronized(%s)\n", 
				Thread.currentThread().getName());
		
		// ���� ���� ��ü�� ����ȭ�� ������� �����Ͽ� 
		// ����ȭ�� ó���ϴ� ���
		// ����, Ư�� Ŭ���̾�Ʈ�� ���� ������ �����Ͽ�
		// �Ʒ��� ����ȭ �� ���η� �����ϰ� �Ǹ�, 
		// �ٸ� Ŭ���̾�Ʈ���� ���� ������ ����� �� ���� �˴ϴ�.
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












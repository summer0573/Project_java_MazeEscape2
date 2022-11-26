package ME_project;

import java.sql.Connection;
import java.sql.DriverManager;
public class Connect3 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "";
		String id = "";
		String pwd = "";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url+dbname, id, pwd);
			System.out.println("������ ���̽� ���� ����!!");
		} catch (Exception e) {
			System.out.println("������ ���̽� �������!!");
			e.printStackTrace();
		}finally {
			try {
				if(con != null)
					con.close();
					System.out.println("������ ���̽� ���� ����!");
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}